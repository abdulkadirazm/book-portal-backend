package tr.com.obss.service;

import tr.com.obss.dao.UsersDao;
import tr.com.obss.model.Users;

import java.util.List;

public interface UsersService {

    public Users addUser(Users users);
    public Users editUser(Users users, int userID);
    public void deleteUser(int userID);
    public List<UsersDao> getUser(String userName);
    public List<Users> getAllUser();
}
