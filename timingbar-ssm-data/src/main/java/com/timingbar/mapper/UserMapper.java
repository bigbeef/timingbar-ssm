package com.timingbar.mapper;

import com.timingbar.dto.UserDto;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface UserMapper {
	UserDto getById(Long id);

	List<UserDto> findByUsername(@Param("username")String username);
}
