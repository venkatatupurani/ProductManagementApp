package com.productmanagement.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.productmanagement.dao.ProductRepository;
import com.productmanagement.model.Product;

@RestController
public class ProductManagementController {
	
	@Autowired
	private ProductRepository productrepo;
	
	@PostMapping("/addProduct")
	public String saveProduct(@RequestBody Product product) {
		productrepo.save(product);
		return "Added product with name : " + product.getName();
	}

	@GetMapping("/findAllProducts")
	public List<Product> getProducts() {
		return productrepo.findAll();
	}
	
}
