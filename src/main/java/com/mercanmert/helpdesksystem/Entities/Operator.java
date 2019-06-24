package com.mercanmert.helpdesksystem.Entities;


import com.mercanmert.valuetypes.enums.Department;
import com.mercanmert.valuetypes.enums.Location;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Operator extends Employee{

    public Operator(){
        super();
    }

    public Operator(int id, String firstName, String lastName, String phoneNumber, String email, String username, String passwordHash,
                    Department department, Location location, int ticketsOnOperator){
        super(firstName, lastName, phoneNumber, email, username, passwordHash, department, location);
        this.setId(id);
        this.setTicketsOnOperator(ticketsOnOperator);
    }

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    private int ticketsOnOperator;

    public int getTicketsOnOperator() {
        return ticketsOnOperator;
    }

    public void setTicketsOnOperator(int ticketsOnOperator) {
        this.ticketsOnOperator = ticketsOnOperator;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }


}
