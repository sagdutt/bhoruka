package com.bhoruka.bloodbank.dao;

import com.bhoruka.bloodbank.dao.repository.CampRepository;
import lombok.NonNull;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class CampDao {

    @NonNull
    private CampRepository campRepository;

    /**
     * Constructor for camp service.
     *
     * @param  campRepository a new camp repository
     */
    @Autowired
    public CampDao(@NonNull final CampRepository campRepository) {
        this.campRepository = campRepository;
    }
}
