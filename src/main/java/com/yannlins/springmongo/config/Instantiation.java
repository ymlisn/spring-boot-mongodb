package com.yannlins.springmongo.config;

import com.yannlins.springmongo.User;
import com.yannlins.springmongo.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;

import java.util.Arrays;

@Configuration
public class Instantiation implements CommandLineRunner {

    @Autowired
    private UserRepository userRepository;

    @Override
    public void run(String... args) throws Exception {

        userRepository.deleteAll();

        User maria = new User (null,"Maria","m@gmail.com");
        User lari = new User (null,"Lari","lari@gmail.com");

        userRepository.save(Arrays.asList(maria,lari));

    }
}
