package com.exp.service;

import com.exp.dto.UserRequest;
import com.exp.entity.Valid_Exp;

public interface Expserv {
	Valid_Exp ExpMethod(UserRequest userRequest);
}
