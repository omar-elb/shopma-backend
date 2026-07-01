package com.shopma.backend.dto.response;

import lombok.*;

@Data @AllArgsConstructor @NoArgsConstructor
public class ProductDto {
    private Long id;
    private String title;
    private Double price;
    private String description;
    private String category;
    private String image;
    private Double rating;
}
