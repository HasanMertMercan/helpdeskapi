package com.mercanmert.helpdesksystem.Repositories;

import com.mercanmert.helpdesksystem.Entities.Operator;
import com.mercanmert.helpdesksystem.Entities.Ticket;
import com.mercanmert.helpdesksystem.Entities.User;
import com.mercanmert.valuetypes.enums.TicketStatus;

public interface ITicketRepository {
    void createNewTicket(Ticket ticket);
    void updateTicket(Ticket ticket);
    void deleteTicket(int ticketId);
    Ticket findByTicketStatus(TicketStatus ticketStatus);
    Ticket findByTicketOwner(User ticketOwner);
    Ticket findByOperator(Operator operator);
}
