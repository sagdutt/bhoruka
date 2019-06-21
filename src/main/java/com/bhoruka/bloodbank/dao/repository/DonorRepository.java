package com.bhoruka.bloodbank.dao.repository;

import com.bhoruka.bloodbank.dao.entity.Donor;

import org.springframework.data.repository.CrudRepository;

public interface DonorRepository extends CrudRepository<Donor, String> {
}
