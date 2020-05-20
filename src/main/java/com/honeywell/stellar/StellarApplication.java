package com.honeywell.stellar;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@EnableJpaRepositories("com.honeywell.stellar.repository")
@EntityScan("com.honeywell.stellar.model")
@SpringBootApplication
public class StellarApplication {

    public static void main(String[] args) {
        SpringApplication.run(StellarApplication.class, args);
    }

}
