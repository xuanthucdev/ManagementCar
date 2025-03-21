package com.example.car_management.entities;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Table(name = "products")
public class Product {
    @Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id; //id san pham

	private String name; // ten san pham
	private double price ; // gia
	private int quantity;
	




}
