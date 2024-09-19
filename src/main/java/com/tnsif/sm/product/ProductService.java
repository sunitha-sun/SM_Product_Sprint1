package com.tnsif.sm.product;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProductService 
{
    @Autowired
    private ProductRepository repo;
    
    
    public List<Product> listAll()
    {
    	return repo.findAll();
    }
    public Product get(Integer productid)
    {
        return repo.findById(productid).get();
    }
    public void save(Product product)
    {
    	repo.save(product);
    }
    public void delete(Integer productid)
    {
    	repo.deleteById(productid);
    }
}
