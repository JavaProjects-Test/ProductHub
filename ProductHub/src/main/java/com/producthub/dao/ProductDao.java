/**
 * 
 */
package com.producthub.dao;

import java.util.List;

import com.producthub.vo.Product;

/**
 * @author Akshit Kaushik
 * 
 */
public interface ProductDao {
	public List<Product> getAllProducts();
	
	public boolean addNewProduct(Product product);
}
