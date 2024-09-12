package com.example.coffee.domain;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.*;

@Getter
@Setter
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Product {

    @Id
    @GeneratedValue
    private Long productId;

    @Column(name = "product_name")
    private String productName;

    @Column(name = "description")
    private String Description;

    @Column(name = "price")
    private int Price;

    @Column(name = "category")
    private Category category;

}
