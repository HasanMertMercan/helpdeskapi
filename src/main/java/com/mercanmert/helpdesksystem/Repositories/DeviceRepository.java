package com.mercanmert.helpdesksystem.Repositories;

import com.mercanmert.helpdesksystem.Entities.Device;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface DeviceRepository extends CrudRepository<Device, Integer> {
    List<Device> findByUserId(int ownerId);
}
