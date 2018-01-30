package com.fixed.asset;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.fixed.asset.mapper")
public class FixedAssetApplication {

	public static void main(String[] args) {
		SpringApplication.run(FixedAssetApplication.class, args);
	}
}
