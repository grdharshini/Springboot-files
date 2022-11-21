package com.sprigbootcrud.crudoperation.dto;

import lombok.Data;

@Data
public class ProductDTO {

    private int id;
    private String name;
    private int quantity;
    private double price;
}
