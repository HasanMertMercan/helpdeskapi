package com.mercanmert.helpdesksystem.Repositories;
import com.mercanmert.helpdesksystem.Entities.User;
import org.springframework.data.repository.CrudRepository;

public interface UserRepository extends CrudRepository<User, Integer> {

}
