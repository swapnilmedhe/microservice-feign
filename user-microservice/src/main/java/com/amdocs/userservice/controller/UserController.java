package com.amdocs.userservice.controller;

import com.amdocs.userservice.model.User;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import com.amdocs.userservice.service.UserService;

import java.util.List;

@RestController
@RequestMapping("/user")
@Slf4j
public class UserController {

    @Autowired
    private UserService userService;

    @PostMapping(path = "/save")
    public User save(@RequestBody User user){
        log.info("inside user controller ");
        return userService.saveUser(user);
    }

    @GetMapping(path="/{id}")
    public User getUserById(@PathVariable Long  id){
        log.info("inside user controller ");
        return userService.findByUseruserId(id);
    }

    @GetMapping(path="/all")
    public List<User> getAllUsers(){
        System.out.println("inside controller========================");
        return userService.getAllUsers();
    }

    @DeleteMapping (path="/{id}")
    public void getUser(@PathVariable Long id){
        System.out.println("deleting User of Id"+id);
        if(userService.findByUseruserId(id)!=null)
        {
            userService.deleteUser(id);
        }else {
            log.error("User with id :"+id+"not present");
        }
    }

}
