package com.nishanth.medicineservice.repository;


import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBMapper;
import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBScanExpression;
import com.nishanth.medicineservice.model.Tablet;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class TabletRepository {

    @Autowired
    private DynamoDBMapper mapper;

    public void saveTablet(final Tablet tablet){
        mapper.save(tablet);
    }

    public Tablet getTabletByBatchId(final String tablet_batch_id){
        return mapper.load(Tablet.class, tablet_batch_id);
    }

    public void updateTablet(final Tablet tablet){
        mapper.save(tablet);
    }

    public void deleteTabletByBatchId(final String tablet_batch_id){
        Tablet tablet = new Tablet();
        tablet.setTablet_batch_id(tablet_batch_id);
        mapper.delete(tablet);
    }


    public List<Tablet> getAllTablets(){
       return mapper.scan(Tablet.class, new DynamoDBScanExpression());
    }
}
