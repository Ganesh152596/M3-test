package com.cg.product.controller;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;


import com.cg.product.bean.Product;
import com.cg.product.exception.ProductException;
import com.cg.product.service.IproductService;


@RestController

public class ProductController {
	@Autowired
	private IproductService service;
	
	@RequestMapping(value="/createproduct",method=RequestMethod.POST)
	public  Product createProduct(@RequestBody Product product) throws ProductException   {
		
		try {
			 service.createProduct(product);
		} catch (ProductException e) {
			
			throw new ProductException(e.getMessage());
		}
		return product;  
	}
	
	


/*@RequestMapping(value="/UpdateProduct",method=RequestMethod.PUT)
public ResponseEntity<Product> acceptProductDetails1(@ModelAttribute Product product) throws ProductException{
	
	try {
		service.updateProduct(product);
	} catch (ProductException e) {
		// TODO Auto-generated catch block
		throw new ProductException(e.getMessage());
	}
	return new ResponseEntity<>(product,HttpStatus.OK);
}*/
	
/*}

@RequestMapping(value="/DeleteProduct",method=RequestMethod.DELETE)
public boolean deleteProduct(String id) throws ProductException{
	service.deleteProduct(id);
	return true;
	
}*/
@RequestMapping(value="/Find ById",method=RequestMethod.GET)
public ResponseEntity<Product> acceptProductDetails111(@ModelAttribute Product product) throws ProductException{
	product=service.findProductById(product.getId());
	return new ResponseEntity<>(product,HttpStatus.OK);
	
}
@RequestMapping(value="/View AllProduct",method=RequestMethod.GET)
public ResponseEntity<List<Product>> acceptProductDetails11() throws ProductException {
	List<Product> products;
	products=service.viewAllProduct();
	return new ResponseEntity<>(products,HttpStatus.OK);



}
  
@RequestMapping(method=RequestMethod.GET,value= {"/sathello"},produces= {"application/text"})
public ResponseEntity<String> getHelloMessage(){
	return new ResponseEntity<String>("Hello World From RestFulWebService",HttpStatus.OK);
}

@RequestMapping(value="/acceptProductDetails",method=RequestMethod.POST,consumes=org.springframework.http.MediaType.APPLICATION_FORM_URLENCODED_VALUE)
public ResponseEntity<Product> acceptProductDetails(@ModelAttribute Product product) throws ProductException{
	
	//onlineShopServices.acceptProductDetails(product);
	service.createProduct(product);
	return new ResponseEntity<>(product,HttpStatus.OK);
	
} 
 

}
















