package com.example.demo.dao;

import com.example.demo.entity.User;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class UserRepository {

    private List<User> userList = new ArrayList<>();

    public void add(User user) {
        userList.add(user);

    }

    public List<User> findAll() {
        return userList;
    }
}
