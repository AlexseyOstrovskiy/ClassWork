package com.pabdi.controller;

import com.pabdi.entity.User;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RestfulController {

    @RequestMapping(value = "/test", method = { RequestMethod.GET, RequestMethod.POST })
    public ResponseEntity<User> getUser(){
        User user = new User();
        user.setUserLogin("kurhgi");
        user.setUserPassword("yfigwbie");
        return new ResponseEntity<>(user, HttpStatus.OK);
    }
}
