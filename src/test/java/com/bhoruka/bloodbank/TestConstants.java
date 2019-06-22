package com.bhoruka.bloodbank;

import com.bhoruka.bloodbank.model.CampModel;
import com.bhoruka.bloodbank.model.request.CreateCampRequest;
import com.bhoruka.bloodbank.model.response.CreateCampResponse;

import java.util.Date;

import org.springframework.http.HttpStatus;

public final class TestConstants {

    public static final Date TEST_DATE = new Date();

    public static final String TEST_CAMP_ID = "TestCamp1";

    public static final String TEST_PARTNER_ID = "ABC";

    private static final String CAMP_CREATE_SUCCESS_MESSAGE = "Camp created successfully.";

    public static final CreateCampRequest CREATE_CAMP_REQUEST = CreateCampRequest.builder()
            .partnerId(TEST_PARTNER_ID)
            .dateOfCamp(TEST_DATE)
            .expectedNoOfDonor(200L)
            .build();

    public static final CreateCampResponse CREATE_CAMP_RESPONSE = CreateCampResponse.builder()
            .status(HttpStatus.OK.value())
            .description(CAMP_CREATE_SUCCESS_MESSAGE)
            .campId(TEST_CAMP_ID)
            .build();

    public static final CampModel CAMP_MODEL_WITHOUT_ID = CampModel.builder()
            .dateOfCamp(TEST_DATE)
            .partnerId(TEST_PARTNER_ID)
            .expectedNoOfDonor(200L)
            .build();

    public static final CampModel VALID_CAMP_MODEL = CampModel.builder()
            .dateOfCamp(TEST_DATE)
            .id(TEST_CAMP_ID)
            .partnerId(TEST_PARTNER_ID)
            .expectedNoOfDonor(200L)
            .build();
}
