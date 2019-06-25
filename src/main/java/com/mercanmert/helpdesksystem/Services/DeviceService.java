package com.mercanmert.helpdesksystem.Services;

import com.mercanmert.helpdesksystem.Entities.Device;
import com.mercanmert.helpdesksystem.Repositories.DeviceRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class DeviceService {

    @Autowired
    private DeviceRepository deviceRepository;

    public List<Device> getAllDevicesByOwner(int ownerId){
        List<Device> allDevices;
        allDevices = deviceRepository.findByUserId(ownerId);
        return allDevices;
    }

    public List<Device> getAllDevices(){
        List<Device> allDevices =new ArrayList<>();
        deviceRepository.findAll().forEach(allDevices::add);
        return allDevices;
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

    public void deleteDevice(Device device){
        deviceRepository.delete(device);
    }

    public void deleteDeviceById(int deviceId){
        deviceRepository.deleteById(deviceId);
    }

}
