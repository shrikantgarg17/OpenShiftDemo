package com.openshiftpoc.demo.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.openshiftpoc.demo.domain.UserOpenShift;

public interface DemoRepository extends MongoRepository<UserOpenShift, String>{

	
	
}
