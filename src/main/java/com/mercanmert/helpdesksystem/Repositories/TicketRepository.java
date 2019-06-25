package com.mercanmert.helpdesksystem.Repositories;

import com.mercanmert.helpdesksystem.Entities.Ticket;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface TicketRepository extends CrudRepository<Ticket, Integer> {
    List<Ticket> findByUserId(int ownerId);
    List<Ticket> findByOperatorId(int operatorId);
}
