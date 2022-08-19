package com.example.crud.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.crud.demo.entity.Product;

public interface ProductRepository  extends  JpaRepository<Product,Integer>{

}




//public interface ProductRepository extends JpaRepository<Product,Integer> {
//    Product findByName(String name);
//}