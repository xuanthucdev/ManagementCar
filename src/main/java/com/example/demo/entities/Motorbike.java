package com.example.demo.entities;


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
@Table(name = "motorbike")
public class Motorbike {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id; // ID của xe máy

	private String name; // Tên xe máy
	private String brand; // Thương hiệu
	private double price; // Giá xe
	private int quantity; // Số lượng xe trong kho
	private String description; // Mô tả sản phẩm
	private String status;
}
