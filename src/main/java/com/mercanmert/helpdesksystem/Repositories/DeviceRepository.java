package com.mercanmert.helpdesksystem.Repositories;

import com.mercanmert.helpdesksystem.Entities.Device;
import com.mercanmert.valuetypes.enums.Department;
import com.mercanmert.valuetypes.enums.DeviceType;
import com.mercanmert.valuetypes.enums.Location;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface DeviceRepository extends CrudRepository<Device, Integer> {
    List<Device> findByUserId(int ownerId);
    List<Device> findByDeviceType(DeviceType deviceType);
    List<Device> findByLocation(Location location);
    List<Device> findByDepartment(Department department);
}
