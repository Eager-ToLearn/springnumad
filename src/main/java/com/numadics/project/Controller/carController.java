package com.numadics.project.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.numadics.project.Model.CarInfo;
import com.numadics.project.Service.CarInfoService;

@Controller
public class carController {
	
	@Autowired
	private CarInfoService carInfoService;
	
//	@GetMapping("/")
//	public String Home()
//	{
//		return "index";
//	}
	
	@PostMapping("/carReg")
	public void RegisterCar(@RequestBody CarInfo cinfo)
	{
		carInfoService.RegisterCar(cinfo);
//		CarInfo carInfo1 = carInfoService.RegisterCar(carInfo);
//		return carInfo;
	}

}
