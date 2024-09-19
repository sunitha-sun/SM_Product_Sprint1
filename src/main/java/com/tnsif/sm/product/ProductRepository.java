package com.tnsif.sm.product;

import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product,Integer>
{
     //All CRUD operation methods
}
/*
* findall()
* finfById()
* save()
* deleteById()
*/
