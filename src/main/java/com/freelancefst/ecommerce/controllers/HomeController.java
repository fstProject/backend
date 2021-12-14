package com.freelancefst.ecommerce.controllers;

import java.util.List;

import com.freelancefst.ecommerce.entity.Product;
import com.freelancefst.ecommerce.repos.ProductRepo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

/**
 * HomeController
 */
@RestController
public class HomeController {

    @Autowired
    private ProductRepo productRepo;

    @GetMapping("/products")
    List<Product> getAll() {
        return (List<Product>) productRepo.findAll();
    }

    @GetMapping("/product/{id}")
    Product getOne(@PathVariable Long id) {
        return productRepo.findById(id).get();
    }
}