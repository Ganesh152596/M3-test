package com.cg.productsCartManagement;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EntityScan("com.cg.product.bean")
@EnableJpaRepositories("com.cg.product.repo")
@ComponentScan("com.cg")
public class ProductsCartManagementApplication {

	public static void main(String[] args) {
		SpringApplication.run(ProductsCartManagementApplication.class, args);
	}
}
