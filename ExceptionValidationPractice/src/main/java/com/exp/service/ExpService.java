package com.exp.service;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.exp.dto.UserRequest;
import com.exp.entity.Valid_Exp;
import com.exp.exception.UserExistException;
import com.exp.repository.ExceptionRepository;
@Service
public class ExpService implements Expserv {
@Autowired
private ExceptionRepository repo;
public Valid_Exp ExpMethod(UserRequest userRequest) 
{
 Valid_Exp validexp=new Valid_Exp();
 try {
 if(repo.findByEmail(userRequest.getEmail()).isPresent()||repo.findByPassword(userRequest.getPassword()).isPresent())
	{

		throw new UserExistException("your already registered");
	}
      else
	{
		validexp.setName(userRequest.getName());
		validexp.setEmail(userRequest.getEmail());
		validexp.setPassword(userRequest.getPassword());
		repo.save(validexp);
	}
 }
 catch(UserExistException e)
 {
	 System.out.println(e);
 }
	
	return validexp;
 
}
}
