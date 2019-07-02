package com.bhoruka.bloodbank.model.request;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Value;

@Value
@Builder
@AllArgsConstructor
public class GetCampRequest {

    private String id;
}
