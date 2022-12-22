package com.yamidev.springbootdemo.Controllers;

import com.yamidev.springbootdemo.Models.User;
import com.yamidev.springbootdemo.Request.UserRequest;
import com.yamidev.springbootdemo.Services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping(value = "/api/v1/user")
public class UserController {
    private final UserService userService;

    @Autowired
    public UserController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping
    public List<User> getUsers(){
       return userService.find_all_users();
    }
    @GetMapping("{userId}")
    public User getUser(@PathVariable Integer userId){
        return userService.find_user(userId);
    }

    @PostMapping
    public void addUser(@RequestBody UserRequest userRequest){
        userService.save_user(userRequest);
    }
    @DeleteMapping("{userId}")
    public void deleteUser(@PathVariable("userId") Integer id){
        userService.remove_user(id);
    }

    @PutMapping("{userId}")
    public void updateUser(
            @PathVariable Integer userId,
            @RequestBody UserRequest userRequest
    ){
        User user = userService.find_user(userId);
        userService.update(user, userRequest);
    }
}
