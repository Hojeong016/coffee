package com.example.coffee.domain;

import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDate;
import java.util.Locale;
import java.util.UUID;

@Getter
@Setter
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class OrderItems {

    @Id
    @GeneratedValue
    private long id;

    @Column(name = "order_id")
    private long orderId;

    @Column(name = "product_id")
    private long productId;

    @Column(name = "category")
    private Category category;

    @Column(name = "pricce")
    private long price;

    @Column(name = "quantity")
    private int quantity;
}
