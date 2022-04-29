package com.exampleproject.springboot_shopping.dao;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ProductRequest extends BaseRequest
{
    private String name;
    private Double value;
    private Integer quantity;
}