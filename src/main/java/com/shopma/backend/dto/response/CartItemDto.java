package com.shopma.backend.dto.response;

import lombok.*;

@Data @AllArgsConstructor @NoArgsConstructor
public class CartItemDto {
    private Long id;
    private ProductDto product;
    private Integer quantity;
    private Double total;
}
