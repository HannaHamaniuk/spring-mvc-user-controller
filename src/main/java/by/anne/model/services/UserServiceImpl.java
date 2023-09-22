package by.anne.model.services;

import by.anne.model.dao.UserDao;
import by.anne.model.entities.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class UserServiceImpl implements UserService {
    private UserDao dao;

    @Autowired
    public void setDao(UserDao dao) {
        this.dao = dao;
    }

    @Override
    public List<User> getAllUsers() {
        return dao.selectAllUsers();
    }

    @Override
    public void deleteUserById(int id) {
        dao.deleteUserById(id);
    }

    @Override
    public void addUser(User user) {
        dao.addUser(user);
    }
}
