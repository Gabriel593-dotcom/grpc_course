package com.grpc.grpcspringcourse.util;

import com.grpc.grpcspringcourse.domain.Product;
import com.grpc.grpcspringcourse.domain.dto.ProductInputDTO;
import com.grpc.grpcspringcourse.domain.dto.ProductOutputDTO;

public class ProductConverterUtil {

    public static ProductOutputDTO productToProductOutputDTO(Product product) {
        return new ProductOutputDTO(product);
    }

    public static Product productInputDTOToProduct(ProductInputDTO productInputDTO) {
        return new Product(null, productInputDTO.getName(), productInputDTO.getPrice(),
                productInputDTO.getQuantityInStock());
    }
}
