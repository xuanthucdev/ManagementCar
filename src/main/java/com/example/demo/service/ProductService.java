package com.example.demo.service;

import com.example.demo.entities.Motorbike;
import org.springframework.stereotype.Service;

import java.util.List;


public interface ProductService {
    Iterable<Motorbike> findAll() ;
    void deleteById(Integer id);
}
