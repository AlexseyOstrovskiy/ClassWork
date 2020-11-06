package com.pabdi.service.impl;

import com.pabdi.entity.User;
import com.pabdi.repository.impl.UserRepository;
import com.pabdi.service.EntityService;
import org.springframework.stereotype.Service;

import javax.persistence.NoResultException;
import java.util.List;

@Service
public class UserServiceImpl implements EntityService {

    private UserRepository userRepository;

    public UserServiceImpl(UserRepository userRepository){
        this.userRepository = userRepository;
    }

    @Override
    public List<User> getAll(){
        return userRepository.findAllUsers()
                .orElseThrow(() -> new NoResultException("No users found"));
    }

    @Override
    public User getById(int id) {
        return userRepository.findById(id)
                .orElseThrow(() -> new NoResultException("No user found with username " + id));
    }

    public User getUserByLogin(String login) {
        return userRepository.findUserByLogin(login)
                .orElseThrow(() -> new NoResultException("No user found with username " + login));
    }

    public void addUser(User user){
        userRepository.save(user);
    }
}
