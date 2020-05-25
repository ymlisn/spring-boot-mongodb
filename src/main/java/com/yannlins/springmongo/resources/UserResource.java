package com.yannlins.springmongo.resources;

import com.yannlins.springmongo.User;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@RestController
@RequestMapping(value = "/users")
public class UserResource {

    @RequestMapping(method = RequestMethod.GET) //or get mapping
    public ResponseEntity<List<User>> findall(){

        User maria = new User("1","yann","ymclins@gmail.com");
        User carlos = new User("1","carlos","carlos@gmail.com");

        List<User> list = new ArrayList<>();

        list.addAll(Arrays.asList(maria,carlos));
        return ResponseEntity.ok().body(list);

    }

}

