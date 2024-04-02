package com.numadics.project.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.numadics.project.Model.CarInfo;


@Repository
public interface CarInfoRepo extends JpaRepository<CarInfo, Integer>{

}
