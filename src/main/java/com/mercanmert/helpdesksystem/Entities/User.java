package com.mercanmert.helpdesksystem.Entities;

import com.mercanmert.valuetypes.enums.Department;
import com.mercanmert.valuetypes.enums.Location;

import javax.persistence.*;

@Entity
public class User extends Employee{

    public User(){
        super();
    }

    public User(int id, String firstName, String lastName, String phoneNumber, String email, String username, String passwordHash,
                Department department, Location location){
        super(firstName, lastName, phoneNumber, email, username, passwordHash, department, location);
        this.setId(id);

    }

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }





}
