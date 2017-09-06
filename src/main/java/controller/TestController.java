package controller;

import entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import service.UserService;

import java.util.List;

/**
 * Created by leeezm on 17-9-6.
 */

@Controller("TestController")
@RequestMapping("/t")
public class TestController {

    @Autowired
    private UserService userService;

    @RequestMapping("")
    public ModelAndView listUser()
    {
        List<User> userList=userService.listUser();
        ModelAndView mav=new ModelAndView("test");
        mav.addObject("users",userList);
        return mav;
    }
}
