package com.example.car_management.service;



import com.example.car_management.entities.Asset;

import java.util.List;

public interface AssetService {
    List<Asset> getAllAssets();
    String updateAsset(Long id, Asset asset);
    boolean deleteAsset(Long id);
}
