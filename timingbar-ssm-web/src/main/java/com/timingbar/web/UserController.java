package com.timingbar.web;

import com.timingbar.dto.UserDto;
import com.timingbar.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
@RequestMapping("/user")
public class UserController {
	@Autowired
	private IUserService userService;

	@RequestMapping("/getById")
	@ResponseBody
	public UserDto getById(Long id){
		return userService.getById(id);
	}

	@RequestMapping("/findByUsername")
	@ResponseBody
	public List<UserDto> findByUsername(String username){
		return userService.findByUsername(username);
	}
}
