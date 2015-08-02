/**
 * 
 */
package com.producthub.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.producthub.service.ProductService;
import com.producthub.vo.Product;

/**
 * @author Akshit Kaushik
 * 
 */

@Controller
public class HomeController {
	@Autowired
	ProductService productService;

	@RequestMapping("/home")
	public ModelAndView showMessage() {
		ModelAndView mv = new ModelAndView("home");
		List<Product> productList = productService.getAllProducts();
		System.out.println(productList);
		mv.addObject("prdList", productList);
		return mv;
	}

	@RequestMapping(value = "/addNewProduct", method = RequestMethod.POST)
	public ModelAndView addNewProduct(
			@RequestParam("name") String name,
			@RequestParam("description") String description,
			@RequestParam("price") String price,
			@RequestParam("imageName") String imageName) {
		ModelAndView mv = new ModelAndView("home");
		Product product = new Product();
		
		product.setName(name);
		product.setDescription(description);
		product.setPrice(price);
		product.setImageName(imageName);
		product.setModifiedDate("2015-08-01 05:30:00");
		productService.addNewProduct(product);
		List<Product> productList = productService.getAllProducts();
		System.out.println(productList);
		mv.addObject("prdList", productList);
		return mv;
	}

	@RequestMapping("/login")
	public ModelAndView loginPage() {
		ModelAndView mv = new ModelAndView("login");

		return mv;
	}
}
