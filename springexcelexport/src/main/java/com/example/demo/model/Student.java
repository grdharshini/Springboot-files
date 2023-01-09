package com.example.demo.model;



import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Student {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)    
    @Column(name ="id")
    private long id;
    
    @Column(name ="name")
    private String name;
    
    @Column(name ="address")
    private String address;
    
    @Column(name ="city")
    private String city;
    
    @Column(name ="pin_code")
    private String pinCode;

}