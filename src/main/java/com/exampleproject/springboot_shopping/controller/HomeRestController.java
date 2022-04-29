package com.exampleproject.springboot_shopping.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeRestController {
  
  @RequestMapping("/home-rest")
  public String getHomeString() {
    return "Why, Hello there~!";
  }
}
