package com.openshiftpoc.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.openshiftpoc.demo.domain.UserOpenShift;
import com.openshiftpoc.demo.service.OpenShiftDemoService;

@RestController
@CrossOrigin("*")

@RequestMapping("/api/v1/")
public class OpenShiftController {
	
	
	private OpenShiftDemoService openShiftDemoService;
	
	private ResponseEntity responseEntity;

	public OpenShiftController(OpenShiftDemoService openShiftDemoService) {
		super();
		this.openShiftDemoService = openShiftDemoService;
	}
	
	@PostMapping("/login")
	public ResponseEntity login(@RequestBody UserOpenShift user) {
		
		try {
			openShiftDemoService.loginUser(user);
			responseEntity = new ResponseEntity<UserOpenShift>(user,HttpStatus.CREATED);
			
		}catch(Exception e) {
			
			responseEntity = new ResponseEntity<UserOpenShift>(user,HttpStatus.CONFLICT);
		}
		
		return responseEntity;
		
	}
	
	
	
	

}
