package com.thediyguide.product.service.repository;

import com.thediyguide.product.service.model.Product;
import org.socialsignin.spring.data.dynamodb.repository.EnableScan;
import org.springframework.data.repository.CrudRepository;

@EnableScan
public interface ProductRepository extends CrudRepository<Product, String> {
}
