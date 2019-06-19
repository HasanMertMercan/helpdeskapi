package com.mercanmert.helpdesksystem.Entities;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class Operator {

    @Id
    public int id;

    @OneToOne
    public User user;


}
