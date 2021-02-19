package com.iot.iaq.dao;

import com.iot.iaq.sensor.Iaq;
import org.springframework.data.jpa.repository.JpaRepository;

@org.springframework.stereotype.Repository
public interface Repository extends JpaRepository<Iaq,Long> {
}
