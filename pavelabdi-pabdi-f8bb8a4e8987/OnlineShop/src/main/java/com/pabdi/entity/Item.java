package com.pabdi.entity;

import javax.persistence.*;
import java.math.BigDecimal;

@Entity
@Table(name = "items")
public class Item {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Integer itemId;

    @Column(name = "name")
    private String itemName;

    @Column(name = "price")
    private BigDecimal itemPrice;

    @Enumerated(EnumType.STRING)
    @Column(name = "category")
    private Category itemCategory;

    public Item(){

    }

    public Integer getItemId() {
        return itemId;
    }

    public void setItemId(Integer itemId) {
        this.itemId = itemId;
    }

    public String getItemName() {
        return itemName;
    }

    public void setItemName(String name) {
        this.itemName = name;
    }

    public BigDecimal getItemPrice() {
        return itemPrice;
    }

    public void setItemPrice(BigDecimal price) {
        this.itemPrice = price;
    }

    public Category getItemCategory() {
        return itemCategory;
    }

    public void setItemCategory(Category category) {
        this.itemCategory = category;
    }
}
