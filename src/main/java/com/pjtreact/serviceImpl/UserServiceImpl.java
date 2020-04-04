package com.pjtreact.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pjtreact.mapper.UserMapper;
import com.pjtreact.service.UserService;
import com.pjtreact.vo.User;

@Service
public class UserServiceImpl implements UserService{

	@Autowired
	UserMapper userMapper;

	@Override
	public void selectListUser() {
		try {
			List<User> userList = userMapper.selectListUser();
			System.out.println("## userList = "+userList );
		} catch (Exception e) {
			throw new RuntimeException(e);
		}
		
	}
	
	
}
