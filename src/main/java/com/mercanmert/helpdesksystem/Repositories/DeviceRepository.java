package com.mercanmert.helpdesksystem.Repositories;

import com.mercanmert.helpdesksystem.Entities.Device;
import org.springframework.data.repository.CrudRepository;

public interface DeviceRepository extends CrudRepository<Device, Integer> {
}
