package com.bhoruka.bloodbank.dao.entity;

import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBAttribute;
import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBHashKey;
import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBRangeKey;
import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBTable;
import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBTypeConvertedJson;

import java.util.Date;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import org.springframework.data.annotation.Id;

@NoArgsConstructor
@DynamoDBTable(tableName = "Sample")
public class Sample {

    @Id
    @DynamoDBTypeConvertedJson
    private SampleId sampleId;

    @DynamoDBAttribute
    @Getter
    @Setter
    private String segmentNumber;

    @DynamoDBAttribute
    @Getter
    @Setter
    private Date date;

    @DynamoDBAttribute
    @Getter
    @Setter
    private String typeOfBag;

    @DynamoDBAttribute
    @Getter
    @Setter
    private String bloodGroup;

    @DynamoDBAttribute
    @Getter
    @Setter
    private String arm;

    @DynamoDBAttribute
    @Getter
    @Setter
    private String remarks;

    /**
     * Getter for id.
     *
     * @return the sample id.
     */
    @DynamoDBHashKey(attributeName = "id")
    public String getId() {
        return sampleId == null ? null : sampleId.getId();
    }

    /**
     * Setter for id.
     *
     * @param id the id field.
     */
    public void setId(final String id) {
        if (sampleId == null) {
            sampleId = new SampleId();
        }
        sampleId.setId(id);
    }

    /**
     * Getter for donor id.
     *
     * @return the donor id.
     */
    @DynamoDBRangeKey
    public String getDonorId() {
        return sampleId == null ? null : sampleId.getDonorId();
    }

    /**
     * Setter for donor id.
     *
     * @param donorId the donor id field.
     */
    public void setDonorId(final String donorId) {
        if (sampleId == null) {
            sampleId = new SampleId();
        }
        sampleId.setDonorId(donorId);
    }
}
