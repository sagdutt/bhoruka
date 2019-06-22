package com.bhoruka.bloodbank.service;

import com.bhoruka.bloodbank.dao.CampDao;
import com.bhoruka.bloodbank.model.CampModel;
import com.bhoruka.bloodbank.model.request.CreateCampRequest;

import lombok.NonNull;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Slf4j
@Service
public class CampService {

    @NonNull
    private CampDao campDao;

    /**
     * Constructor for camp service.
     *
     * @param  campDao a camp dao object
     */
    @Autowired
    public CampService(@NonNull final CampDao campDao) {
        this.campDao = campDao;
    }

    /**
     * Method to create a new camp.
     *
     * @param createCampRequest the create request received from the controller
     * @return camp id
     */
    public String createCamp(@NonNull final CreateCampRequest createCampRequest) {
        CampModel createdCamp = campDao.createCamp(CampModel.builder()
                    .partnerId(createCampRequest.getPartnerId())
                    .expectedNoOfDonor(createCampRequest.getExpectedNoOfDonor())
                    .dateOfCamp(createCampRequest.getDateOfCamp())
                    .build());
        return createdCamp.getId();
    }
}
