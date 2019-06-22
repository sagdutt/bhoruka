package com.bhoruka.bloodbank.model.request;

import java.util.Date;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class CreateCampRequest {

    private String partnerId;

    private Date dateOfCamp;

    private Long expectedNoOfDonor;
}
