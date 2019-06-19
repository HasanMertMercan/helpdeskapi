package com.mercanmert.helpdesksystem.Repositories;

import com.mercanmert.helpdesksystem.Entities.User;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class UserRepository implements IBaseRepository {

    @Override
    public List<User> getAll() {
        return null;
    }

    @Override
    public User findById(int id) {
        return null;
    }
}
