package com.mercanmert.helpdesksystem.Repositories;

import com.mercanmert.helpdesksystem.Entities.User;
import com.mercanmert.valuetypes.enums.Department;
import com.mercanmert.valuetypes.enums.Location;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class UserRepository implements IBaseRepository, IUserRepository {

    @Override
    public List<User> getAll() {
        return null;
    }

    @Override
    public User findById(int id) {
        return null;
    }

    @Override
    public User findByName(String name) {
        return null;
    }

    @Override
    public List<User> findByDepartment(Department department) {
        return null;
    }

    @Override
    public List<User> findByLocation(Location location) {
        return null;
    }

    @Override
    public void createUser(User user) {

    }

    @Override
    public void updateUser(User user) {

    }

    @Override
    public void deleteUser(int userId) {

    }

    @Override
    public User findByEmail(String email) {
        return null;
    }
}
