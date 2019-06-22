package com.bhoruka.bloodbank.service;

import com.bhoruka.bloodbank.dao.CampDao;

import lombok.NonNull;

import org.springframework.beans.factory.annotation.Autowired;

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
     * @return camp id
     */
    public String createCamp() {
        return "campId";
    }
}
