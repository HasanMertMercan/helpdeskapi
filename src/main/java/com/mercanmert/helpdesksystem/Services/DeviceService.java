package com.mercanmert.helpdesksystem.Services;

import com.mercanmert.helpdesksystem.Entities.Device;
import com.mercanmert.helpdesksystem.Repositories.DeviceRepository;
import com.mercanmert.valuetypes.enums.Department;
import com.mercanmert.valuetypes.enums.DeviceType;
import com.mercanmert.valuetypes.enums.Location;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class DeviceService {

    @Autowired
    private DeviceRepository deviceRepository;

    public List<Device> getDevicesByOwner(int ownerId){
        List<Device> allDevices;
        allDevices = deviceRepository.findByUserId(ownerId);
        return allDevices;
    }

    public List<Device> getAllDevices(){
        List<Device> allDevices =new ArrayList<>();
        deviceRepository.findAll().forEach(allDevices::add);
        return allDevices;
    }

    public List<Device> getDevicesByType(DeviceType deviceType){
        List<Device> deviceList;
        deviceList = deviceRepository.findByDeviceType(deviceType);
        return deviceList;
    }

    public List<Device> getDevicesByLocation(Location location){
        List<Device> deviceList;
        deviceList = deviceRepository.findByLocation(location);
        return deviceList;
    }

    public List<Device> getDevicesByDepartment(Department department){
        List<Device> deviceList;
        deviceList = deviceRepository.findByDepartment(department);
        return deviceList;
    }

    public Device getDeviceById(int deviceId){
        Device device;
        device = deviceRepository.findById(deviceId).orElse(null);
        return device;
    }

    public void addDevice(Device device){
        deviceRepository.save(device);
    }

    public void updateDevice(Device device){
        deviceRepository.save(device);
    }

    public void deleteDeviceById(int deviceId){
        deviceRepository.deleteById(deviceId);
    }

}
