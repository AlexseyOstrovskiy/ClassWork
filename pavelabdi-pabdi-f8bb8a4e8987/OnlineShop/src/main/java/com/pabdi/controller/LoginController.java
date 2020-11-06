package com.pabdi.controller;

import com.pabdi.service.impl.ItemServiceImpl;
import com.pabdi.service.impl.UserServiceImpl;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.bind.support.SessionStatus;

@Controller
@SessionAttributes({"authuser", "checked", "items", "users"})
public class LoginController {

    private static final String ERR_MSG = "incorrect login or password";

    private ItemServiceImpl itemServiceImpl;

    private UserServiceImpl userServiceImpl;

    public LoginController(UserServiceImpl userServiceImpl, ItemServiceImpl itemServiceImpl){
        this.userServiceImpl = userServiceImpl;
        this.itemServiceImpl = itemServiceImpl;
    }

    @RequestMapping(value = "/login", method = { RequestMethod.GET, RequestMethod.POST })
    public String login(Model model) {
        model.addAttribute("users", userServiceImpl.getAll());
        model.addAttribute("items", itemServiceImpl.getAll());
        return "login";
    }

    @RequestMapping(value = "/loginFailed", method = RequestMethod.GET)
    public String loginError(Model model) {
        model.addAttribute("users", userServiceImpl.getAll());
        model.addAttribute("items", itemServiceImpl.getAll());
        model.addAttribute("loginErrorMsg", ERR_MSG);
        model.addAttribute("error", "true");
        return "login";
    }

    @RequestMapping(value = "/logout", method = { RequestMethod.GET, RequestMethod.POST })
    public String logout(SessionStatus session) {
        SecurityContextHolder.getContext().setAuthentication(null);
        session.setComplete();
        return "login";
    }

    @RequestMapping(value = "/postLogin", method = RequestMethod.POST)
    public String postLogin(Model model) {
        // read principal out of security context and set it to session
        UsernamePasswordAuthenticationToken authentication = (UsernamePasswordAuthenticationToken) SecurityContextHolder.getContext().getAuthentication();
        validatePrinciple(authentication.getPrincipal());
        String loggedInUser = ((UserDetails) authentication.getPrincipal()).getUsername();
        model.addAttribute("authuser", loggedInUser);
        return "redirect:/welcome";
    }

    private void validatePrinciple(Object principal) {
        if (!(principal instanceof UserDetails)) {
            throw new IllegalArgumentException("Principal can not be null!");
        }
    }
}
