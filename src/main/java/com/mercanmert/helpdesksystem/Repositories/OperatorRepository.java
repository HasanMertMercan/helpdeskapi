package com.mercanmert.helpdesksystem.Repositories;

import com.mercanmert.helpdesksystem.Entities.Operator;
import com.mercanmert.valuetypes.enums.Department;
import com.mercanmert.valuetypes.enums.Location;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface OperatorRepository extends CrudRepository<Operator, Integer> {
    Operator findByUsername(String username);
    Operator findByEmail(String email);
    Operator findByPhoneNumber(String phoneNumber);
    List<Operator> findByDepartment(Department department);
    List<Operator> findByLocation(Location location);
}
