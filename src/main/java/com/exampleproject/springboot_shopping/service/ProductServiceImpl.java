package com.exampleproject.springboot_shopping.service;

import com.exampleproject.springboot_shopping.dao.ProductRequest;
import com.exampleproject.springboot_shopping.model.Product;
import com.exampleproject.springboot_shopping.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProductServiceImpl implements ProductService
{

    @Autowired
    private ProductRepository repo;

    @Override
    public List<Product> findAll() {
        return repo.findAll();
    }

    @Override
    public Product findByName(String name) {
        Product prod = repo.findByName( name );
        if ( prod == null )
        {
            throw new RuntimeException("Product not found for ID : " + name);
        }
        return prod;
    }

    @Override
    public Product findProductsById(String id)
    {
        Product prod = repo.findItemById( id );
        if ( prod == null )
        {
            throw new RuntimeException("Product not found for ID : " + id);
        }
        return prod;
    }

    @Override
    public Product saveProduct(Product product)
    {
        return repo.save(product);
    }

    @Override
    public void delete(String id)
    {
        repo.deleteById(id);
    }
}