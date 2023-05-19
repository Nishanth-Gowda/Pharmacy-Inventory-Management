package com.nishanth.medicineservice.controller;

import com.nishanth.medicineservice.model.Tablet;
import com.nishanth.medicineservice.repository.TabletRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class TabletController {

    @Autowired
    private TabletRepository tabletRepository;

    @GetMapping(value = "/tablets")
    public List<Tablet> getAllTablets(){
        return tabletRepository.getAllTablets();
    }

    @GetMapping(value = "/tablets/{tablet_batch_id}")
    public Tablet getTabletByBatchId(@PathVariable("tablet_batch_id") String tablet_batch_id){
        return tabletRepository.getTabletByBatchId(tablet_batch_id);
    }

    @PostMapping(value = "/tablets")
    public void saveTablet(@RequestBody Tablet tablet){
        tabletRepository.saveTablet(tablet);
    }

    @PutMapping(value = "/tablets")
    public void updateTablet(@RequestBody Tablet tablet){
        tabletRepository.updateTablet(tablet);
    }

    @DeleteMapping(value = "/tablets/{tablet_batch_id}")
    public void deleteTablet(@PathVariable("tablet_batch_id") String tablet_batch_id){
        tabletRepository.deleteTabletByBatchId(tablet_batch_id);
    }
}

