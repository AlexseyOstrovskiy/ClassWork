package com.pabdi.service.impl;

import com.pabdi.entity.Item;
import com.pabdi.repository.impl.ItemRepository;
import com.pabdi.service.EntityService;
import org.springframework.stereotype.Service;

import javax.persistence.NoResultException;
import java.util.List;

@Service
public class ItemServiceImpl implements EntityService {

    private ItemRepository itemRepository;

    public ItemServiceImpl(ItemRepository itemRepository){
        this.itemRepository = itemRepository;
    }

    @Override
    public List<Item> getAll() {
        return itemRepository.findAllItems()
                .orElseThrow(() -> new NoResultException("No items found"));
    }

    @Override
    public Item getById(int id) {
        return itemRepository.findById(id)
                .orElseThrow(() -> new NoResultException("No item found with name " + id));
    }

    public Item getByName(String name) {
        return itemRepository.findItemByName(name)
                .orElseThrow(() -> new NoResultException("No item found with username " + name));
    }
}
