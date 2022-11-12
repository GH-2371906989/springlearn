package learn.gu.com.service;

import learn.gu.com.dao.UserDao;
import lombok.Data;

@Data
public class UserServiceImpl implements UserService{
    private UserDao userDao;
    @Override
    public String getName() {
        return userDao.getName();
    }
}
