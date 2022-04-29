package com.exampleproject.springboot_shopping.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NonNull;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.List;

@Data
@AllArgsConstructor
@Document(collection = "cart_items")
public class CartItem
{
    @Id
    private String id;

    private @NonNull String customerId;
    private String productId;
}
