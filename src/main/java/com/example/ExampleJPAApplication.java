package com.example;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ExampleJPAApplication {

    private static final Logger log = LoggerFactory.getLogger(ExampleJPAApplication.class);
    public static void main(String[] args) {
        SpringApplication.run(ExampleJPAApplication.class, args);
        log.info("start spring application");
        log.error("this is test error");
    }

}
