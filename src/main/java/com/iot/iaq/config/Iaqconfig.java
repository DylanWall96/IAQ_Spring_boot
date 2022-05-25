package com.iot.iaq.config;

import com.iot.iaq.dao.Repository;
import com.iot.iaq.sensor.Sensor;
import com.iot.iaq.sensor.Sensor;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.List;

@Configuration
public class Iaqconfig {

    @Bean
    CommandLineRunner commandLineRunner (Repository repository){
        return args -> {
        Sensor test = new Sensor(
                1,
                2,
                3,
                3,
                1, "Kitchen",
                120,
                120
        );

            Sensor test1 = new Sensor(
                    1,
                    2,
                    3,
                    3,
                    1, "Office",
                    120,
                    120
            );

        repository.save(
                test
        );

            repository.save(
                    test1
            );
        };

    }

}
