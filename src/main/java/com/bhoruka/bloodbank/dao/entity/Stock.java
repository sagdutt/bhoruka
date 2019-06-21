package com.bhoruka.bloodbank.dao.entity;

import com.amazonaws.services.dynamodbv2.datamodeling.*;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@DynamoDBTable(tableName = "Stock")
public class Stock {

    @DynamoDBHashKey
    @DynamoDBAutoGeneratedKey
    private String id;

    @DynamoDBAttribute
    private Long bloodBagA;

    @DynamoDBAttribute
    private Long bloodBagB;

    @DynamoDBAttribute
    private Long bloodBagC;

    @DynamoDBAttribute
    private Long reagents;

    @DynamoDBAutoGeneratedTimestamp
    private Date updatedAt;
}
