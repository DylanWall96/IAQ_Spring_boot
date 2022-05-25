package com.iot.iaq.controller;

import com.iot.iaq.sensor.Sensor;
import com.iot.iaq.service.IaqService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Collection;
import java.util.List;

@RestController
@RequestMapping("api/iaq")
public class Controller {

    private final IaqService iaqservice;

    @Autowired
    public Controller(IaqService iaqservice) {
        this.iaqservice = iaqservice;
    }

    @GetMapping
    public List<Sensor> getReading() {
        return iaqservice.getReading();
    }

    @PostMapping
    public void newReading (Sensor sensor){
        iaqservice.addSensorReadings(sensor);
    }

    @GetMapping("/data/chart/kitchen")
    public Collection<Sensor> getKitchenChartData() {
        return iaqservice.getKitchenChartReading();
    }

    @GetMapping("/data/chart/office")
    public Collection<Sensor> getOfficeChartData() {
        return iaqservice.getOfficeChartReading();
    }

    @GetMapping("/data/chart/bar")
    public Collection<Sensor> getBarChartData() {
        return iaqservice.getBarChartReading();
    }

}
