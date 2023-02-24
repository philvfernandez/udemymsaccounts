package com.philf.accounts;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.ComponentScans;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EnableJpaRepositories("com.philf.accounts.repository")
@EntityScan("com.philf.accounts.model")
public class AccontsApplication {

    public static void main(String[] args) {
        SpringApplication.run(AccontsApplication.class, args);
    }

}
