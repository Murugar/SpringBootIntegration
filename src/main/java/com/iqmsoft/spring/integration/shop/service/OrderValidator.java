package com.iqmsoft.spring.integration.shop.service;

import org.springframework.stereotype.Service;

import com.iqmsoft.spring.integration.shop.model.Order;

@Service
class OrderValidator {

    /**
     * Order should have more then one item
     */
    public boolean validate(Order order) {
        return order.getItems()!=null && order.getItems().size()>0;
    }
}
