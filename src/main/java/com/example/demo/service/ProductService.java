package com.example.demo.service;

import com.example.car_management.entities.Product;
import org.springframework.stereotype.Service;

import java.util.List;


public interface ProductService {
    Iterable<Product> findAll() ;
}
