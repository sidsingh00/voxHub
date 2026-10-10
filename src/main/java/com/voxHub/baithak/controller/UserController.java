package com.voxHub.baithak.controller;

import com.voxHub.baithak.entity.UserDetails;
import com.voxHub.baithak.service.UserService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RequestMapping("/api/v1")
@RestController
public class UserController {

    private UserService userService;

    public UserController(UserService userService){
        this.userService = userService;
    }

    @PostMapping("/userDetails")
    private ResponseEntity<UserDetails> userdetail(@RequestBody UserDetails userDetails){
        UserDetails savedUser = userService.createData(userDetails);
        System.out.println(savedUser);
        return new ResponseEntity<>(savedUser, HttpStatus.CREATED);
    }
}
