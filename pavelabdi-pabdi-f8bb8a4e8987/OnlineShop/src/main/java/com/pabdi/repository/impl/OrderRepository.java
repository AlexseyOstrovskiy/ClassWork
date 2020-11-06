package com.pabdi.repository.impl;

import com.pabdi.entity.Order;
import com.pabdi.repository.AbstractRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public class OrderRepository extends AbstractRepository<Integer, Order> {

    public OrderRepository(){

    }

    public Optional<Order> findById(int id) {
        return Optional.of(getByKey(id));
    }

    @SuppressWarnings("unchecked")
    public Optional<List<Order>> findAllOrders() {
        return Optional.of(getAll());
    }

    public void save(Order order) {
        persist(order);
    }
}
