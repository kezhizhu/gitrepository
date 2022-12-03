package com.jingle.portal.schedule;

import com.jingle.portal.entity.RestWeather;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.text.SimpleDateFormat;
import java.util.Date;

@Component
public class ScheduledTasks {

    private static final Logger log = LoggerFactory.getLogger(ScheduledTasks.class);

    private static final SimpleDateFormat dateFormat = new SimpleDateFormat("HH:mm:ss");
    @Autowired
    private RestTemplate restTemplate;
    //in case call weather api to many times cause the fee( 1000/ per day is the limit)
    //@Scheduled(fixedRate = 50000)// if you need then scheduled, otherwise need money
    public void reportCurrentTime() {
        log.info("The time is now {}", dateFormat.format(new Date()));
        String url = "https://api.openweathermap.org/data/3.0/onecall?lat=33.44&lon=-94.04&exclude=hourly,daily&appid=13c753960292840b418f30873cb25d33";
        //RestTemplate restTemplate = new RestTemplate();
        RestWeather weather = restTemplate.getForObject(
                url, RestWeather.class);
        log.info(weather.toString());
    }

}
