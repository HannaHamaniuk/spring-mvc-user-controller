package by.anne.model.services;

import by.anne.model.entities.User;

import java.util.List;

public interface UserService {
    List<User> getAllUsers();
    void deleteUserById(int id);
    void addUser(User user);
}

