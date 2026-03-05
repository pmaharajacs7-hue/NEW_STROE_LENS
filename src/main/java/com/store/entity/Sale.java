package com.store.entity;

import jakarta.persistence.*;
import lombok.*;
import java.time.LocalDate;

@Entity
@Table(name = "sales_details")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Sale {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long saleId;

    @Column(nullable = false)
    private Long productId;
    @Column(nullable = false)
    private Long shopId;
    @Column(nullable = false)
    private Integer quantity;
    @Column(nullable = false)
    private Double amount;
    @Column(nullable = false)
    private LocalDate date;
}
