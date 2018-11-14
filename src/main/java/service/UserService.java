package service;

import dao.UserMapper;
import model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService implements BaseService<User> {

    @Autowired
    private UserMapper userMapper;

    public void createUser(User user) {
        System.out.println("createUser : " + user.toString());
    }

    public User findOneById(Integer id) {
        return userMapper.getUser(id);
    }
}
