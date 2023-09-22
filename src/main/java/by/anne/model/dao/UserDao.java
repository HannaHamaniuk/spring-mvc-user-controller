package by.anne.model.dao;

import by.anne.model.entities.User;

import java.util.List;

public interface UserDao {
    List<User>selectAllUsers();
    void deleteUserById(int id);
}
