package com.bhoruka.bloodbank.dao.repository;

import com.bhoruka.bloodbank.dao.entity.Camp;
import com.bhoruka.bloodbank.dao.entity.CampId;

import org.springframework.data.repository.PagingAndSortingRepository;

public interface CampRepository extends PagingAndSortingRepository<Camp, CampId> {

}
