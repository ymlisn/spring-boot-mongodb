package com.yannlins.springmongo.resources;

import com.yannlins.springmongo.DTO.UserDTO;
import com.yannlins.springmongo.User;
import com.yannlins.springmongo.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping(value = "/users")
public class UserResource {

    @Autowired
    private UserService service;


    @RequestMapping(method = RequestMethod.GET) //or get mapping
    public ResponseEntity<List<UserDTO>> findall(){

        List<User> list = service.findAll();
        List<UserDTO> dtoList = list.stream().map(x->new UserDTO(x)).collect(Collectors.toList());
        return ResponseEntity.ok().body(dtoList);

    }

}

