package com.jingle;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableScheduling

public class ECommerceApplication {

    private static final Logger log = LoggerFactory.getLogger(ECommerceApplication.class);

    public static void main(String[] args) {
        //SpringApplication.run(ECommerceApplication.class, args);
        SpringApplication application = new SpringApplication(ECommerceApplication.class);
 //       application.setApplicationStartup(new BufferingApplicationStartup(2048));
        application.run(args);


    }


}
