package com.sprigbootcrud.crudoperation.controller;

import com.sprigbootcrud.crudoperation.dto.ProductDTO;
import com.sprigbootcrud.crudoperation.entity.Product;
import com.sprigbootcrud.crudoperation.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
@RestController
public class ProductController {

    @Autowired
    private ProductService service;

    @PostMapping("/all/product")
    public List<Product> getAllProducts(@RequestBody ProductDTO productDTO){
        return service.getAllProducts(productDTO);
    }
}
