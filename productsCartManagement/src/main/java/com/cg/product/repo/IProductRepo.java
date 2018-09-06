package com.cg.product.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cg.product.bean.Product;

public interface IProductRepo  extends JpaRepository<Product, String> {

}
