package com.newportcapital.sia_erp.infrastructure.security;


import com.fasterxml.jackson.databind.ObjectMapper;
import com.newportcapital.sia_erp.adapter.web.authentication.dto.UserTokenPayload;
import io.jsonwebtoken.*;
import io.jsonwebtoken.security.Keys;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import java.util.Date;
import java.util.Map;

@Component
public class JwtTokenProvider {
    @Value("${security.jwt.secret}")
    private String secretKey;

    @Value("${security.jwt.expiration}")
    private long validityInMilliseconds;

    //public String createToken(String username, List<String> roles) {
    public String createToken(UserTokenPayload userTokenPayload) {
        Claims claims = Jwts.claims().setSubject(userTokenPayload.getUser());
        claims.put("id",userTokenPayload.getId());
        claims.put("password",userTokenPayload.getPassword());
        claims.put("name",userTokenPayload.getName());
        claims.put("paternalSurname",userTokenPayload.getPaternalSurname());
        claims.put("maternalSurname",userTokenPayload.getMaternalSurname());
        claims.put("email",userTokenPayload.getEmail());
        claims.put("roleId",userTokenPayload.getRoleId());
        claims.put("departmentId",userTokenPayload.getDepartmentId());
        claims.put("placeId",userTokenPayload.getPlaceId());
        claims.put("receiveValidation",userTokenPayload.getReceiveValidation());
        claims.put("receiveCreation",userTokenPayload.getReceiveCreation());
        claims.put("receiveApproval1",userTokenPayload.getReceiveApproval1());
        claims.put("receiveApproval2",userTokenPayload.getReceiveApproval2());
        claims.put("receiveSalesValidation",userTokenPayload.getReceiveSalesValidation());
        claims.put("receiveSecuritySale",userTokenPayload.getReceiveSecuritySale());

        Date now = new Date();
        Date validity = new Date(now.getTime() + validityInMilliseconds);

        return Jwts.builder()
                .setClaims(claims)
                .setIssuedAt(now)
                .setExpiration(validity)
                .signWith(Keys.hmacShaKeyFor(secretKey.getBytes()), SignatureAlgorithm.HS256)
                .compact();
    }
    public boolean validateToken(String token) {
        try {
            Jws<Claims> claims = Jwts.parserBuilder()
                    .setSigningKey(secretKey.getBytes())
                    .build()
                    .parseClaimsJws(token);

            return !claims.getBody().getExpiration().before(new Date());
        } catch (JwtException | IllegalArgumentException e) {
            return false;
        }
    }

    public String getUsername(String token) {
        return Jwts.parserBuilder()
                .setSigningKey(secretKey.getBytes())
                .build()
                .parseClaimsJws(token)
                .getBody()
                .getSubject();
    }
    public UserTokenPayload parseToken(String token) {
        Claims claims = Jwts.parserBuilder()
                .setSigningKey(Keys.hmacShaKeyFor(secretKey.getBytes()))
                .build()
                .parseClaimsJws(token)
                .getBody();


        return new UserTokenPayload(
                (Integer)claims.get("id"),
                (String)claims.get("user"),
                (String)claims.get("password"),
                (String)claims.get("name"),
                (String)claims.get("paternalSurname"),
                (String)claims.get("maternalSurname"),
                (String)claims.get("email"),
                (Integer)claims.get("roleId"),
                (Integer)claims.get("departmentId"),
                (Integer)claims.get("placeId"),
                (String)claims.get("receiveValidation"),
                (String)claims.get("receiveCreation"),
                (String)claims.get("receiveApproval1"),
                (String)claims.get("receiveApproval2"),
                (String)claims.get("receiveSalesValidation"),
                (String)claims.get("receiveSecuritySale")
        );
    }
}
