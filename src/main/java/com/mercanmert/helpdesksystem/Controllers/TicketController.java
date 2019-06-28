package com.mercanmert.helpdesksystem.Controllers;

import com.mercanmert.helpdesksystem.Entities.Operator;
import com.mercanmert.helpdesksystem.Entities.Ticket;
import com.mercanmert.helpdesksystem.Entities.User;
import com.mercanmert.helpdesksystem.Services.TicketService;
import com.mercanmert.valuetypes.enums.TicketStatus;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Date;
import java.util.List;

@RestController
public class TicketController {

    @Autowired
    private TicketService ticketService;

    @RequestMapping("/tickets")
    public List<Ticket> getAllTickets(){
        List<Ticket> ticketList;
        ticketList = ticketService.getAllTickets();
        return ticketList;
    }

    @RequestMapping("/tickets/owner/{ownerId}")
    public List<Ticket> getAllTicketsByOwner(@PathVariable int ownerId){
        List<Ticket> ticketList;
        ticketList = ticketService.getAllByOwnerId(ownerId);
        return ticketList;
    }

    @RequestMapping("/tickets/operator/{operatorId}")
    public List<Ticket> getTicketsByOperatorId(@PathVariable int operatorId){
        List<Ticket> ticketList;
        ticketList = ticketService.getAllByOperatorId(operatorId);
        return ticketList;
    }

    @RequestMapping("/tickets/ticketStatus/{ticketStatus}")
    public List<Ticket> getAllTicketsByTicketStatus(@PathVariable TicketStatus ticketStatus){
        List<Ticket> ticketList;
        ticketList = ticketService.getAllByTicketStatus(ticketStatus);
        return ticketList;
    }

    @RequestMapping("/tickets/createdDate/{createdDate}")
    public List<Ticket> getAllTicketsByCreatedDate(@PathVariable Date createdDate){
        List<Ticket> ticketList;
        ticketList = ticketService.getAllByCreatedDate(createdDate);
        return ticketList;
    }

    @RequestMapping("/tickets/cancelledDate/{cancelledDate}")
    public List<Ticket> getAllTicketsByCancelledDate(@PathVariable Date cancelledDate){
        List<Ticket> ticketList;
        ticketList = ticketService.getAllByCancelledDate(cancelledDate);
        return ticketList;
    }

    @RequestMapping("/tickets/solvedDate/{solvedDate}")
    public List<Ticket> getAllTicketsBySolvedDate(@PathVariable Date solvedDate){
        List<Ticket> ticketList;
        ticketList = ticketService.getAllBySolvedDate(solvedDate);
        return ticketList;
    }

    @RequestMapping("/tickets/postponedDate/{postponedDate}")
    public List<Ticket> getAllTicketsByPostponedDate(@PathVariable Date postponedDate){
        List<Ticket> ticketList;
        ticketList = ticketService.getAllByPostponedDate(postponedDate);
        return ticketList;
    }

    @RequestMapping("/tickets/ticket/{ticketId}")
    public Ticket getTicketById(@PathVariable int ticketId){
        Ticket ticket;
        ticket = ticketService.getTicketById(ticketId);
        return ticket;
    }

    @RequestMapping(method = RequestMethod.POST, value = "/tickets/ticket/add/owner/{ownerId}/operator/{operatorId}")
    public void addTicket(@RequestBody Ticket ticket, @PathVariable int ownerId, int operatorId){
        ticket.setOperator(new Operator(operatorId,"","","","","","",null, null, 0));
        ticket.setTicketOwner(new User(ownerId, "","","","","","",null,null));
        ticketService.addTicket(ticket);
    }

    @RequestMapping(method = RequestMethod.PUT, value = "/tickets/update/ticket")
    public void updateTicket(@RequestBody Ticket ticket){
        ticketService.updateTicket(ticket);
    }

    @RequestMapping(method = RequestMethod.DELETE, value = "/tickets/ticket/{ticketId}/delete")
    public void deleteTicketById(@PathVariable int ticketId){
        ticketService.deleteTicketById(ticketId);
    }

    @RequestMapping(method = RequestMethod.DELETE, value = "/tickets/delete")
    public void deleteAllTickets(){
        ticketService.deleteAllTickets();
    }


}
