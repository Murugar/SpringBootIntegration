package com.iqmsoft.spring.integration.shop.service;

import org.springframework.stereotype.Service;

import com.iqmsoft.spring.integration.shop.model.OrderItem;
import com.iqmsoft.spring.integration.shop.model.Summary;

import java.math.BigDecimal;
import java.util.List;

@Service
class SummaryService {

    public Summary sumUp(List<OrderItem> items) {
        BigDecimal totalPrice = countTotalPrice(items);
        return new Summary(totalPrice, items);
    }

    private BigDecimal countTotalPrice(List<OrderItem> items) {
        return items
                .stream()
                .map(OrderItem::totalPriceAfterDiscount)
                .reduce(BigDecimal.ZERO, BigDecimal::add);
    }
}
