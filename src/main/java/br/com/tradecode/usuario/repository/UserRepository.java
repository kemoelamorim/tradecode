package br.com.tradecode.usuario.repository;

import java.util.LinkedList;
import java.util.List;
import org.springframework.stereotype.Service;
import br.com.tradecode.usuario.model.User;

@Service
public class UserRepository {
  private LinkedList<User> users = new LinkedList<User>();
  public List<User> getUsers() {
    return users;
  }
  public User addUser(User user){
    this.users.add(user);
    return user;
  }
}
