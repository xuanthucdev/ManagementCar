package com.example.demo.repository;

import com.example.demo.entities.Motorbike;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ProductRepository extends JpaRepository<Motorbike, Integer> {
    @Override
    void deleteById(Integer integer);

    @Query("UPDATE Motorbike m SET m.name = :name, m.brand = :brand, m.price = :price, m.quantity = :quantity, m.description = :description, m.status = :status WHERE m.id = :id")
    void updateMotorbike(Integer id, String name, String brand, double price, int quantity, String description, String status);


}
