package com.store.dto;

import java.util.List;

public class SaleChartDTO {
    public String[] dates;
    public List<ProductSeries> products;

    public static class ProductSeries {
        public String name;
        public int[] quantities;
        public ProductSeries(String name, int[] quantities) {
            this.name = name;
            this.quantities = quantities;
        }
    }

    public SaleChartDTO(String[] dates, List<ProductSeries> products) {
        this.dates = dates;
        this.products = products;
    }
}
