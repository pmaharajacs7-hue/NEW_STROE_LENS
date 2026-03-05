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

    private Long productId;

    private Long shopId;

    private Integer quantity;

    private Double amount;

    private LocalDate date;
}
