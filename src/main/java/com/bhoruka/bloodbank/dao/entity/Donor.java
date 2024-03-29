package com.bhoruka.bloodbank.dao.entity;

import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBAttribute;
import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBAutoGeneratedKey;
import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBHashKey;
import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBTable;

import java.util.Date;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@DynamoDBTable(tableName = "Donor")
public class Donor {

    @DynamoDBHashKey
    @DynamoDBAutoGeneratedKey
    private String id;

    @DynamoDBAttribute
    private String name;

    @DynamoDBAttribute
    private Integer age;

    @DynamoDBAttribute
    private String gender;

    @DynamoDBAttribute
    private String occupation;

    @DynamoDBAttribute
    private String guardianName;

    @DynamoDBAttribute
    private String address;

    @DynamoDBAttribute
    private Integer noOfPreviousDonations;

    @DynamoDBAttribute
    private String phoneNumber;

    @DynamoDBAttribute
    private Date lastDonationDate;

    @DynamoDBAttribute
    private String bloodGroup;

    @DynamoDBAttribute
    private String deferredReason;
}
