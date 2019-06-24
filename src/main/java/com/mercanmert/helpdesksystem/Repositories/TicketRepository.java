package com.mercanmert.helpdesksystem.Repositories;

import com.mercanmert.helpdesksystem.Entities.Ticket;
import org.springframework.data.repository.CrudRepository;

public interface TicketRepository extends CrudRepository<Ticket, Integer> {
}
