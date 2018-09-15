package tr.com.obss.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tr.com.obss.dao.UsersDao;
import tr.com.obss.model.Users;
import tr.com.obss.service.UsersService;

import java.util.List;

@Service
public class UsersServiceImpl implements UsersService {


    @Autowired
    private UsersDao usersDao;

    @Override
    public Users addUser(Users users) {
        usersDao.addUser(users);
        return users;
    }

    @Override
    public Users editUser(Users users, int userID) {
        usersDao.editUser(users,userID);
        return users;
    }

    @Override
    public void deleteUser(int userID) {
        usersDao.deleteUser(userID);
    }

    @Override
    public List<UsersDao> getUser(String userName) {
        return usersDao.getUser(userName);
    }

    @Override
    public List<Users> getAllUser() {
        return usersDao.getAllUser();
    }
}
