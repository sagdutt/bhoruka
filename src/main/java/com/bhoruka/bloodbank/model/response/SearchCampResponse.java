package com.bhoruka.bloodbank.model.response;

import java.util.Date;
import lombok.Builder;
import lombok.Value;

@Value
@Builder
public class SearchCampResponse {

    String id;

    String partnerId;

    Date dateOfCamp;

    Long expectedNoOfDonors;

    Long actualNoOfDonors;

    Integer pageNo;

    Integer pageSize;

    String sortBy;
}
