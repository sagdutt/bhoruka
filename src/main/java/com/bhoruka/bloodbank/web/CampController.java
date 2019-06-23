package com.bhoruka.bloodbank.web;

import com.bhoruka.bloodbank.exception.CampCreationFailedException;
import com.bhoruka.bloodbank.model.request.CreateCampRequest;
import com.bhoruka.bloodbank.model.response.CreateCampResponse;
import com.bhoruka.bloodbank.service.CampService;

import lombok.NonNull;
import lombok.extern.slf4j.Slf4j;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/camp")
@Slf4j
public class CampController {

    private static final String CAMP_CREATE_SUCCESS_MESSAGE = "Camp created successfully.";

    @NonNull
    private CampService campService;

    /**
     * Constructor for the camp controller.
     * @param campService mandatory instance of CampService
     */
    @Autowired
    public CampController(@NonNull final CampService campService) {
        this.campService = campService;
    }

    /**
     * Controller endpoint for creating a new camp.
     * @param createCampRequest the incoming create request
     * @return the response with the newly created camp id
     */
    @PostMapping("/create")
    public CreateCampResponse createCamp(@RequestBody final CreateCampRequest createCampRequest) {
        log.info("Received create request : {}", createCampRequest);

        CreateCampResponse response = null;
        try {
            String campId = campService.createCamp(createCampRequest);
            response = CreateCampResponse.builder()
                    .campId(campId)
                    .description(CAMP_CREATE_SUCCESS_MESSAGE)
                    .status(HttpStatus.OK.value())
                    .build();
        } catch (CampCreationFailedException e) {
            response = CreateCampResponse.builder()
                    .status(HttpStatus.INTERNAL_SERVER_ERROR.value())
                    .errorMessage(e.getMessage())
                    .build();
        }
        return response;
    }
}
