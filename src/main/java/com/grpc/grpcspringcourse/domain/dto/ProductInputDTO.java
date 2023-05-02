package com.grpc.grpcspringcourse.domain.dto;

import com.grpc.grpcspringcourse.domain.Product;

public class ProductInputDTO {

  private final String name;
  private final Double price;
  private final Integer quantityInStock;

  public ProductInputDTO(Product product) {
    this.name = product.getName();
    this.price = product.getPrice();
    this.quantityInStock = product.getQuantityInStock();
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
