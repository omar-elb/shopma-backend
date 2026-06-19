package com.shopma.backend.entity;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "pickup_points")
@Data @NoArgsConstructor @AllArgsConstructor @Builder
public class PickupPoint {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;
    private String address;
    private Double latitude;
    private Double longitude;
}
