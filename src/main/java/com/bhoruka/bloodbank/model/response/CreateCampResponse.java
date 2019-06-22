package com.bhoruka.bloodbank.model.response;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class CreateCampResponse {

    String campId;

    Integer status;

    String description;

    String errorMessage;
}
