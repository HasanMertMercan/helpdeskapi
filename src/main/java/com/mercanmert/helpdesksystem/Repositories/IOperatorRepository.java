package com.mercanmert.helpdesksystem.Repositories;

import com.mercanmert.helpdesksystem.Entities.Operator;
import com.mercanmert.helpdesksystem.Entities.Ticket;
import com.mercanmert.helpdesksystem.Entities.User;

import java.util.List;

public interface IOperatorRepository {
    void deleteOperator();
    List<Ticket> findTicketsOnOperator(Operator operator);
}
