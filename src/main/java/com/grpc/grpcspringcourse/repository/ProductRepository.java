package com.grpc.grpcspringcourse.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.grpc.grpcspringcourse.domain.Product;

@Repository
public interface ProductRepository extends JpaRepository<Product, Long>{
    Optional<Product> findByNameIgnoreCase(String name);
}
