package com.yamidev.springbootdemo.Controllers;

import com.yamidev.springbootdemo.Dto.UserDto;
import com.yamidev.springbootdemo.Models.User;
import com.yamidev.springbootdemo.Request.UserRequest;
import com.yamidev.springbootdemo.Response.UserResponse;
import com.yamidev.springbootdemo.Services.UserService;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/api/v1/user")
public class UserController {
    @Autowired
    private UserService userService;

    @GetMapping
    public List<User> getUsers(){
       return userService.find_all_users();
    }
    @GetMapping("{userId}")
    public User getUser(@PathVariable Integer userId){
        return userService.find_user(userId);
    }

    @PostMapping
    public UserResponse addUser(@RequestBody UserRequest userRequest){

        //object mapping
        UserDto userDto = new UserDto();
        BeanUtils.copyProperties(userRequest, userDto);

        UserDto createdUser = userService.save_user(userDto);

        UserResponse userResponse = new UserResponse();
        BeanUtils.copyProperties(createdUser, userResponse);
        return userResponse;
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
