package com.openshiftpoc.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.openshiftpoc.demo.domain.UserOpenShift;
import com.openshiftpoc.demo.repository.DemoRepository;

@Service
public class OpenShiftDemoServiceImpl implements OpenShiftDemoService {

	
	private DemoRepository  demoRepository;
	
	
	@Autowired
	public OpenShiftDemoServiceImpl(DemoRepository demoRepository) {
		super();
		this.demoRepository = demoRepository;
	}



	@Override
	public boolean loginUser(UserOpenShift user) {
		// TODO Auto-generated method stub
		
		try {
			System.out.println("inside service");
			demoRepository.save(user);
			return true;
		}catch(Exception e){
			System.out.println("in exception");
			return false;
		}
		
		
	}

}
