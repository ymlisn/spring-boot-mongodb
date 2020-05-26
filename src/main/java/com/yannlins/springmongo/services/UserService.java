package com.yannlins.springmongo.services;

import com.yannlins.springmongo.User;
import com.yannlins.springmongo.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {

    @Autowired
    private UserRepository repo;

    public List<User> findAll(){

        return repo.findAll();



    }

}
