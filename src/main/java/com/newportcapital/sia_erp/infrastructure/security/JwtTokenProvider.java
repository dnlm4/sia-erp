package com.newportcapital.sia_erp.infrastructure.security;


import com.fasterxml.jackson.databind.ObjectMapper;
import com.newportcapital.sia_erp.adapter.web.authentication.dto.UserTokenPayload;
import io.jsonwebtoken.*;
import io.jsonwebtoken.security.Keys;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import java.util.Date;

@Component
public class JwtTokenProvider {
    @Value("${security.jwt.secret}")
    private String secretKey;

    @Value("${security.jwt.expiration}")
    private long validityInMilliseconds;

    //public String createToken(String username, List<String> roles) {
    public String createToken(UserTokenPayload userTokenPayload) {
        Claims claims = Jwts.claims().setSubject(userTokenPayload.getUser());
        claims.put("id",userTokenPayload.getId());;
        claims.put("editionDate",userTokenPayload.getEditionDateOrDefault());;

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
                (Integer) claims.get("id"),
                (String)claims.get("user"),
                (String) claims.get("editionDate")
        );
    }
}
