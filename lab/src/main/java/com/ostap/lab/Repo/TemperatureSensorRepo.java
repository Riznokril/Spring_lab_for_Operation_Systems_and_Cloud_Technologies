package com.ostap.lab.Repo;

import com.ostap.lab.Models.TemperatureSensor;
import org.springframework.data.jpa.repository.JpaRepository;


public interface TemperatureSensorRepo extends JpaRepository<TemperatureSensor, Long>{

}
