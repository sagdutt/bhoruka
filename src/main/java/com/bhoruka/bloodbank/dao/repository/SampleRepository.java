package com.bhoruka.bloodbank.dao.repository;

import com.bhoruka.bloodbank.dao.entity.Sample;

import com.bhoruka.bloodbank.dao.entity.SampleId;
import org.springframework.data.repository.CrudRepository;

public interface SampleRepository extends CrudRepository<Sample, SampleId> {
}
