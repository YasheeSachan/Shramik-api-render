package com.FYP.shramik1.Service;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.FYP.shramik1.User;
import com.FYP.shramik1.Worker;


@Service
public class AuthenticationService {
	
	@Autowired
	LoginService service;

	public boolean authenticate(User user) {
		boolean ValidName=false;
		boolean ValidPass=false;
		if(service.findByName(user.getUserName()) && service.findByPass(user.getPassword()))
		{
			ValidPass=true;
			ValidName=true;
		}
		return ValidName && ValidPass;
	}

	

//	public boolean authenticate(Worker worker) {
//		boolean ValidName=false;
//		boolean ValidPass=false;
//		if(service.findByName(worker.getUserName()) && service.findByPass(worker.getPassword()))
//		{
//			ValidPass=true;
//			ValidName=true;
//		}
//			
//		return ValidName && ValidPass;
//	}

}
