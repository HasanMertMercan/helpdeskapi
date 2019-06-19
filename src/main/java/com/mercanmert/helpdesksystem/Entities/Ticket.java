package com.mercanmert.helpdesksystem.Entities;

import com.mercanmert.valuetypes.enums.TicketStatus;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import java.util.Date;

@Entity
public class Ticket {

    @Id
    public int id;
    public String topic;
    public String description;
    public Date createdDate;
    public TicketStatus ticketStatus;
    public String operatorComment;
    public Date solvedDate, cancelledDate, postponedDate;
    public String reasonOfPostponement;

    @ManyToOne
    public User ticketOwner;

    @ManyToOne
    public Operator operator;
}
