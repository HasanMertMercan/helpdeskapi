package com.mercanmert.helpdesksystem.Repositories;

import java.util.List;

public interface IBaseRepository {

    public List<?> getAll();

    public Object findById(int id) ;

}
