/**
 * 
 */
package com.producthub.service;

import java.util.List;

import com.producthub.vo.Product;

/**
 * @author Akshit Kaushik
 * 
 */
public interface ProductService {
	public List<Product> getAllProducts();
	
	public boolean addNewProduct(Product product);
}
