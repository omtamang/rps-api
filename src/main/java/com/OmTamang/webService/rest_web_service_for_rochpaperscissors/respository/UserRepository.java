package com.OmTamang.webService.rest_web_service_for_rochpaperscissors.respository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.OmTamang.webService.rest_web_service_for_rochpaperscissors.users.Users;

public interface UserRepository extends JpaRepository<Users, Integer>{
	public List<Users> findByUserName(String userName);
}
