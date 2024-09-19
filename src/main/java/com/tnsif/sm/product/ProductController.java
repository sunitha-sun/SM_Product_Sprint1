package com.tnsif.sm.product;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.NoSuchElementException;

@RestController
@CrossOrigin("http://localhost:3000")
public class ProductController 
{
	@Autowired
    private ProductService service;
	
	
	//Restful API methods for retrieval operations
	@GetMapping("/products")
	public List<Product> list()
	{
		return service.listAll();
	}
	@GetMapping("/products/{productid}")
	public ResponseEntity<Product> get(@PathVariable Integer productid)
	{
		try
		{
		    Product product=service.get(productid);
		    return new ResponseEntity<Product>(product, HttpStatus.OK);
		}
		catch (NoSuchElementException e)
		{
		    return new ResponseEntity<Product>(HttpStatus.NOT_FOUND);	
		}
		
	}
	//Creating operations
	@PostMapping("/products")
	public void add(@RequestBody Product product)
	{
		service.save(product);
	}
	//Restful API method for Update operation
	@PutMapping("/products/{productid}")
	public ResponseEntity<?> update(@RequestBody Product product, @PathVariable Integer productid)
	{
		try
		{
			Product existproduct = service.get(productid);
			service.save(product);
			return new ResponseEntity<>(HttpStatus.OK);
		}
		catch(NoSuchElementException e)
		{
			return new ResponseEntity<>(HttpStatus.NOT_FOUND);
		}
	}
	//Restful API method for Delete operation
	@DeleteMapping("/products/{productid}")
	public void delete(@PathVariable Integer productid)
	{
		service.delete(productid);
	}
			
}

