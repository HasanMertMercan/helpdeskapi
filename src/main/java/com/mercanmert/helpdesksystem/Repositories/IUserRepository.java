package com.mercanmert.helpdesksystem.Repositories;
import com.mercanmert.helpdesksystem.Entities.User;

public interface IUserRepository {

    void createNewUser(User user);
    void updateUser(User user);
    void deleteUser(int userId);
}
