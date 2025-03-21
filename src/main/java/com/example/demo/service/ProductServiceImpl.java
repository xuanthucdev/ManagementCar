package com.example.demo.service;

import com.example.demo.entities.Motorbike;
import com.example.demo.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProductServiceImpl implements ProductService {

    @Autowired
    private ProductRepository productRepository;

    @Override
    public Iterable<Motorbike> findAll() {
        return productRepository.findAll();
    }

    @Override
    public void deleteById(Integer id) {
        productRepository.deleteById(id);
    }

    @Override
    public boolean updateProduct(Integer id, Motorbike motorbike) {
        boolean result = false;

        if (productRepository.existsById(id)) {
            productRepository.updateMotorbike(id, motorbike.getName(), motorbike.getBrand(),
                    motorbike.getPrice(), motorbike.getQuantity(), motorbike.getDescription(), motorbike.getStatus());
            result = true;
        }

        return result;
    }
}
