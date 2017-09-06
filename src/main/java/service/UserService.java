package service;

import dao.UserDAO;
import entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by leeezm on 17-9-6.
 */

@Service("UserService")
public class UserService {
    @Autowired
    private UserDAO userDAO;

    public List<User> listUser(){
        return userDAO.listUser();
    }
}
