package com.iot.iaq.service;

import com.iot.iaq.dao.Repository;
import com.iot.iaq.sensor.Iaq;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class Iaqservice {

    Repository repository;

    @Autowired
    public Iaqservice(Repository repository){
        this.repository = repository;
    }

    public void addSensorReadings(Iaq iaq){
        repository.save(iaq);
    }

    public List<Iaq> getReading(){
        return repository.findAll();

    }
}
