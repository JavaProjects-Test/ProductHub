/**
 * 
 */
package com.producthub.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import com.producthub.vo.Product;

/**
 * @author Akshit Kaushik
 * 
 */
public class ProductDaoImpl implements ProductDao {

	private SessionFactory sessionFactory;

	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}

	public List<Product> getAllProducts() {
		Session session = sessionFactory.openSession();
		List<Product> productList = session.createQuery("from Product").list();
		session.close();
		return productList;
	}

	public boolean addNewProduct(Product product) {
		Session session = sessionFactory.openSession();
		session.save(product);
		session.close();
		return true;
	}

}
