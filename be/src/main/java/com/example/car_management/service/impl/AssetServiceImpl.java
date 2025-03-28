package com.example.car_management.service.impl;


import com.example.car_management.entities.Asset;
import com.example.car_management.repository.AssetRepository;
import com.example.car_management.service.AssetService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class AssetServiceImpl implements AssetService {
    @Autowired
    private AssetRepository repository;
    @Override
    public List<Asset> getAllAssets() {
        return repository.findAll();
    }

    @Override
    public String updateAsset(Long id, Asset asset) {
        Optional<Asset> optionalAsset =repository.findById(id.intValue());
        if(optionalAsset.isEmpty()){
            return "not found";
        }
        repository.save(asset);
        return "successfully";
    }

    @Override
    public boolean deleteAsset(Long id) {
        Optional<Asset> asset = repository.findById(id.intValue());
        if (asset.isPresent()) {
            repository.delete(asset.get());
            return true;
        }
        return false;
    }
}
