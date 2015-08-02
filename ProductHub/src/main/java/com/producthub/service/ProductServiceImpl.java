/**
 * 
 */
package com.producthub.service;

import java.util.List;

import com.producthub.dao.ProductDao;
import com.producthub.dao.ProductDaoImpl;
import com.producthub.vo.Product;

/**
 * @author Akshit Kaushik
 * 
 */

public class ProductServiceImpl implements ProductService {

	ProductDao productDao;

	public List<Product> getAllProducts() {
		return productDao.getAllProducts();
	}

	/**
	 * @param productDao
	 *            the productDao to set
	 */
	public void setProductDao(ProductDao productDao) {
		this.productDao = productDao;
	}

	public boolean addNewProduct(Product product) {
		
		return productDao.addNewProduct(product);
	}

}
