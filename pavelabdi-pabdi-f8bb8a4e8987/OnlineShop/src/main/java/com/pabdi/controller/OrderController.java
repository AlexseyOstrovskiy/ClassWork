package com.pabdi.controller;

import com.pabdi.entity.Item;
import com.pabdi.service.impl.ItemServiceImpl;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Controller
@RequestMapping("/order")
@SessionAttributes({"selecteditems", "orderitems"})
public class OrderController {

    private List<String> selectedItems = new ArrayList<>();

    private List<Item> orderItems = new ArrayList<>();

    private ItemServiceImpl itemServiceImpl;

    public OrderController(ItemServiceImpl itemServiceImpl){
        this.itemServiceImpl = itemServiceImpl;
    }

    @RequestMapping(method = { RequestMethod.GET, RequestMethod.POST })
    public String listItems(@ModelAttribute(name = "selecteditems") ArrayList<String> selectedItems, ModelMap model) {

        orderItems = selectedItems.stream()
                .map(item -> itemServiceImpl.getByName(item))
                .collect(Collectors.toList());
        model.addAttribute("orderitems", orderItems);
        return "order";
    }
}
