package com.mercanmert.helpdesksystem.Entities;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import java.util.Date;

@Entity
public class TicketMessages {

    @Id
    public int id;
    public int senderId;
    public int receiverId;
    public String text;
    public Date createdDate;

    @ManyToOne
    public Ticket ticket;
}
