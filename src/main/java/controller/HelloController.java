package controller;

import model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import service.HelloService;
import service.UserService;

@Controller
public class HelloController {

    @Autowired
    private HelloService helloService;

    @Autowired
    private UserService userService;

    @GetMapping("/")
    public @ResponseBody
    User home() {
        System.out.println("되냐");
        User User = new User();
        helloService.say("home!!");
        return User;
    }

    @GetMapping("/hello")
    public String hello(Model model, @RequestParam(value = "name", required = false) String name) {
        helloService.say("hello get");
        model.addAttribute("greeting", "안녕 " + name);
        return "hello";
    }

    @GetMapping("/join")
    public String joinForm() {
        helloService.say("join form");
        return "join";
    }

    @PostMapping("/join")
    public String join(User user) {
        userService.createUser(user);
        return "joinComplete";
    }
}
