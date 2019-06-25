package com.mercanmert.helpdesksystem.Services;

import com.mercanmert.helpdesksystem.Entities.User;
import com.mercanmert.helpdesksystem.Repositories.UserRepository;
import com.mercanmert.valuetypes.enums.Department;
import com.mercanmert.valuetypes.enums.Location;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    public List<User> getAllUsers(){
        List<User> userList = new ArrayList<>();
        userRepository.findAll().forEach(userList::add);
        return userList;
    }

    public List<User> getAllUsersByDepartment(Department department){
        List<User> userList;
        userList = userRepository.findByDepartment(department);
        return userList;
    }

    public List<User> getAllUsersByLocation(Location location){
        List<User> userList;
        userList = userRepository.findByLocation(location);
        return userList;
    }

    public User getUserById(int userId){
        User user;
        user = userRepository.findById(userId).orElse(null);
        return user;
    }

    public User getUserByUsername(String username){
        User user;
        user = userRepository.findByUsername(username);
        return user;
    }

    public User getUserByEmail(String email){
        User user;
        user = userRepository.findByEmail(email);
        return user;
    }

    public User getUserByPhonenumber(String phoneNumber){
        User user;
        user = userRepository.findByPhoneNumber(phoneNumber);
        return user;
    }

    public void addUser(User user){
        userRepository.save(user);
    }

    public void updateUser(User user){
        userRepository.save(user);
    }

    public void deleteUser(User user){
        userRepository.delete(user);
    }

    public void deleteUserById(int userId){
        userRepository.deleteById(userId);
    }


}
