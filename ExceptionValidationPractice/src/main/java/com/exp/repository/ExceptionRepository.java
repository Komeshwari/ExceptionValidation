package com.exp.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.exp.entity.Valid_Exp;

public interface ExceptionRepository extends JpaRepository<Valid_Exp,Long> {
	 Optional<Valid_Exp> findByEmail(String email);

		Optional<Valid_Exp> findByPassword(String password);
}
