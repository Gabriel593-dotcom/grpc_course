package com.grpc.grpcspringcourse.domain.dto;

public class ProductOutputDTO {

  private final Long id;
  private final String name;
  private final Double prince;
  private final Integer quantityInStock;

  public ProductOutputDTO(
    Long id,
    String name,
    Double prince,
    Integer quantityInStock
  ) {
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
