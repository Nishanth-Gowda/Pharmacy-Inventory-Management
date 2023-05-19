package com.nishanth.medicineservice.runner;

import com.nishanth.medicineservice.repository.TabletRepository;
import com.nishanth.medicineservice.model.Tablet;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

@Component
public class TabletIngestionRunner implements ApplicationRunner {

    @Autowired
    private TabletRepository tabletRepository;



    @Override
    public void run(ApplicationArguments args) throws Exception {
        tabletRepository.saveTablet(new Tablet("m1234","Gliss-M1","https://5.imimg.com/data5/ANDROID/Default/2021/12/NB/NI/FB/8710378/product-jpeg-250x250.jpg",84.2));
        tabletRepository.saveTablet(new Tablet("m1235","Gliss-M2","https://5.imimg.com/data5/ANDROID/Default/2021/12/NB/NI/FB/8710378/product-jpeg-250x250.jpg",20.2));
        tabletRepository.saveTablet(new Tablet("m1236","Dolo-650","https://m.media-amazon.com/images/I/91bz6RZlHZL._SL1500_.jpg",10.5));
        tabletRepository.saveTablet(new Tablet("m1237","Vomistop","https://newassets.apollo247.com/pub/media/catalog/product/v/o/vom0005.jpg",184.2));
        tabletRepository.saveTablet(new Tablet("m1238","Vasograin","https://cdn01.pharmeasy.in/dam/products/240830/vasograin-strip-of-14-tablets-1-1641312224.jpg",84.2));
    }
}
