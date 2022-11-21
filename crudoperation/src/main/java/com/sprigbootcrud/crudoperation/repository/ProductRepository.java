package com.sprigbootcrud.crudoperation.repository;

import com.sprigbootcrud.crudoperation.dto.ProductDTO;
import com.sprigbootcrud.crudoperation.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.stereotype.Repository;

import java.util.List;
@EnableJpaRepositories
@Repository
public interface ProductRepository extends JpaRepository<Product,Integer> {



}

