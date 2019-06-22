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
@DynamoDBTable(tableName = "Camp")
public class Camp {

    @Id
    @DynamoDBTypeConvertedJson
    private CampId campId;

    @DynamoDBAttribute
    @Getter
    @Setter
    private Date dateOfCamp;

    @DynamoDBAttribute
    @Getter
    @Setter
    private Long expectedNoOfDonor;

    @DynamoDBAttribute
    @Getter
    @Setter
    private Long actualNoOfDonor;

    /**
     * Getter for partner id.
     *
     * @return the partner id.
     */
    @DynamoDBRangeKey(attributeName = "partnerId")
    public String getPartnerId() {
        return campId == null ? null : campId.getPartnerId();
    }

    /**
     * Setter for partner id.
     *
     * @param partnerId the partner id field.
     */
    public void setPartnerId(final String partnerId) {
        if (campId == null) {
            campId = new CampId();
        }
        campId.setPartnerId(partnerId);
    }

    /**
     * Getter for id.
     *
     * @return the camp id.
     */
    @DynamoDBHashKey(attributeName = "id")
    public String getId() {
        return campId == null ? null : campId.getId();
    }

    /**
     * Setter for id.
     *
     * @param id the id field.
     */
    public void setId(final String id) {
        if (campId == null) {
            campId = new CampId();
        }
        campId.setId(id);
    }
}
