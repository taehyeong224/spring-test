package controller;


import model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import service.UserService;

@Controller("/user")
public class UserController {

    @Autowired
    private UserService userService;

    @GetMapping("/{id}")
    public @ResponseBody User home(@PathVariable Integer id) {
        User user = userService.findOneById(id);
        return user;
    }
}
