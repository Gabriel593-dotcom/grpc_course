package com.grpc.grpcspringcourse.domain.dto;

public class ProductInputDTO {

  private final String name;
  private final Double prince;
  private final Integer quantityInStock;

  public ProductInputDTO(String name, Double prince, Integer quantityInStock) {
    this.name = name;
    this.prince = prince;
    this.quantityInStock = quantityInStock;
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
