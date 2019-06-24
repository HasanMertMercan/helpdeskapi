package com.mercanmert.helpdesksystem.Entities;

import com.mercanmert.valuetypes.enums.TicketStatus;

import javax.persistence.*;
import java.util.Date;

@Entity
public class Ticket {

    public Ticket(){}

    public Ticket(String topic, String description, Date createdDate, TicketStatus ticketStatus, String operatorComment,
                  Date solvedDate, Date cancelledDate, Date postponedDate, String reasonOfPostponement, int ownerId, int operatorId){
        this.setTopic(topic);
        this.setDescription(description);
        this.setCreatedDate(createdDate);
        this.setTicketStatus(ticketStatus);
        this.setOperatorComment(operatorComment);
        this.setSolvedDate(solvedDate);
        this.setCancelledDate(cancelledDate);
        this.setPostponedDate(postponedDate);
        this.setReasonOfPostponement(reasonOfPostponement);
        this.setTicketOwner(new User(ownerId,"", "", "", "", "", "", null, null));
        this.setOperator(new Operator(operatorId,"", "", "", "", "", "", null, null, 0));

    }

    public Ticket(int id, String topic, String description, Date createdDate, TicketStatus ticketStatus, String operatorComment,
                  Date solvedDate, Date cancelledDate, Date postponedDate, String reasonOfPostponement, int ownerId, int operatorId)
    {
        this.setId(id);
        this.setTopic(topic);
        this.setDescription(description);
        this.setCreatedDate(createdDate);
        this.setTicketStatus(ticketStatus);
        this.setOperatorComment(operatorComment);
        this.setSolvedDate(solvedDate);
        this.setCancelledDate(cancelledDate);
        this.setPostponedDate(postponedDate);
        this.setReasonOfPostponement(reasonOfPostponement);
        this.setTicketOwner(new User(ownerId,"", "", "", "", "", "", null, null));
        this.setOperator(new Operator(operatorId,"", "", "", "", "", "", null, null, 0));
    }

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    private String topic;
    private String description;
    private Date createdDate;
    private TicketStatus ticketStatus;
    private String operatorComment;
    private Date solvedDate, cancelledDate, postponedDate;
    private String reasonOfPostponement;

    @ManyToOne
    private User ticketOwner;

    @ManyToOne
    private Operator operator;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTopic() {
        return topic;
    }

    public void setTopic(String topic) {
        this.topic = topic;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Date getCreatedDate() {
        return createdDate;
    }

    public void setCreatedDate(Date createdDate) {
        this.createdDate = createdDate;
    }

    public TicketStatus getTicketStatus() {
        return ticketStatus;
    }

    public void setTicketStatus(TicketStatus ticketStatus) {
        this.ticketStatus = ticketStatus;
    }

    public String getOperatorComment() {
        return operatorComment;
    }

    public void setOperatorComment(String operatorComment) {
        this.operatorComment = operatorComment;
    }

    public Date getSolvedDate() {
        return solvedDate;
    }

    public void setSolvedDate(Date solvedDate) {
        this.solvedDate = solvedDate;
    }

    public Date getCancelledDate() {
        return cancelledDate;
    }

    public void setCancelledDate(Date cancelledDate) {
        this.cancelledDate = cancelledDate;
    }

    public Date getPostponedDate() {
        return postponedDate;
    }

    public void setPostponedDate(Date postponedDate) {
        this.postponedDate = postponedDate;
    }

    public String getReasonOfPostponement() {
        return reasonOfPostponement;
    }

    public void setReasonOfPostponement(String reasonOfPostponement) {
        this.reasonOfPostponement = reasonOfPostponement;
    }

    public User getTicketOwner() {
        return ticketOwner;
    }

    public void setTicketOwner(User ticketOwner) {
        this.ticketOwner = ticketOwner;
    }

    public Operator getOperator() {
        return operator;
    }

    public void setOperator(Operator operator) {
        this.operator = operator;
    }
}
