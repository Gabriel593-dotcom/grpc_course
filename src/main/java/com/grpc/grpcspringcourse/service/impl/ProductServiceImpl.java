package com.grpc.grpcspringcourse.service.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.grpc.grpcspringcourse.domain.dto.ProductInputDTO;
import com.grpc.grpcspringcourse.domain.dto.ProductOutputDTO;
import com.grpc.grpcspringcourse.repository.ProductRepository;
import com.grpc.grpcspringcourse.service.IProductService;
import com.grpc.grpcspringcourse.util.ProductConverterUtil;

@Service
public class ProductServiceImpl implements IProductService {

    @Autowired
    private ProductRepository repo;

    @Override
    public ProductOutputDTO create(ProductInputDTO inputDTO) {
        var product = ProductConverterUtil.productInputDTOToProduct(inputDTO);
        var productCreated = repo.save(product);  
        return ProductConverterUtil.productToProductOutputDTO(productCreated);
    }

    @Override
    public ProductOutputDTO create(Long id) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'create'");
    }

    @Override
    public void delete(Long id) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'delete'");
    }

    @Override
    public List<ProductOutputDTO> findAll() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'findAll'");
    }

}