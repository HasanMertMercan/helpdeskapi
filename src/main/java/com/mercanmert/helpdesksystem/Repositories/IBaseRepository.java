package com.mercanmert.helpdesksystem.Repositories;

import java.util.List;

public interface IBaseRepository {

    List<?> getAll();
    Object findById(int id) ;
    Object findByName(String name);
}
