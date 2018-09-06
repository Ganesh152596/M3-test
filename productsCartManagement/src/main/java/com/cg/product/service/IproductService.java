package com.cg.product.service;

import java.util.List;

import com.cg.product.bean.Product;
import com.cg.product.exception.ProductException;



public interface IproductService {


	public Product createProduct(Product emp) throws ProductException;
	public Product updateProduct(Product emp) throws ProductException;
	
	public Product deleteProduct(String id) throws ProductException;
	
	public List<Product> viewAllProduct() throws ProductException;
    public  Product findProductById(String id) throws ProductException;
 
}
