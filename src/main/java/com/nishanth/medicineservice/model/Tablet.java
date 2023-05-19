package com.nishanth.medicineservice.model;

import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBAttribute;
import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBHashKey;
import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBTable;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@DynamoDBTable(tableName = "TABLET_INFO_TABLE")
public class Tablet {

    @DynamoDBHashKey(attributeName = "TabletBatchId")
    private String tablet_batch_id;

    @DynamoDBAttribute(attributeName = "TabletName")
    private String tablet_name;

    @DynamoDBAttribute(attributeName = "TabletImageUrl")
    private String table_image_url;

    @DynamoDBAttribute(attributeName = "TabletPrice")
    private Double tablet_price;
}
