package com.pabdi.dto;

import com.pabdi.entity.Role;
import com.pabdi.entity.User;

public class UserDto {

    private Integer id;

    private String name;

    private Role role;

    public UserDto(){

    }

    public UserDto(User user){
        this.id = user.getUserId();
        this.name = user.getUserLogin();
        this.role = user.getUserRole();
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String login) {
        this.name = login;
    }

    public Role getRole() {
        return role;
    }

    public void setRole(Role role) {
        this.role = role;
    }
}
