package com.grpc.grpcspringcourse.domain.dto;

import com.grpc.grpcspringcourse.domain.Product;

public class ProductOutputDTO {

  private final Long id;
  private final String name;
  private final Double price;
  private final Integer quantityInStock;

  public ProductOutputDTO(Product product) {
    this.id = product.getId();
    this.name = product.getName();
    this.price = product.getPrice();
    this.quantityInStock = product.getQuantityInStock();
  }

  public Long getId() {
    return id;
  }

  public String getName() {
    return name;
  }

  public Double getPrice() {
    return price;
  }

  public Integer getQuantityInStock() {
    return quantityInStock;
  }
}
