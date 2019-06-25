package com.mercanmert.helpdesksystem.Repositories;
import com.mercanmert.helpdesksystem.Entities.User;
import com.mercanmert.valuetypes.enums.Department;
import com.mercanmert.valuetypes.enums.Location;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface UserRepository extends CrudRepository<User, Integer> {
    User findByUsername(String username);
    User findByEmail(String email);
    User findByPhoneNumber(String phoneNumber);
    List<User> findByDepartment(Department department);
    List<User> findByLocation(Location location);

}
