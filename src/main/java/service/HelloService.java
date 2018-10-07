package service;

import org.springframework.stereotype.Service;

@Service
public class HelloService {

    public void say(String msg) {
        System.out.println(msg);
    }
}
