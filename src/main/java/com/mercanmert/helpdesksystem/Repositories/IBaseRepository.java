package com.mercanmert.helpdesksystem.Repositories;

import com.mercanmert.valuetypes.enums.Department;
import com.mercanmert.valuetypes.enums.Location;

import java.util.List;

public interface IBaseRepository {

    List<?> getAll();
    Object findById(int id) ;
    Object findByName(String name);
    List<?> findByDepartment(Department department);
    List<?> findByLocation(Location location);
}
