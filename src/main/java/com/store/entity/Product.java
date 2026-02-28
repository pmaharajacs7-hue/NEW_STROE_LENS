package com.store.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "product_details")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Product {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long proId;

    @Column(nullable = false)
    private String proName;

    @Column(nullable = false)
    private String pro_location;

    @Column(nullable = false)
    private Double pro_amount;

    @Column(nullable = false)
    private Integer pro_count;

    @Column(nullable = false)
    private Long shopId;
}