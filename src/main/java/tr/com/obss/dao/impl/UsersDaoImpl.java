package tr.com.obss.dao.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;
import tr.com.obss.dao.UsersDao;
import tr.com.obss.model.Role;
import tr.com.obss.model.Users;

import java.util.List;

@Repository("usersDao")
public class UsersDaoImpl implements UsersDao {

    @Autowired
    JdbcTemplate jdbcTemplate;

    @Override
    public void addUser(Users users) {
        jdbcTemplate.update("INSERT INTO users (userID, username, email, password, roleID) VALUES (?, ?, ?, ?, ?)",
                users.getUserID(), users.getUsername(), users.getEmail(), users.getPassword(), users.getRoleID());
        System.out.println("User Added!!");
    }

    @Override
    public void editUser(Users users, int userID) {
        jdbcTemplate.update("UPDATE users SET username = ? , email = ? , password = ? WHERE userID = ? ",
                users.getUsername(), users.getEmail(), users.getPassword(), userID);
        System.out.println("User Updated!!");
    }

    @Override
    public void deleteUser(int userID) {
        jdbcTemplate.update("DELETE from users WHERE userID = ? ", userID);
        System.out.println("User Deleted!!");
    }

    @Override
    public List getUser(String userName) {


        List<UsersDao> users = jdbcTemplate.query("SELECT * FROM users WHERE username like ? ",new String[]{"%"+ userName + "%"}, new BeanPropertyRowMapper(Users.class));

        return users;
    }

    @Override
    public List getAllUser() {
        List < UsersDao > users = jdbcTemplate.query("SELECT * FROM users ORDER BY username", new BeanPropertyRowMapper(Users.class));
        return users;
    }

    public void setJdbcTemplate(JdbcTemplate jdbcTemplate){
        this.jdbcTemplate = jdbcTemplate;
    }
}