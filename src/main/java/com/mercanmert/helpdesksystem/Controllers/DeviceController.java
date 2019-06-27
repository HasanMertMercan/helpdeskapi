package com.mercanmert.helpdesksystem.Controllers;

import com.mercanmert.helpdesksystem.Entities.Device;
import com.mercanmert.helpdesksystem.Entities.User;
import com.mercanmert.helpdesksystem.Services.DeviceService;
import com.mercanmert.valuetypes.enums.Department;
import com.mercanmert.valuetypes.enums.DeviceType;
import com.mercanmert.valuetypes.enums.Location;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class DeviceController {

    @Autowired
    private DeviceService deviceService;

    @RequestMapping("/devices")
    public List<Device> getAllDevices(){
        List<Device> deviceList;
        deviceList = deviceService.getAllDevices();
        return deviceList;
    }

    @RequestMapping("/devices/user/{id}")
    public List<Device> getUserDevices(@PathVariable int id){
        List<Device> deviceList;
        deviceList = deviceService.getDevicesByOwner(id);
        return deviceList;
    }

    @RequestMapping("/devices/type/{deviceType}")
    public List<Device> getDevicesByType(@PathVariable DeviceType deviceType){
        List<Device> deviceList;
        deviceList = deviceService.getDevicesByType(deviceType);
        return deviceList;
    }

    @RequestMapping("/devices/location/{location}")
    public List<Device> getDevicesByLocation(@PathVariable Location location){
        List<Device> deviceList;
        deviceList = deviceService.getDevicesByLocation(location);
        return deviceList;
    }

    @RequestMapping("/devices/department/{department}")
    public List<Device> getDevicesByDepartment(@PathVariable Department department){
        List<Device> deviceList;
        deviceList = deviceService.getDevicesByDepartment(department);
        return deviceList;
    }

    @RequestMapping("/devices/device/{id}")
    public Device getDeviceById(@PathVariable int id){
        Device device;
        device = deviceService.getDeviceById(id);
        return device;
    }

    @RequestMapping(method = RequestMethod.POST, value = "/devices/add/user/{id}")
    public void addDevice(@RequestBody Device device, @PathVariable int id){
        device.setUser(new User(id,"","","","","","",null, null));
        deviceService.addDevice(device);
    }

    @RequestMapping(method = RequestMethod.PUT, value = "/devices/add/user/{id}")
    public void updateDevice(@RequestBody Device device, @PathVariable int id){
        device.setUser(new User(id,"","","","","","",null, null));
        deviceService.updateDevice(device);
    }

    @RequestMapping(method = RequestMethod.DELETE, value = "/devices/device/{id}/delete")
    public void deleteDevice(@PathVariable int id){
        deviceService.deleteDeviceById(id);
    }

}
