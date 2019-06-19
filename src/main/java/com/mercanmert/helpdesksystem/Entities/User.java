package com.mercanmert.helpdesksystem.Entities;

import com.mercanmert.valuetypes.enums.Department;
import com.mercanmert.valuetypes.enums.Location;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class User {

    public User(){}

    public User(int id, String firstName, String lastName, String phoneNumber, String email, String username, String passwordHash,
                Department department, Location location, boolean isOperator)
    {
        this.setId(id);
        this.setFirstName(firstName);
        this.setLastName(lastName);
        this.setPhoneNumber(phoneNumber);
        this.setEmail(email);
        this.setUsername(username);
        this.setPasswordHash(passwordHash);
        this.setDepartment(department);
        this.setLocation(location);
        this.setIsOperator(isOperator);
    }

    public User(String firstName, String lastName, String phoneNumber, String email, String username, String passwordHash,
                Department department, Location location, boolean isOperator){
        this.setFirstName(firstName);
        this.setLastName(lastName);
        this.setPhoneNumber(phoneNumber);
        this.setEmail(email);
        this.setUsername(username);
        this.setPasswordHash(passwordHash);
        this.setDepartment(department);
        this.setLocation(location);
        this.setIsOperator(isOperator);

    }

    @Id
    private int id;
    private String firstName;
    private String lastName;
    private String phoneNumber;
    private String email;
    private String username;
    private String passwordHash;
    private boolean isOperator;

    @ManyToOne
    private Department department;

    @ManyToOne
    private Location location;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPasswordHash() {
        return passwordHash;
    }

    public void setPasswordHash(String passwordHash) {
        this.passwordHash = passwordHash;
    }

    public boolean isOperator() {
        return isOperator;
    }

    public void setIsOperator(boolean isOperator) {
        this.isOperator = isOperator;
    }

    public Department getDepartment() {
        return department;
    }

    public void setDepartment(Department department) {
        this.department = department;
    }

    public Location getLocation() {
        return location;
    }

    public void setLocation(Location location) {
        this.location = location;
    }


}
