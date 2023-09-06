package com.exp.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.exp.dto.UserRequest;
import com.exp.entity.Valid_Exp;
import com.exp.exception.UserExistException;
import com.exp.service.ExpService;

@RestController
public class ExpController {
@Autowired
private ExpService service;
@PostMapping("/expsave")
public ResponseEntity<Valid_Exp> insert(@RequestBody @Valid UserRequest userRequest) throws UserExistException{
	
	return new ResponseEntity<>(service.ExpMethod(userRequest),HttpStatus.BAD_REQUEST);
}
}
