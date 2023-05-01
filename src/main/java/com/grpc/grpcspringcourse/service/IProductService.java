package com.grpc.grpcspringcourse.service;

import java.util.List;
import java.util.Optional;

import com.grpc.grpcspringcourse.domain.dto.ProductInputDTO;
import com.grpc.grpcspringcourse.domain.dto.ProductOutputDTO;

public interface IProductService {
    
    Optional<ProductOutputDTO> create(ProductInputDTO inputDTO);
    ProductOutputDTO create(Long id);
    void delete(Long id);
    List<ProductOutputDTO> findAll(); 
}
