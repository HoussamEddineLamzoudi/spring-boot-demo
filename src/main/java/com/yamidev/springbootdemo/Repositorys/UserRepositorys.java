package com.yamidev.springbootdemo.Repositorys;

import com.yamidev.springbootdemo.Models.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface UserRepositorys extends JpaRepository <User, Integer> {

}
