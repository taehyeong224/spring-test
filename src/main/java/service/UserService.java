package service;

import model.User;
import org.springframework.stereotype.Service;

@Service
public class UserService {
    public void createUser(User user) {
        System.out.println("createUser : " + user.toString());
    }
}
