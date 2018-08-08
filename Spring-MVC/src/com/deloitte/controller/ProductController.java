package com.deloitte.controller;


import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.deloitte.dao.ProductDao;
import com.deloitte.pojos.Product;

@Controller
public class ProductController {


	@RequestMapping(value = "/product", method = RequestMethod.GET)
	public ModelAndView product() {
		Product product = new Product();
		product.setId(1);
		product.setPrice(1000);
		product.setProductName("jkhgfhgf");
		return new ModelAndView("product", "command",product );
	}
	
	@RequestMapping(value = "/addProduct", method = RequestMethod.POST)
	public String addProduct(@ModelAttribute("SpringWeb") Product product, ModelMap model) {
		model.addAttribute("productName", product.getProductName());
		model.addAttribute("price", product.getPrice());
		model.addAttribute("id", product.getId());
		
		

		ProductDao PD = new ProductDao(); 
		
		PD.getConnection();
		/* Add few employee records in database */
		PD.save(product);
		PD.getAll();
		return "result";
	}
	
}
