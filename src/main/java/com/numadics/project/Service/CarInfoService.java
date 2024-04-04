package com.numadics.project.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.numadics.project.Model.CarInfo;
import com.numadics.project.Repository.CarInfoRepo;

@Service
public class CarInfoService {
	
	@Autowired
	private CarInfoRepo carInfoRepo;

//	public CarInfo RegisterCar(CarInfo carInfo) {
//		
//		CarInfo carInfo1 = carInfoRepo.save(carInfo);
//		
//		return carInfo1;
//	}
		
		public void RegisterCar(CarInfo cinfo)
		{
			carInfoRepo.save(cinfo);
			
		}
		
}
