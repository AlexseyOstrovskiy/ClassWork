package com.pabdi.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/welcome")
public class WelcomeController {

    @RequestMapping(method = { RequestMethod.GET, RequestMethod.POST })
    public String showWelcome() {
        return "welcome";
    }
}