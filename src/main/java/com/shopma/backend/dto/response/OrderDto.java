package com.shopma.backend.dto.response;

import lombok.*;

@Data @AllArgsConstructor @NoArgsConstructor
public class OrderDto {
    private Long id;
    private String date;
    private Integer nbArticles;
    private Double totalAmount;
    private String status;
}
