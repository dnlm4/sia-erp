package com.newportcapital.sia_erp.infrastructure.security;

import com.newportcapital.sia_erp.adapter.web.authentication.dto.UserTokenPayload;
import com.newportcapital.sia_erp.domain.repository.UserRepository;
import com.newportcapital.sia_erp.infrastructure.user.persistance.entity.UserEntity;
import jakarta.servlet.FilterChain;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.web.filter.OncePerRequestFilter;

import java.io.IOException;
import java.util.List;

public class JwtTokenFilter extends OncePerRequestFilter {
    private final JwtTokenProvider jwtTokenProvider;
    private final UserRepository userRepository;
    public JwtTokenFilter(JwtTokenProvider jwtTokenProvider, UserRepository userRepository) {
        this.jwtTokenProvider = jwtTokenProvider;
        this.userRepository = userRepository;
    }

    @Override
    protected void doFilterInternal(HttpServletRequest request,
                                    HttpServletResponse response,
                                    FilterChain filterChain) throws ServletException, IOException {

        String path = ((HttpServletRequest) request).getServletPath();

        //Avoid applying filters to public routes
        if (path.startsWith("/auth") || path.startsWith("/swagger-ui") || path.startsWith("/v3/api-docs")) {
            filterChain.doFilter(request, response);
            return;
        }
        String token = resolveToken(request);
        try{
            UserTokenPayload userTokenPayload = jwtTokenProvider.parseToken(token);

            UserEntity userEntity =userRepository.findById(userTokenPayload.getId());

            if(!userTokenPayload.getId().equals(userEntity.getId()) ||
                    !userTokenPayload.getPassword().equals(userEntity.getPassword()) ||
                    !userTokenPayload.getName().equals(userEntity.getName()) ||
                    !userTokenPayload.getPaternalSurname().equals(userEntity.getPaternalSurnameOrDefault()) ||
                    !userTokenPayload.getMaternalSurname().equals(userEntity.getMaternalSurnameOrDefault()) ||
                    !userTokenPayload.getEmail().equals(userEntity.getEmailOrDefault()) ||
                    !userTokenPayload.getRoleId().equals(userEntity.getRoleIdOrDefault()) ||
                    !userTokenPayload.getDepartmentId().equals(userEntity.getDepartmentIdOrDefault()) ||
                    !userTokenPayload.getPlaceId().equals(userEntity.getPlaceIdOrDefault()) ||
                    !userTokenPayload.getReceiveValidation().equals(userEntity.getReceiveValidationOrDefault()) ||
                    !userTokenPayload.getReceiveCreation().equals(userEntity.getReceiveCreationOrDefault()) ||
                    !userTokenPayload.getReceiveApproval1().equals(userEntity.getReceiveApproval1OrDefault()) ||
                    !userTokenPayload.getReceiveApproval2().equals(userEntity.getReceiveApproval2OrDefault()) ||
                    !userTokenPayload.getReceiveValidation().equals(userEntity.getReceiveSalesValidationOrDefault()) ||
                    !userTokenPayload.getReceiveSecuritySale().equals(userEntity.getReceiveSecuritySaleOrDefault())
            ){
                throw new Exception("Invalid token");
            }
            String username = jwtTokenProvider.getUsername(token);
            UsernamePasswordAuthenticationToken auth =
                    new UsernamePasswordAuthenticationToken(username, null, List.of());
            SecurityContextHolder.getContext().setAuthentication(auth);
        }catch(Exception e){
            SecurityContextHolder.clearContext();
            response.sendError(HttpServletResponse.SC_UNAUTHORIZED);
            return;
        }

        filterChain.doFilter(request, response);
    }

    private String resolveToken(HttpServletRequest request) {
        String bearer = request.getHeader("Authorization");
        if (bearer != null && bearer.startsWith("Bearer ")) {
            return bearer.substring(7);
        }
        return null;
    }
}
