package com.exampleproject.springboot_shopping.controller;

import com.exampleproject.springboot_shopping.model.Product;
import com.exampleproject.springboot_shopping.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.stereotype.Controller;

import java.util.List;

@Controller
public class HomeController
{
  @Autowired
  private ProductService productsService;

  @RequestMapping("/home")
  public String getHomeString() {
    return "index";
  }


  //Display Product List
  @RequestMapping("/products")
  public String viewProducts(Model model)
  {

    List<Product>  foundProducts = this.productsService.findAll();

    if( foundProducts.size() != 0 )
    {
      model.addAttribute("prodList", foundProducts );
    }

    return "products";
  }
}
