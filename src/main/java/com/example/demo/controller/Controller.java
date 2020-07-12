package com.example.demo.controller;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.bean.bean;

@RestController
public class Controller {
	
	
	@GetMapping("/getObject")
	@CrossOrigin(origins = "*", allowedHeaders = "*")
	public bean getObject()
	{
		bean b = new bean(1,"Goutham","Bhimavaram");
		return b;
	}
}
