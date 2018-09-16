package tr.com.obss.dao;

import tr.com.obss.model.Role;
import tr.com.obss.model.Users;

import java.util.List;

public interface UsersDao {

    public void addUser(Users users, int roleID);
    public void editUser(Users users, int userID);
    public void deleteUser(int userID);
    public List<UsersDao> getUser(String userName);
    public List<Users> getAllUser();
}
