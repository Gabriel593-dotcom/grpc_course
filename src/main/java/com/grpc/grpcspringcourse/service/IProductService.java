package com.grpc.grpcspringcourse.service;

import java.util.List;

import com.grpc.grpcspringcourse.domain.dto.ProductInputDTO;
import com.grpc.grpcspringcourse.domain.dto.ProductOutputDTO;

public interface IProductService {
    
    ProductOutputDTO create(ProductInputDTO inputDTO);
    ProductOutputDTO create(Long id);
    void delete(Long id);
    List<ProductOutputDTO> findAll(); 
}
