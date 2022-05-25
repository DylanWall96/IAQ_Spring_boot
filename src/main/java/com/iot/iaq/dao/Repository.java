package com.iot.iaq.dao;

import com.iot.iaq.sensor.Sensor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;


import java.util.Collection;

@org.springframework.stereotype.Repository
public interface Repository extends JpaRepository<Sensor,Long> {

    @Query(value = "SELECT id,date_trunc('second',timestamp) as timestamp,temp,hum,pres,gas,score,location," +
            "(SELECT CAST(avg(gas) AS DECIMAL(10,2)) AS average FROM sensor where location = 'Kitchen' " +
            "AND timestamp >= NOW() - INTERVAL '24 HOURS') AS kitchenavg, (SELECT CAST(avg(gas) AS DECIMAL(10,2)) AS average FROM sensor where location = 'Kitchen' " +
            "AND timestamp >= NOW() - INTERVAL '1 HOURS') AS kitchenhouravg from sensor where location = 'Kitchen' order by timestamp DESC LIMIT 1;" , nativeQuery = true)
    Collection<Sensor> kitchenSensorChartData();

    @Query(value = "SELECT id,date_trunc('second',timestamp) as timestamp,temp,hum,pres,gas,score,location," +
            "(SELECT CAST(avg(gas) AS DECIMAL(10,2)) AS average FROM sensor where location = 'Office' " +
            "AND timestamp >= NOW() - INTERVAL '24 HOURS') AS kitchenavg, (SELECT CAST(avg(gas) AS DECIMAL(10,2)) AS average FROM sensor where location = 'Office' " +
            "AND timestamp >= NOW() - INTERVAL '1 HOURS') AS kitchenhouravg from sensor where location = 'Office' order by timestamp DESC LIMIT 1;" , nativeQuery = true)
    Collection<Sensor> officeSensorChartData();

    @Query(value = "SELECT id,date_trunc('second',timestamp) as timestamp,temp,hum,pres,gas,score,location," +
            "(SELECT CAST(avg(gas) AS DECIMAL(10,2)) AS average FROM sensor where location = 'Bar' " +
            "AND timestamp >= NOW() - INTERVAL '24 HOURS') AS kitchenavg, (SELECT CAST(avg(gas) AS DECIMAL(10,2)) AS average FROM sensor where location = 'Bar' " +
            "AND timestamp >= NOW() - INTERVAL '1 HOURS') AS kitchenhouravg from sensor where location = 'Bar' order by timestamp DESC LIMIT 1;" , nativeQuery = true)
    Collection<Sensor> barSensorChartData();



}



    //SELECT avg(gas) from sensor where timestamp >= NOW() - INTERVAL '24 HOURS';
    //SELECT CAST(avg(gas) AS DECIMAL(10,2)) as average from sensor where location = 'Kitchen' AND timestamp >= NOW() - INTERVAL '24 HOURS';";
    //update sensor set kitchenavg = t.average from (SELECT CAST(avg(gas) AS DECIMAL(10,2)) as average from sensor where location = 'Kitchen' AND timestamp >= NOW() - INTERVAL '24 HOURS') as t;}
//SELECT id,date_trunc('second',timestamp) as timestamp,temp,hum,pres,gas,score,location,(SELECT CAST(avg(gas) AS DECIMAL(10,2)) AS average FROM sensor where location = 'Bar' AND timestamp >= NOW() - INTERVAL '24 HOURS') AS kitchenavg, (SELECT CAST(avg(gas) AS DECIMAL(10,2)) AS average FROM sensor where location = 'Bar' AND timestamp >= NOW() - INTERVAL '1 HOURS') AS kitchenhouravg from sensor where location = 'Bar' order by timestamp DESC LIMIT 1