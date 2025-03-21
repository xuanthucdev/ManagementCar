package com.example.demo.controller;

import com.example.demo.entities.Motorbike;
import com.example.demo.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.util.MimeTypeUtils;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/products")
public class ProductController {
    @Autowired
    private ProductService productService;


    @GetMapping(value = "/findAll", produces = MimeTypeUtils.APPLICATION_JSON_VALUE)
    public ResponseEntity<Iterable<Motorbike>> getAllProducts() {
        try {
            return new ResponseEntity<Iterable<Motorbike>>(productService.findAll(), HttpStatus.OK);
        } catch (Exception e) {
            e.printStackTrace();
            return new ResponseEntity<Iterable<Motorbike>>(HttpStatus.BAD_REQUEST);
        }
    }
}
