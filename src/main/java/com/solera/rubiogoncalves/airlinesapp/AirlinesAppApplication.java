package com.solera.rubiogoncalves.airlinesapp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

@SpringBootApplication
@EnableMongoRepositories
public class AirlinesAppApplication {

    public static void main(String[] args) {
        SpringApplication.run(AirlinesAppApplication.class, args);
    }

}
