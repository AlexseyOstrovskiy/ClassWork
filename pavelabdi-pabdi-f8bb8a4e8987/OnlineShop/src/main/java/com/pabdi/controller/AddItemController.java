package com.pabdi.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("/addItem")
@SessionAttributes("selecteditems")
public class AddItemController {

    private List<String> selectedItems = new ArrayList<>();

    @RequestMapping(method = { RequestMethod.GET, RequestMethod.POST })
    public String listItems(@RequestParam(name = "product") String item, ModelMap model) {
        selectedItems.add(item);
        model.addAttribute("selecteditems", selectedItems);
        return "welcome";
    }
}
