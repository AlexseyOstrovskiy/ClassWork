package com.pabdi.controller;

import com.pabdi.dto.UserDto;
import com.pabdi.entity.User;
import com.pabdi.repository.impl.UserRepository;
import com.pabdi.service.impl.UserServiceImpl;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/users")
public class UserController {

    private final UserServiceImpl userService;

    private final UserRepository userRepository;

    public UserController(UserServiceImpl userService, UserRepository userRepository){
        this.userService = userService;
        this.userRepository = userRepository;
    }

    @GetMapping("/{id}")
    public ResponseEntity<UserDto> getById(@PathVariable Integer id){
        User userEntity = userService.getById(id);
        return ResponseEntity.ok(new UserDto(userEntity));
    }

    @GetMapping
    public ResponseEntity<List<UserDto>> getAll(){
        //log.info()
        List<User> userEntities = userService.getAll();
        return ResponseEntity.ok(userEntities.stream()
                .map(UserDto::new)
                .collect(Collectors.toList()));
    }

    @PostMapping
    public void save(@RequestBody UserDto user){
        userService.addUser(new User(user));
    }

    @PutMapping("/{id}")
    public ResponseEntity<User> change(@RequestBody UserDto newUser, @PathVariable Integer id) {
        return ResponseEntity.ok(userRepository.findById(id)
                .map(user -> {
                    user.setUserLogin(newUser.getName());
                    user.setUserRole(newUser.getRole());
                    return userRepository.save(user);
                })
                .orElseGet(() -> userRepository.save(new User(newUser)))
        );
    }
}
