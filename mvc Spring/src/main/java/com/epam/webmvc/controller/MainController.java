package com.epam.webmvc.controller;

import com.epam.webmvc.model.User;
import org.springframework.security.access.annotation.Secured;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.View;
import org.springframework.web.servlet.view.InternalResourceView;

@Controller
public class MainController {

    @GetMapping("/home")
    //First time we get blank user as we did not specified username and password
    public String getHomePage(Model model, @ModelAttribute User user) {
        return "home";
    }

    //If we use GET method, all fields will be passed through url parameters.
    //Using POST we can hide them into method's body
    @GetMapping("/get-model")
    //Here you can see how Spring maps form's inputs to a model object
    public View getModel(@ModelAttribute User user) {
        System.out.println(user);
        return new InternalResourceView("home");
    }

    @GetMapping("/admin")
//    @PreAuthorize("hasRole('ROLE_ADMIN')")
    @Secured("ROLE_ADMIN")
    public String getAdminPage() {
        return "admin";
    }

    @GetMapping("/login")
    //Can return String, Model, View, ModelAndView
    public ModelAndView getLoginPage(ModelAndView model) {
        //Predefined username
        User user = new User("Saved user", "");
        model.addObject("user", user);
        model.setViewName("login");
        return model;
    }
}

