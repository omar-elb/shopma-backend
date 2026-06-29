package com.shopma.backend.dto.response;

import lombok.*;

@Data @AllArgsConstructor
public class JwtResponse {
    private String token;
    private Long id;
    private String name;
    private String email;
}
