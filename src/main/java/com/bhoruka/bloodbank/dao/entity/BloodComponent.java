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
@DynamoDBTable(tableName = "BloodComponent")
public class BloodComponent {

    @Id
    @DynamoDBTypeConvertedJson
    private BloodComponentId bloodComponentId;

    @DynamoDBAttribute
    @Getter
    @Setter
    private String bloodGroup;

    @DynamoDBAttribute
    @Getter
    @Setter
    private Integer wbc;

    @DynamoDBAttribute
    @Getter
    @Setter
    private Integer pc;

    @DynamoDBAttribute
    @Getter
    @Setter
    private Integer ffp;

    @DynamoDBAttribute
    @Getter
    @Setter
    private Integer paedFfp;

    @DynamoDBAttribute
    @Getter
    @Setter
    private Integer plateletCone;

    @DynamoDBAttribute
    @Getter
    @Setter
    private Integer cryoPpt;

    @DynamoDBAttribute
    @Getter
    @Setter
    private Integer cfp;

    @DynamoDBAttribute
    @Getter
    @Setter
    private Date date;

    /**
     * Getter for id.
     *
     * @return the blood component id.
     */
    @DynamoDBHashKey(attributeName = "id")
    public String getId() {
        return bloodComponentId == null ? null : bloodComponentId.getId();
    }

    /**
     * Setter for id.
     *
     * @param id the blood component id.
     */
    public void setId(final String id) {
        if (bloodComponentId == null) {
            bloodComponentId = new BloodComponentId();
        }
        bloodComponentId.setId(id);
    }

    /**
     * Getter for sample id.
     *
     * @return the sample id.
     */
    @DynamoDBRangeKey(attributeName = "sampleId")
    public String getSampleId() {
        return bloodComponentId == null ? null : bloodComponentId.getSampleId();
    }

    /**
     * Setter for sample id.
     *
     * @param sampleId the sample id.
     */
    public void setSampleId(final String sampleId) {
        if (bloodComponentId == null) {
            bloodComponentId = new BloodComponentId();
        }
        bloodComponentId.setSampleId(sampleId);
    }
}
