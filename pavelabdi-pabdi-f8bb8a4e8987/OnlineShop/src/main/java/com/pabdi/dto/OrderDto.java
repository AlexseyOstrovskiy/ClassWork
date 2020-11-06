package com.pabdi.dto;

import com.pabdi.entity.Item;
import com.pabdi.entity.Order;

import java.util.ArrayList;
import java.util.List;

public class OrderDto {

    private Integer id;

    private List<Item> items = new ArrayList<>();

    public OrderDto(){

    }

    public OrderDto(Order order){
        this.id = order.getOrderId();
        this.items = order.getItems();
    }

    public List<Item> getItems() {
        return items;
    }

    public void setItems(List<Item> items) {
        this.items = items;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }
}
