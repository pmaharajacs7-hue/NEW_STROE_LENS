package com.store.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class ProductDTO {
    private Long proId;
    private String proName;
    private String pro_location;
    private Double pro_amount;
    private Integer pro_count;
    private String stockStatus; // IN_STOCK, LOW_STOCK, OUT_OF_STOCK
}
