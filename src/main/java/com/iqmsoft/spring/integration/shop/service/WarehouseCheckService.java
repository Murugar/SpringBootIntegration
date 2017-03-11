package com.iqmsoft.spring.integration.shop.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import com.iqmsoft.spring.integration.shop.model.OrderItem;

/**
 * Check if item is in warehouse
 */
@Service
class WarehouseCheckService {

    private final static Logger LOGGER = LoggerFactory.getLogger(WarehouseCheckService.class);

    public boolean isAvailable(OrderItem item) {
        LOGGER.info("Checking if item {} is available", item.getItemName());
        //do something clever and check if item is in warehouse
        LOGGER.info("Item {} is available", item.getItemName());
        return true;
    }
}
