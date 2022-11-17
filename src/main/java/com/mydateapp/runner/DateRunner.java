package com.mydateapp.runner;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.Date;

import static com.mydateapp.utils.DateUtils.*;

@Slf4j
@Component
public class DateRunner implements CommandLineRunner {

    @Override
    public void run(String... args) throws Exception {

        String kafkaFormattedDt = getKafkaFormattedTime(new Date());
        log.info("kafkaFormattedDt :{}", kafkaFormattedDt);

        Date dt = minusMinutesInDate(10);
        log.info("minusMinsinDt :{}", dt);



    }

}
