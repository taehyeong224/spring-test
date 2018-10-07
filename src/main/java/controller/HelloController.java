package controller;

import model.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import service.HelloService;

@Controller
public class HelloController {

    @Autowired
    private HelloService helloService;

    @GetMapping("/")
    public @ResponseBody
    Test home() {
        System.out.println("되냐");
        Test test = new Test();
        helloService.sayHello();
        return test;
    }

    @GetMapping("/hello")
    public String hello(Model model, @RequestParam(value = "name", required = false) String name) {
        helloService.sayHello();
        model.addAttribute("greeting", "안녕 " + name);
        return "hello";
    }
}
