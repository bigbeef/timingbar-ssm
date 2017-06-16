package com.timingbar.service;

import com.timingbar.dto.UserDto;

import java.util.List;

public interface IUserService {
	UserDto getById(Long id);
	List<UserDto> findByUsername(String username);
}
