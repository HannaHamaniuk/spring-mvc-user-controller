package by.anne.controllers;

import by.anne.config.Init;
import by.anne.model.entities.User;
import by.anne.model.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

import static by.anne.constants.AppConstants.*;

@Controller
public class UserController {
    private UserService service;

    @Autowired
    public void setService(UserService service) {
        this.service = service;
    }

    @GetMapping("/")
    public String goToIndex() {
        return "index";
    }

    @GetMapping(value = ALL_USER_URL)
    public String all(Model model) {
        List<User> users = service.getAllUsers();
        model.addAttribute(USER_LIST_ATTR, users);
        return USER_PAGE;

    }

    @GetMapping(value = DELETE_USER_URL)
    public String delete(int id) {
        service.deleteUserById(id);
        return INDEX_PAGE;

    }

    @GetMapping(value = ADD_USER_URL)
    public ModelAndView add() {
        ModelAndView modelAndView = new ModelAndView(ADD_USER_PAGE, USER_ATTR, new User());//создается обект который ориентируется на страничку add
        //и мы туда передаем  аттрибут user, которму установим пустой обект юзера и на этой страничке через кнопку сабмит просетаем ему поля
        // другой сервлет сохранит уже готового юзера в базу данных
        return modelAndView;

    }

    @PostMapping(value = SAVE_USER_URL)
    public String save(@ModelAttribute(name = USER_ATTR) User user) {
        service.addUser(user);
        return "redirect:" + ALL_USER_URL;
    }
}
