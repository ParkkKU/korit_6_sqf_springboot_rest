package com.study.rest.dto;

import lombok.Data;

@Data
public class ReqProductDto {
    private String productName;
    private int price;
    private int size;
    private int sizeId;
    private int colorId;
}
