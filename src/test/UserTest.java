import dao.UserDAO;
import entity.User;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by leeezm on 17-9-6.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration({"classpath:config/spring-MVC.xml"
        ,"classpath:config/spring-mybatis.xml"})
public class UserTest {
    @Autowired
    private UserDAO userDAO;

    @Test
    public void insert(){
        User user=new User();
        user.setName("leeezm");
        user.setAge(21);
        int flag=userDAO.insertUser(user);
        System.out.println("flag="+flag);
    }

    @Test
    public void delete(){
        int flag=userDAO.deleteUser(2);
        System.out.println("flag="+flag);
    }

    @Test
    public void get(){
        List<User> users=userDAO.listUser();
        for(User user:users){
            System.out.println("id:"+user.getId()+" name:"+user.getName()+" age:"+user.getAge());
        }
    }
}
