package dao;

import entity.User;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by leeezm on 17-9-6.
 */
@Repository("UserDAO")
public interface UserDAO {
    public int insertUser(User user);

    public int deleteUser(int id);

    public List<User> listUser();
}
