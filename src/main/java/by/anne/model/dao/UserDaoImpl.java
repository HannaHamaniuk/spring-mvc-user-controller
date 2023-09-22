package by.anne.model.dao;

import by.anne.model.entities.User;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class UserDaoImpl implements UserDao {
    private SessionFactory factory;
    @Autowired
    public void setFactory(SessionFactory factory) {
        this.factory = factory;
    }

    @Override
    public List<User> selectAllUsers() {

        try(Session session= factory.openSession()){
           return  session.createQuery("From User",User.class).list();
        }
    }
}
