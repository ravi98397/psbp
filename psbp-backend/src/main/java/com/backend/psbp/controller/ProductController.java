package com.backend.psbp.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProductController {

    @GetMapping("/addProduct")
    public String addProduct() {
        // Add product
        return "hello";
    }
}
