//package com.iot.iaq.config;
//
//import com.iot.iaq.dao.Repository;
//import com.iot.iaq.sensor.Iaq;
//import org.springframework.boot.CommandLineRunner;
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//
//import java.util.List;
//
//@Configuration
//public class Iaqconfig {
//
//    @Bean
//    CommandLineRunner commandLineRunner (Repository repository){
//        return args -> {
//        Iaq test = new Iaq(
//                1,
//                2,
//                3,
//                3,
//                1, "bedroom"
//        );
//
//        repository.save(
//                test
//        );
//
//        };
//    }
//
//}
