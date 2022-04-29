package com.exampleproject.springboot_shopping.repository;

import com.exampleproject.springboot_shopping.model.Product;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ProductRepository extends MongoRepository<Product, String>
{
    List<Product> findAll();

    Product findByName(String name);

    Product findItemById(String id);
}