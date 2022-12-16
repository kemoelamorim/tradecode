package br.com.tradecode.usuario.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.tradecode.usuario.model.User;
import br.com.tradecode.usuario.repository.UserRepository;

@RestController
@RequestMapping("user")
public class UserController {
  
  @Autowired
  private UserRepository userRepository;
  
  @GetMapping("")
  public List<User> listUsers(){
    return userRepository.getUsers();
  }
  @PostMapping("")
  public User postUser(){
    var user = new User();
    user.setUsername("Kemoel");
    return userRepository.addUser(user);
  }
}
