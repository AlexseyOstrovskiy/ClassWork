package com.pabdi.repository.impl;

import java.util.List;
import java.util.Optional;

import com.pabdi.repository.AbstractRepository;
import com.pabdi.entity.User;
import org.springframework.stereotype.Repository;

@Repository
public class UserRepository extends AbstractRepository<Integer, User> {

    public UserRepository(){

    }

    public Optional<User> findById(int id) {
        return Optional.of(getByKey(id));
    }

    public Optional<User> findUserByLogin(String login) {
        return getSession()
                .createQuery("FROM User u WHERE u.userLogin =:login", User.class)
                .setParameter("login", login)
                .uniqueResultOptional();
    }

    @SuppressWarnings("unchecked")
    public Optional<List<User>> findAllUsers() {
        return Optional.of(getAll());
    }

    public User save(User user) {
        return persist(user);
    }
}