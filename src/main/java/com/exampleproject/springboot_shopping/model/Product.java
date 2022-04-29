package com.exampleproject.springboot_shopping.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NonNull;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@AllArgsConstructor
@Document(collection = "products")
public class Product
{
    @Id
    private String id;
    private @NonNull String name;
    private @NonNull Double value;
    private Integer quantity;
    private String brand;
    private String description;
    private String productAvatar;
    private String productCover;

    public Product()
    {
        this.quantity = 1;
    }

    public Product( String nme, Double val, Integer amount, String descText, String bName )
    {
        this.name = nme;
        this.value = val;
        this.quantity = amount;
        this.description = descText;
        this.brand = bName;
    }
}