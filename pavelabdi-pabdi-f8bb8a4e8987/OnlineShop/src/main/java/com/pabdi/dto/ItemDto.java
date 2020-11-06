package com.pabdi.dto;

import com.pabdi.entity.Item;

import java.math.BigDecimal;

public class ItemDto {

    private Integer id;

    private String name;

    private BigDecimal price;

    public ItemDto(){

    }

    public ItemDto(Item item){
        this.id = item.getItemId();
        this.name = item.getItemName();
        this.price = item.getItemPrice();
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }
}
