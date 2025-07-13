package com.apigateway.backend.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {
	
	@GetMapping("sample")
	public String getSample()
	{
		return "Api Gateway";
	}

}
