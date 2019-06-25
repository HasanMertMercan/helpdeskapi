package com.mercanmert.helpdesksystem.Services;

import com.mercanmert.helpdesksystem.Entities.Ticket;
import com.mercanmert.helpdesksystem.Repositories.TicketRepository;
import com.mercanmert.valuetypes.enums.TicketStatus;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Service
public class TicketService {

    @Autowired
    private TicketRepository ticketRepository;

    public List<Ticket> getAllTickets(){
        List<Ticket> ticketList = new ArrayList<>();
        ticketRepository.findAll().forEach(ticketList::add);
        return ticketList;
    }

    public List<Ticket> getAllByOwnerId(int ownerId){
        List<Ticket> ticketList;
        ticketList = ticketRepository.findByUserId(ownerId);
        return ticketList;
    }

    public List<Ticket> getAllByOperatorId(int operatorId){
        List<Ticket> ticketList;
        ticketList = ticketRepository.findByOperatorId(operatorId);
        return  ticketList;
    }

    public List<Ticket> getAllByCreatedDate(Date createdDate){
        List<Ticket> ticketList;
        ticketList = ticketRepository.findByCreatedDate(createdDate);
        return  ticketList;
    }

    public List<Ticket> getAllBySolvedDate(Date solvedDate){
        List<Ticket> ticketList;
        ticketList = ticketRepository.findBySolvedDate(solvedDate);
        return  ticketList;
    }

    public List<Ticket> getAllByCancelledDate(Date cancelledDate){
        List<Ticket> ticketList;
        ticketList = ticketRepository.findByCancelledDate(cancelledDate);
        return  ticketList;
    }

    public List<Ticket> getAllByPostponedDate(Date postponedDate){
        List<Ticket> ticketList;
        ticketList = ticketRepository.findByPostponedDate(postponedDate);
        return  ticketList;
    }

    public List<Ticket> getAllByTicketStatus(TicketStatus ticketStatus){
        List<Ticket> ticketList;
        ticketList = ticketRepository.findByTicketStatus(ticketStatus);
        return ticketList;
    }

    public Ticket getTicketById(int ticketId){
        Ticket ticket;
        ticket = ticketRepository.findById(ticketId).orElse(null);
        return ticket;
    }

    public void addTicket(Ticket ticket){
        ticketRepository.save(ticket);
    }

    public void updateTicket(Ticket ticket){
        ticketRepository.save(ticket);
    }

    public void deleteTicket(Ticket ticket){
        ticketRepository.delete(ticket);
    }

    public void deleteTicketById(int ticketId){
        ticketRepository.deleteById(ticketId);
    }

    public void deleteAlTickets(){
        ticketRepository.deleteAll();
    }

}
