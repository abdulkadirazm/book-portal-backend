package tr.com.obss.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.validation.Errors;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.ModelAndView;
import tr.com.obss.dao.UsersDao;
import tr.com.obss.model.Role;
import tr.com.obss.model.Users;
import tr.com.obss.service.UsersService;

import java.util.ArrayList;
import java.util.List;

@Controller
@ResponseBody
@RequestMapping("users")
public class UsersRestController {

    @Autowired
    private UsersService usersService;

    @GetMapping
    public List<Users> getUsers() {
        return usersService.getAllUser();
    }

    @GetMapping("/{userName}")
    public List<UsersDao> getUser(@PathVariable String userName) {
        return usersService.getUser(userName);
    }

    @PostMapping("/{roleID}")
    public Users saveUser(@RequestBody Users users, @PathVariable int roleID) {
        return usersService.addUser(users, roleID);
    }

    @PutMapping("/{userID}")
    public Users updateUser(@PathVariable int userID, @RequestBody Users users) {
        return usersService.editUser(users,userID);
    }

    @DeleteMapping("/{userID}")
    public void deleteUser(@PathVariable int userID) {
        usersService.deleteUser(userID);
    }
}
