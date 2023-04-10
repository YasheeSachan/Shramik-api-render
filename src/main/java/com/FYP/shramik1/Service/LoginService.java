package com.FYP.shramik1.Service;

import java.math.BigInteger;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.FYP.shramik1.User;
import com.FYP.shramik1.Worker;
import com.FYP.shramik1.Repository.UserRepository;
import com.FYP.shramik1.Repository.WorkerRepository;

@Service
public class LoginService {
	
	@Autowired
	UserRepository repo;
	
	@Autowired
	WorkerRepository repository;

	public boolean findByName(String userName) {
		User user= repo.findByUserName(userName);
		if(user !=null)
			  return true;
			else
				return false;
	}

	public boolean findByPass(String password) {
		User user= repo.findByPassword(password);
		if(user !=null)
	    return true;
	    else
	    return false;
	}

	public List<User> find() {
		// TODO Auto-generated method stub
		return repo.findAll();
	}

	public void insert(User user) {
		repo.save(user);
		
	}
	
	public Worker insertWorker(Worker worker) {
		
		return repository.save(worker);
		
	}

	

	

}
