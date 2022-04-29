package com.exampleproject.springboot_shopping.service;

import com.exampleproject.springboot_shopping.dao.ProductRequest;
import com.exampleproject.springboot_shopping.model.Product;

import java.util.List;

public interface ProductService
{
        List<Product> findAll();

        Product findByName(String name);

        Product findProductsById(String id);

        Product saveProduct(Product product);

        void delete(String id);
}
