package com.iot.iaq.controller;

import com.iot.iaq.sensor.Iaq;
import com.iot.iaq.service.Iaqservice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/iaq")
public class Controller {

    private final Iaqservice iaqservice;

    @Autowired
    public Controller(Iaqservice iaqservice) {
        this.iaqservice = iaqservice;
    }

    @GetMapping
    public List<Iaq> getReading() {
        return iaqservice.getReading();
    }

    @PostMapping
    public void newReading (Iaq iaq){
        iaqservice.addSensorReadings(iaq);
    }
}
