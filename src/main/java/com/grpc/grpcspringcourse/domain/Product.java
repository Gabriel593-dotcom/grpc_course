package com.grpc.grpcspringcourse.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Product {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private Double prince;
    private Integer quantityInStock;
    
    public Product() {
    }

    public Product(Long id, String name, Double prince, Integer quantityInStock) {
        this.id = id;
        this.name = name;
        this.prince = prince;
        this.quantityInStock = quantityInStock;
    }

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public Double getPrince() {
        return prince;
    }

    public Integer getQuantityInStock() {
        return quantityInStock;
    }
}
