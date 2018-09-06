package com.cg.product.service;
/**
 * ClassName:ProductServiceImpl
 * InterfaceName:IOProductService
 * purpose:To validate and Update
 * author:@ganesh
 */
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cg.product.bean.Product;
import com.cg.product.exception.ProductException;
import com.cg.product.repo.IProductRepo;

@Service
public class ProductServiceImpl implements IproductService {
	@Autowired
	private IProductRepo repo;
	
	@Override
	public Product createProduct(Product product) throws ProductException {
	
	boolean b=validateProduct(product);
	if(b) {
		repo.save(product);
	}
	else {
		throw new ProductException("validation failed");
	}
		
		return repo.save(product);
	}

	@Override
	public Product updateProduct(Product product) throws ProductException {
		Product product2=repo.getOne(product.getId());
		String name=product.getName();
		String model=product.getModel();
		Double price=product.getPrice();
		if(name!=null) {
			product2.setName(product.getName());
			
		}
		if(model!=null) {
			product.setModel(product.getModel());
		}
		if(price!=0) {
			product2.setPrice(product.getPrice());
		}
		boolean b=validateProduct(product2);
		if(b) {
			repo.save(product2);
		}
		else {
			throw new ProductException("validation failed");
		}
		
		return product2;
	}

	@Override
	public Product deleteProduct(String id) throws ProductException {
		Product product=repo.getOne(id);
		repo.deleteById(id);
		
		
		return product;
	}

	@Override
	public List<Product> viewAllProduct() throws ProductException {
		
		return repo.findAll();
	}

	@Override
	public Product findProductById(String id) throws ProductException {
		
		return repo.getOne(id);
	}

	public boolean validateProduct(Product product)throws ProductException{
		if(product.getId()==null||product.getId().isEmpty()) {
			throw new ProductException("Id cannot be null");
		}
		if(product.getName()==null||product.getName().isEmpty()) {
			throw new ProductException("Name cannot be null");
		}
		if(product.getModel()==null||product.getModel().isEmpty()) {
			throw new ProductException("Model cannot be null");
		}
		if(product.getPrice()<=0) {
			throw new ProductException(" price must be greate than zero");
		}
		return true;
		
	}
}
