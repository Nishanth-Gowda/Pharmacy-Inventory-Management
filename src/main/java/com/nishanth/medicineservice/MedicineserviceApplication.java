package com.nishanth.medicineservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Component;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@SpringBootApplication
@EnableSwagger2
@Component
public class MedicineserviceApplication {

	public static void main(String[] args) {
		SpringApplication.run(MedicineserviceApplication.class, args);
	}

}
