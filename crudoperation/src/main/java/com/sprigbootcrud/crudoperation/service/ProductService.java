package com.sprigbootcrud.crudoperation.service;

import com.sprigbootcrud.crudoperation.dto.ProductDTO;
import com.sprigbootcrud.crudoperation.entity.Product;
import com.sprigbootcrud.crudoperation.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductService {
    @Autowired
    private ProductRepository repository;

    public List<Product> getAllProducts(ProductDTO productDTO){
        return repository.save(productDTO);
    }
}
