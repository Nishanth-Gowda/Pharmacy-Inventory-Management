package com.nishanth.medicineservice.config;

import com.amazonaws.auth.AWSCredentialsProvider;
import com.amazonaws.regions.Regions;
import com.amazonaws.services.dynamodbv2.AmazonDynamoDB;
import com.amazonaws.services.dynamodbv2.AmazonDynamoDBClientBuilder;
import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class DynamoDBConfig {

    @Autowired
    private AWSCredentialsProvider awsCredentialsProvider;

    @Bean
    AmazonDynamoDB getAmazonDynamoDB(){
        return AmazonDynamoDBClientBuilder.standard()
                .withCredentials(awsCredentialsProvider)
                .withRegion(Regions.US_EAST_1)
                .build();
    }

    @Bean
    DynamoDBMapper getDynamoDBMapper(){
        return new DynamoDBMapper(getAmazonDynamoDB());
    }
}


