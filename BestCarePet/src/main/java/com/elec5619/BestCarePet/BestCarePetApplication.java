package com.elec5619.BestCarePet;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
//扫描mapper接口所在的包
@MapperScan("com.elec5619.BestCarePet.mapper")
public class BestCarePetApplication {

	public static void main(String[] args) {
		SpringApplication.run(BestCarePetApplication.class, args);
	}

}
