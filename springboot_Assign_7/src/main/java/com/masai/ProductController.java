package com.masai;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.masai.exceptionHandling.ProductNotFound;



@RestController
public class ProductController {

	@RequestMapping("/products")
	public List<Product> getProductDetails(){
		List<Product> products=new ArrayList<>();
		products.add(new Product(101, "Perfume", 1500, "Blue", "Cosmetics", 25, "FT78945"));
		products.add(new Product(102, "Speaker", 1099, "Boat", "electronics", 123, "Dm10236"));
		products.add(new Product(103, "watch", 2500, "Skemi", "Style", 7896, "FT7894"));
		products.add(new Product(104, "Mobile", 15299, "oneplus", "electronics",23589, "D98236"));
		return products;
	}
	
	@RequestMapping("/product/{id}")
	public Product getProductById(@PathVariable("id") Integer id)
	{
		Product P=null;
		List<Product> products=getProductDetails();
		for(Product p:products)
		{
			if(p.getId()==id)
				P=p;
		}
		if(P==null)
			throw new ProductNotFound("Product doesnt exist with id "+id);
			
		return P;
	}
	
	@DeleteMapping("/product/{id}")
	public List<Product> deleteProductById(@PathVariable("id") Integer id)
	{
		Product P=null;
		List<Product> products=getProductDetails();
		for(Product p:products)
		{
			if(p.getId()==id)
				P=p;
			
		}
		products.remove(P);
		return products;
	}

	
	@PostMapping(value = "/product",consumes = "application/json")
	public List<Product>saveStudentDetails(@RequestBody Product product) {
		List<Product> products=getProductDetails();
		products.add(product);
		
	return products;
	}
	
}
