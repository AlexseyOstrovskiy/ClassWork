package com.pabdi.controller;

import com.pabdi.entity.Role;
import com.pabdi.entity.User;
import com.pabdi.service.impl.UserServiceImpl;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/signup")
public class SignUpController {

    private UserServiceImpl userServiceImpl;

    private PasswordEncoder passwordEncoder;

    public SignUpController(UserServiceImpl userServiceImpl, PasswordEncoder passwordEncoder){
        this.passwordEncoder = passwordEncoder;
        this.userServiceImpl = userServiceImpl;
    }

    @RequestMapping(method = { RequestMethod.GET, RequestMethod.POST })
    public String registerUser(@RequestParam(name = "username") String login,
                               @RequestParam(name = "password") String password) {

        User newUser = new User();

        if (!(login.equals("")) && (!(password.equals("")))){
            newUser.setUserLogin(login);
            newUser.setUserPassword(passwordEncoder.encode(password));
            newUser.setUserRole(Role.USER);
            userServiceImpl.addUser(newUser);
        }

        return "redirect:/login";
    }
}
