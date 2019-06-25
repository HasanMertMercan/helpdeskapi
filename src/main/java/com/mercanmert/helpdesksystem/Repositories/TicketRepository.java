package com.mercanmert.helpdesksystem.Repositories;

import com.mercanmert.helpdesksystem.Entities.Ticket;
import com.mercanmert.valuetypes.enums.TicketStatus;
import org.springframework.data.repository.CrudRepository;

import java.util.Date;
import java.util.List;

public interface TicketRepository extends CrudRepository<Ticket, Integer> {
    List<Ticket> findByUserId(int ownerId);
    List<Ticket> findByOperatorId(int operatorId);
    List<Ticket> findByCreatedDate(Date createdDate);
    List<Ticket> findByCancelledDate(Date cancelledDate);
    List<Ticket> findByPostponedDate(Date postponedDate);
    List<Ticket> findBySolvedDate(Date solvedDate);
    List<Ticket> findByTicketStatus(TicketStatus ticketStatus);
}
