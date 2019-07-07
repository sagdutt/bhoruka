package com.bhoruka.bloodbank.model.request;

import java.util.Date;

import lombok.Builder;
import lombok.Value;

@Value
@Builder
public class SearchCampRequest {

    private String partnerId;

    private Date dateOfCamp;

    private String expectedNoOfDonors;

    private String actualNoOfDonors;

    Integer pageNo;

    Integer pageSize;

    String sortBy;
}
