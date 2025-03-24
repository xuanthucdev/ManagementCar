package com.example.car_management.repository;


import com.example.car_management.entities.Asset;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface AssetRepository extends JpaRepository<Asset, Integer> {
}
