package com.example.demo.repo;

import java.util.Optional;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.example.demo.model.Product;

public interface ProductRepository extends MongoRepository < Product, Long > {

	Optional<Product> findByName(String name);

}