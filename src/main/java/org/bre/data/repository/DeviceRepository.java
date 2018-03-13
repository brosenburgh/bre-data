package org.bre.data.repository;

import java.io.Serializable;
import java.util.List;

import org.bre.data.entity.Device;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface DeviceRepository extends MongoRepository<Device, Serializable>{
	public List<Device> findByAccountId(Object accountId);
}
