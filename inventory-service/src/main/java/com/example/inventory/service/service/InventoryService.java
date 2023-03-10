package com.example.inventory.service.service;

import com.example.inventory.service.repository.InventoryRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@AllArgsConstructor
public class InventoryService {
    private final InventoryRepository inventoryRepository;

    @Transactional(readOnly = true)
    public boolean insInsStock(String skuCode){
        return inventoryRepository.findBySkuCode(skuCode).isPresent();
    }
}
