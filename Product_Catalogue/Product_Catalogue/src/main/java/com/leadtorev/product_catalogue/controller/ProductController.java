package com.leadtorev.product_catalogue.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.service.annotation.DeleteExchange;

import com.leadtorev.product_catalogue.dao.AddProductDao;
import com.leadtorev.product_catalogue.dao.UpdateProductDao;
import com.leadtorev.product_catalogue.service.ProductService;

@RestController
@RequestMapping("/products")
public class ProductController {
	
	@Autowired
	private ProductService productService;

	@PostMapping("")
	public ResponseEntity<?> create(@RequestBody AddProductDao addProductDao){
		return ResponseEntity.ok(this.productService.createProduct(addProductDao));
	}
	
	@GetMapping("")
	public ResponseEntity<?> getAll(){
		return ResponseEntity.ok(this.productService.getAllProducts());
	}
	
	@GetMapping("/{id}")
	public ResponseEntity<?> getById(@PathVariable Integer id){
		return ResponseEntity.ok(this.productService.getProduct(id));
	}
	
	@PutMapping("/{id}")
	public ResponseEntity<?> update(@RequestBody UpdateProductDao updateProductDao, @PathVariable Integer id){
		return ResponseEntity.ok(this.productService.updateProduct(updateProductDao, id));
	}
	
	@DeleteMapping("/{id}")
	public ResponseEntity<?> delete(@PathVariable Integer id){
		this.productService.deleteProduct(id);
		return ResponseEntity.ok("Product Deleted");
	}
}
