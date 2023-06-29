package com.manish.productservice.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.manish.productservice.model.Product;

public interface ProductRepository extends MongoRepository<Product, String> {

}
