package com.mercanmert.helpdesksystem.Controllers;

import com.mercanmert.helpdesksystem.Entities.User;
import com.mercanmert.helpdesksystem.Services.UserService;
import com.mercanmert.valuetypes.enums.Department;
import com.mercanmert.valuetypes.enums.Location;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.ServletRequestBindingException;
import org.springframework.web.bind.annotation.*;

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

    @RequestMapping("/users/location/{location}")
    public List<User> getAllUsersByLocation(@PathVariable Location location){
        List<User> userList;
        userList = userService.getAllUsersByLocation(location);
        return userList;
    }

    @RequestMapping("/users/user/{id}")
    public User getUserById(@PathVariable int userId){
        User user;
        user = userService.getUserById(userId);
        return user;
    }

    @RequestMapping("/users/user/{username}")
    public User getUserByUsername(@PathVariable String username){
        User user;
        user = userService.getUserByUsername(username);
        return user;
    }

    @RequestMapping("/users/user/{email}")
    public User getUserByEmail(@PathVariable String email){
        User user;
        user = userService.getUserByEmail(email);
        return user;
    }

    @RequestMapping("/users/user/{phoneNumber}")
    public User getUserByPhonenumber(@PathVariable String phoneNumber){
        User user;
        user = userService.getUserByPhonenumber(phoneNumber);
        return user;
    }

    @RequestMapping(method = RequestMethod.POST, value = "/users/add")
    public void addUser(@RequestBody User user){
        userService.addUser(user);
    }

    @RequestMapping(method = RequestMethod.PUT, value = "/users/update")
    public void updateUser(@RequestBody User user){
        userService.updateUser(user);
    }

    @RequestMapping(method = RequestMethod.DELETE, value = "/users/user/{userId}/delete")
    public void deleteUser(@PathVariable int userId){
        userService.deleteUserById(userId);
    }



}
