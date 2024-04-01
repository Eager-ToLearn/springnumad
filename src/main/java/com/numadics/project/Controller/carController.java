package com.numadics.project.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@Controller
public class carController {
	
	@GetMapping("/")
	public String Home()
	{
		return "index";
	}
	
	@PostMapping("/carReg")
	public String RegCar(@RequestBody )
	{
		return "Car registered successfully";
	}

}
