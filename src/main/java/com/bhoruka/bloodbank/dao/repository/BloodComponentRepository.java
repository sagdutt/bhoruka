package com.bhoruka.bloodbank.dao.repository;

import com.bhoruka.bloodbank.dao.entity.BloodComponent;

import com.bhoruka.bloodbank.dao.entity.BloodComponentId;
import org.springframework.data.repository.CrudRepository;

public interface BloodComponentRepository extends CrudRepository<BloodComponent, BloodComponentId> {
}
