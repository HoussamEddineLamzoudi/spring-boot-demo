package com.yamidev.springbootdemo.Services;

import com.yamidev.springbootdemo.Dto.UserDto;
import com.yamidev.springbootdemo.Models.User;
import com.yamidev.springbootdemo.Repositorys.UserRepositorys;
import com.yamidev.springbootdemo.Request.UserRequest;
import jakarta.transaction.Transactional;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Transactional
public class UserService {

    private final UserRepositorys userRepositorys;
    public UserService(UserRepositorys userRepositorys) {
        this.userRepositorys = userRepositorys;
    }

    public User find_user(Integer userId) {
        return userRepositorys.findById(userId).get();
    }
    public List<User> find_all_users() {
        return userRepositorys.findAll();
    }
    public UserDto save_user(UserRequest userRequest){
        User user = new User();
        user.setUsername(userRequest.username());
        user.setEmail(userRequest.email());
        user.setPassword(userRequest.password());
        userRepositorys.save(user);
        UserDto userDto = new UserDto();
        BeanUtils.copyProperties(user, userDto);
        return userDto;
    }

    public void remove_user(Integer id) {
        userRepositorys.deleteById(id);
    }

    public void update(User user, UserRequest userRequest) {
            user.setUsername(userRequest.username());
            user.setEmail(userRequest.email());
            user.setPassword(userRequest.password());
            userRepositorys.save(user);
    }


}
