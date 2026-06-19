package com.shopma.backend.entity;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "products")
@Data @NoArgsConstructor @AllArgsConstructor @Builder
public class Product {

    @Id
    private Long id;

    private String title;
    private Double price;

    @Column(columnDefinition = "TEXT")
    private String description;

    private String category;
    private String image;
    private Double rating;
    private Integer ratingCount;
}