package com.pabdi.entity;

import com.pabdi.dto.UserDto;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "users")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Integer userId;

    @Column(name = "login")
    private String userLogin;

    @Column(name = "password")
    private String userPassword;

    @Enumerated(EnumType.STRING)
    @Column(name = "role")
    private Role userRole;

    @OneToMany
    @Column(name = "orders")
    private List<Order> orders = new ArrayList<>();

    public User(){

    }

    public User(UserDto user){
//        this.userId = user.getId();
        this.userLogin = user.getName();
        this.userRole = user.getRole();
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer id) {
        this.userId = id;
    }

    public String getUserLogin() {
        return userLogin;
    }

    public void setUserLogin(String login) {
        this.userLogin = login;
    }

    public String getUserPassword() {
        return userPassword;
    }

    public void setUserPassword(String password) {
        this.userPassword = password;
    }

    public Role getUserRole() {
        return userRole;
    }

    public void setUserRole(Role role) {
        this.userRole = role;
    }

    public List<Order> getOrders() {
        return orders;
    }

    public void setOrders(List<Order> orders) {
        this.orders = orders;
    }
}
