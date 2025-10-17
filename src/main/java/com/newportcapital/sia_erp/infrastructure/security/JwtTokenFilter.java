package com.newportcapital.sia_erp.infrastructure.security;

import com.newportcapital.sia_erp.adapter.web.authentication.dto.UserTokenPayload;
import com.newportcapital.sia_erp.application.user.port.in.GetUsersUseCase;
import com.newportcapital.sia_erp.domain.model.user.User;
import com.newportcapital.sia_erp.domain.model.user.UserId;
import jakarta.servlet.FilterChain;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.web.filter.OncePerRequestFilter;

import java.io.IOException;
import java.util.List;
import java.util.Objects;

public class JwtTokenFilter extends OncePerRequestFilter {
    private final JwtTokenProvider jwtTokenProvider;
    private final GetUsersUseCase getUsersUseCase;
    public JwtTokenFilter(JwtTokenProvider jwtTokenProvider, GetUsersUseCase getUsersUseCase) {
        this.jwtTokenProvider = jwtTokenProvider;
        this.getUsersUseCase = getUsersUseCase;
    }

    @Override
    protected void doFilterInternal(HttpServletRequest request,
                                    HttpServletResponse response,
                                    FilterChain filterChain) throws ServletException, IOException {

        String path = ((HttpServletRequest) request).getServletPath();

        //Avoid applying filters to public routes
        System.out.println("++++++++++++++++++++++++++++++++++++++++++++++");
        System.out.println("path: " + path);
        System.out.println("++++++++++++++++++++++++++++++++++++++++++++++");

        if (path.startsWith("/auth/login") || path.startsWith("/swagger-ui") || path.startsWith("/v3/api-docs")) {
            System.out.println("ssssssssssssssssssss: ");
            filterChain.doFilter(request, response);
            return;
        }
        String token = resolveToken(request);
        try{
            UserTokenPayload userTokenPayload = jwtTokenProvider.parseToken(token);
            User userModel =getUsersUseCase.findById(new UserId(userTokenPayload.getId()));

            String username = jwtTokenProvider.getUsername(token);
            if(!userTokenPayload.getEditionDateOrDefault().equals(userModel.getEditionDate().toString()) ||
                    !username.equals(userModel.getUser()) ||
                    !Objects.equals(userTokenPayload.getId(), userModel.getId().getId())
            ){
                throw new Exception("Invalid token");
            }
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
