package com.mercanmert.helpdesksystem.Repositories;

import com.mercanmert.helpdesksystem.Entities.Operator;
import com.mercanmert.helpdesksystem.Entities.Ticket;
import com.mercanmert.helpdesksystem.Entities.User;
import com.mercanmert.valuetypes.enums.Department;
import com.mercanmert.valuetypes.enums.Location;
import com.mercanmert.valuetypes.enums.TicketStatus;

import java.util.List;

public class TicketRepository implements IBaseRepository, ITicketRepository {
    @Override
    public List<Ticket> getAll() {
        //Create new database connection,
        //Retrieve all Tickets from database
        //Close connection
        return null;
    }

    @Override
    public Ticket findById(int id) {
        return null;
    }

    @Override
    public Ticket findByName(String name) {
        return null;
    }

    @Override
    public List<Ticket> findByDepartment(Department department) {
        return null;
    }

    @Override
    public List<Ticket> findByLocation(Location location) {
        return null;
    }

    @Override
    public void createNewTicket(Ticket ticket) {

    }

    @Override
    public void updateTicket(Ticket ticket) {

    }

    @Override
    public void deleteTicket(int ticketId) {

    }

    @Override
    public Ticket findByTicketStatus(TicketStatus ticketStatus) {
        return null;
    }

    @Override
    public Ticket findByTicketOwner(User ticketOwner) {
        return null;
    }

    @Override
    public Ticket findByOperator(Operator operator) {
        return null;
    }
}
