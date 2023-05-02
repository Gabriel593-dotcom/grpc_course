package com.grpc.grpcspringcourse.util;

import org.assertj.core.api.Assertions;
import org.junit.Test;

import com.grpc.grpcspringcourse.domain.Product;
import com.grpc.grpcspringcourse.domain.dto.ProductInputDTO;

public class ProductConverterUtilTest {

    @Test
    public void productToProductOutputDTOTest() {
        var product = new Product(1L, "product name", 10.00, 10);
        var productOutputDTO = ProductConverterUtil.productToProductOutputDTO(product);
        Assertions.assertThat(product).usingRecursiveComparison().isEqualTo(productOutputDTO);
    }

    @Test
    public void productInputDTOToProductTest() {
        var productInputDTO = new ProductInputDTO("product name", 10.00, 10);
        var product = ProductConverterUtil.productInputDTOToProduct(productInputDTO);
        Assertions.assertThat(productInputDTO).usingRecursiveComparison().isEqualTo(product);
    }
    
}
