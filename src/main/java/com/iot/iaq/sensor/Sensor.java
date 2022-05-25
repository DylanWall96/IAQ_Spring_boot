package com.iot.iaq.sensor;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity

@Table
public class Sensor {
    @Id
    @SequenceGenerator(
            name = "Sensor_sequence",
            sequenceName = "Sensor_sequence",
            allocationSize = 1
    )

    @GeneratedValue(
            strategy = GenerationType.SEQUENCE,
            generator = "Sensor_Sequence"
    )
    private long id;
     private LocalDateTime Timestamp = LocalDateTime.now().plusHours(1);
//    private LocalDateTime Timestamp = LocalDateTime.now();
    //private LocalDateTime Timestamp;
    private double temp;
    private double hum;
    private double pres;
    private double gas;
    private int score;
    private String location;
    private double kitchenavg;
    private double kitchenhouravg;



    public Sensor() {
    }

    public Sensor(double temp, double hum,
               double pres, double gas, int score, String location, double kitchenavg, double kitchenhouravg) {
        this.temp = temp;
        this.hum = hum;
        this.pres = pres;
        this.gas = gas;
        this.score = score;
        this.location = location;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public LocalDateTime getTimestamp() {
        return Timestamp;
    }

    public double getTemp() {
        return temp;
    }

    public void setTemp(double temp) {
        this.temp = temp;
    }

    public double getHum() {
        return hum;
    }

    public void setHum(double hum) {
        this.hum = hum;
    }

    public double getPres() {
        return pres;
    }

    public void setPres(double pres) {
        this.pres = pres;
    }

    public double getGas() {
        return gas;
    }

    public void setGas(double gas) {
        this.gas = gas;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public double getKitchenavg() {
        return kitchenavg;
    }

    public void setKitchenavg(double kitchenavg) {
        this.kitchenavg = kitchenavg;
    }

    public double getKitchenhouravg() {
        return kitchenhouravg;
    }

    public void setKitchenhouravg(double kitchenhouravg) {
        this.kitchenhouravg = kitchenhouravg;
    }
}