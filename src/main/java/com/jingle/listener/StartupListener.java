package com.jingle.listener;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.stereotype.Component;

import java.util.concurrent.TimeUnit;

//@Slf4j
@Component
class StartupListener implements ApplicationListener<ContextRefreshedEvent> {
//    @Autowired
//    ScheduledReporter metricReporter

    @Override
    public void onApplicationEvent(ContextRefreshedEvent event) {
//        log.info('StartupListener is starting...')
//        metricReporter.start(1, TimeUnit.SECONDS)
        System.out.println("hello world" + event.getTimestamp());

    }
}
