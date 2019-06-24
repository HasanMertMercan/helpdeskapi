package com.mercanmert.helpdesksystem.Entities;

import com.mercanmert.valuetypes.enums.Department;
import com.mercanmert.valuetypes.enums.DeviceType;
import com.mercanmert.valuetypes.enums.Location;

import javax.persistence.*;
import java.util.Date;

@Entity
public class Device {

    public Device(){}

    public Device(int id, String deviceName, DeviceType deviceType, Date createdDate, Department department, Location location, int ownerId)
    {
        this.setId(id);
        this.setDeviceType(deviceType);
        this.setDeviceName(deviceName);
        this.setCreatedDate(createdDate);
        this.setDepartment(department);
        this.setLocation(location);
        this.setUser(new User(ownerId,"", "", "", "", "", "", null, null));
    }

    public Device(String deviceName, DeviceType deviceType, Date createdDate, Department department, Location location, int ownerId){
        this.setDeviceType(deviceType);
        this.setDeviceName(deviceName);
        this.setCreatedDate(createdDate);
        this.setDepartment(department);
        this.setLocation(location);
        this.setUser(new User(ownerId,"", "", "", "", "", "", null, null));
    }

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    private String deviceName;
    private DeviceType deviceType;
    private Date createdDate;
    private Location location;
    private Department department;

    @ManyToOne
    private User user;

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDeviceName() {
        return deviceName;
    }

    public void setDeviceName(String deviceName) {
        this.deviceName = deviceName;
    }

    public DeviceType getDeviceType() {
        return deviceType;
    }

    public void setDeviceType(DeviceType deviceType) {
        this.deviceType = deviceType;
    }

    public Date getCreatedDate() {
        return createdDate;
    }

    public void setCreatedDate(Date createdDate) {
        this.createdDate = createdDate;
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
