package com.pabdi.service.impl;

import com.pabdi.entity.Order;
import com.pabdi.repository.impl.OrderRepository;
import com.pabdi.service.EntityService;
import org.springframework.stereotype.Service;

import javax.persistence.NoResultException;
import java.util.List;

@Service
public class OrderServiceImpl implements EntityService {

    private OrderRepository orderRepository;

    public OrderServiceImpl(OrderRepository orderRepository) {
        this.orderRepository = orderRepository;
    }

    @Override
    public List<Order> getAll() {
        return orderRepository.findAllOrders()
                .orElseThrow(() -> new NoResultException("No orders found"));
    }

    @Override
    public Order getById(int id) {
        return orderRepository.findById(id)
                .orElseThrow(() -> new NoResultException("No order found with username " + id));
    }
}
