package com.timingbar.service.impl;

import com.timingbar.dto.UserDto;
import com.timingbar.mapper.UserMapper;
import com.timingbar.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements IUserService {

	@Autowired
	private UserMapper userMapper;

	public UserDto getById(Long id){
		return userMapper.getById(id);
	}

	public List<UserDto> findByUsername(String username){
		return userMapper.findByUsername(username);
	}
}
