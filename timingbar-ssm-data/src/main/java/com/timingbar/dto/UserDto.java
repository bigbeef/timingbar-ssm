package com.timingbar.dto;

import com.timingbar.entity.User;
import lombok.Data;

@Data
public class UserDto extends User{
	private String cityName;
}
