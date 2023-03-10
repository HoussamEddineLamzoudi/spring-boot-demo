package com.yamidev.springbootdemo.Services;

import com.yamidev.springbootdemo.Dto.UserDto;
import com.yamidev.springbootdemo.Models.User;
import com.yamidev.springbootdemo.Repositorys.UserRepositorys;
import com.yamidev.springbootdemo.Request.UserRequest;
import jakarta.transaction.Transactional;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Transactional
public class UserService {
    @Autowired
    private UserRepositorys userRepositorys;
//    public UserService(UserRepositorys userRepositorys) {
//        this.userRepositorys = userRepositorys;
//    }

    public User find_user(Integer userId) {
        return userRepositorys.findById(userId).get();
    }
    public User find_user_by_email(String email){
        System.out.println("ur in user UserService and you'll used find_user_by_email :");
        return userRepositorys.findByEmail(email);
    }
    public List<User> find_all_users() {
        return userRepositorys.findAll();
    }
    public UserDto save_user(UserDto userData){
        if(userRepositorys.findByEmail(userData.getEmail()) != null) throw new RuntimeException("Deja Deja hhhh");
        else {
            User user = new User();
            BeanUtils.copyProperties(userData, user);
            User newUser = userRepositorys.save(user);
            UserDto userDto = new UserDto();
            BeanUtils.copyProperties(newUser, userDto);
            return userDto;
        }
    }

    public void remove_user(Integer id) {
        userRepositorys.deleteById(id);
    }

    public void update(User user, UserRequest userRequest) {
            user.setUsername(userRequest.getUsername());
            user.setEmail(userRequest.getEmail());
            user.setPassword(userRequest.getPassword());
            userRepositorys.save(user);
    }



}
