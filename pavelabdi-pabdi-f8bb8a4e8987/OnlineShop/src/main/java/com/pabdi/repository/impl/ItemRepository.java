package com.pabdi.repository.impl;

import java.util.List;
import java.util.Optional;

import com.pabdi.entity.Item;
import com.pabdi.repository.AbstractRepository;
import org.springframework.stereotype.Repository;

import javax.persistence.NoResultException;

@Repository
public class ItemRepository extends AbstractRepository<Integer, Item> {

    public ItemRepository(){

    }

    public Optional<Item> findById(int id) {
        return Optional.of(getByKey(id));
    }

    public Optional<Item> findItemByName(String name) {
        return getSession()
                .createQuery("FROM Item i WHERE i.itemName =:name", Item.class)
                .setParameter("name", name)
                .uniqueResultOptional();
    }

    @SuppressWarnings("unchecked")
    public Optional<List<Item>> findAllItems() {
        return Optional.of(getAll());
    }

    public void save(Item item) {
        persist(item);
    }
}