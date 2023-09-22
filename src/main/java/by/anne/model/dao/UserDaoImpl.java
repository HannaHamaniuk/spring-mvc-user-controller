package by.anne.model.dao;

import by.anne.model.entities.User;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class UserDaoImpl implements UserDao {
    @Override
    public List<User> selectAllUsers() {
        return new ArrayList<>();
    }
}
