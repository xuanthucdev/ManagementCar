package com.example.demo.repository;

import com.example.demo.entities.Asset;
import com.example.demo.entities.Motorbike;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AssetRepository extends JpaRepository<Asset, Integer> {
}
