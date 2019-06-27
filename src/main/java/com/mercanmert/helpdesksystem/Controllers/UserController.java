package com.mercanmert.helpdesksystem.Controllers;

import com.mercanmert.helpdesksystem.Entities.User;
import com.mercanmert.helpdesksystem.Services.UserService;
import com.mercanmert.valuetypes.enums.Department;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class UserController {

    @Autowired
    private UserService userService;

    @RequestMapping("/users")
    public List<User> getAllUsers(){
        List<User> userList;
        userList = userService.getAllUsers();
        return userList;
    }

    @RequestMapping("/users/department/{department}")
    public List<User> getAllUsersByDepartment(@PathVariable Department department){
        List<User> userList;
        userList = userService.getAllUsersByDepartment(department);
        return userList;
    }
}
