package com.mercanmert.helpdesksystem.Repositories;
import com.mercanmert.helpdesksystem.Entities.User;

public interface IUserRepository {

    void createUser(User user);
    void updateUser(User user);
    void deleteUser(int userId);

    User findByEmail(String email);
}
