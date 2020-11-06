package com.pabdi.service;

import com.pabdi.entity.User;
import com.pabdi.service.impl.UserServiceImpl;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service("userDetailsService")
public class UserDetailsServiceImpl implements UserDetailsService {

    private static final Logger log = LoggerFactory.getLogger(UserDetailsServiceImpl.class);

    private final UserServiceImpl userService;

    public UserDetailsServiceImpl(UserServiceImpl userService){
        this.userService = userService;
    }

    @Transactional(readOnly = true)
    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        User user = userService.getUserByLogin(username);
        if (user == null) {
            throw new UsernameNotFoundException("User not found.");
        }
        log.info("loadUserByUsername() : {}", username);
        String userLogin = user.getUserLogin();
        String userPassword = user.getUserPassword();
        String userRole = user.getUserRole().toString();
        return org.springframework.security.core.userdetails.User
                .withUsername(userLogin)
                .password(userPassword)
                .roles(userRole)
                .build();
    }
}