package controller;

import model.Test;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HelloController {

    @GetMapping("/")
    public @ResponseBody
    Test home() {
        System.out.println("되냐");
        Test test = new Test();
        System.out.println(test);
        return test;
    }

    @GetMapping("/hello")
    public String hello(Model model, @RequestParam(value = "name", required = false) String name) {
        model.addAttribute("greeting", "안녕 " + name);
        return "hello";
    }
}
