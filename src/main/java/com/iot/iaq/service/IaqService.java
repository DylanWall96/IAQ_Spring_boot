package com.iot.iaq.service;

import com.iot.iaq.dao.Repository;
import com.iot.iaq.sensor.Sensor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.Collection;
import java.util.List;

@Service
public class IaqService {

    Repository repository;

    @Autowired
    public IaqService(Repository repository){
        this.repository = repository;
    }

    public void addSensorReadings(Sensor sensor){
        repository.save(sensor);
    }

    public List<Sensor> getReading(){
        return repository.findAll();
    }

    public Collection <Sensor> getKitchenChartReading(){

        return repository.kitchenSensorChartData();
    }

    public Collection <Sensor> getOfficeChartReading(){

        return repository.officeSensorChartData();
    }

    public Collection <Sensor> getBarChartReading(){

        return repository.barSensorChartData();
    }


}
