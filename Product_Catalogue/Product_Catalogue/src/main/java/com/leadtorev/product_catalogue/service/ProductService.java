package com.leadtorev.product_catalogue.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.leadtorev.product_catalogue.dao.AddProductDao;
import com.leadtorev.product_catalogue.dao.UpdateProductDao;
import com.leadtorev.product_catalogue.entity.Product;
import com.leadtorev.product_catalogue.repository.ProductRepository;



@Service
public class ProductService {
	
	@Autowired
	private ProductRepository productRepository;

	
	public Product createProduct(AddProductDao addProductDao) {
		
		Product product = new Product();
		
		product.setName(addProductDao.getName());
		product.setPrice(addProductDao.getPrice());
		product.setDescription(addProductDao.getDescription());
		product.setCategory(addProductDao.getCategory());
		
		this.productRepository.save(product);
		
		return product;
	}
	
	
	public List<Product> getAllProducts(){
		List<Product> products = this.productRepository.findAll();
		
		return products;
	}
	
	
	public Product getProduct(Integer id) {
		Product product = this.productRepository.findById(id).orElse(null);
		
		return product;
	}
	
	
	public Product updateProduct(UpdateProductDao updateProductDao, Integer id) {
		Product product = this.productRepository.findById(id).orElse(null);
		
		if(updateProductDao.getName() != null) {
			product.setName(updateProductDao.getName());
		}
		
		if(updateProductDao.getPrice() != null) {
			product.setPrice(updateProductDao.getPrice());
		}
		
		if(updateProductDao.getDescription() != null) {
			product.setDescription(updateProductDao.getDescription());
		}
		
		if(updateProductDao.getCategory()  != null) {
			product.setCategory(updateProductDao.getCategory());
		}
		
		this.productRepository.save(product);
		
		return product;
	}
	
	
	public void deleteProduct(Integer id) {
		
		Product product = this.productRepository.findById(id).orElse(null);
		
		this.productRepository.delete(product);
	}
	
}
