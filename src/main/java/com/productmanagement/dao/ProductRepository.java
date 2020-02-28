package com.productmanagement.dao;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.productmanagement.model.Product;

public interface ProductRepository extends MongoRepository<Product,Integer>{

}
