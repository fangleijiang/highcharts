package com.flj.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.flj.model.User;

@Controller
public class GetData {
	
	public List<User> build_datas(){
		List<User> list = new ArrayList<User>();
		User user1 = new User();
		user1.setUsername("王五");
		user1.setScore(12);
		list.add(user1);
		User user2 = new User();
		user2.setUsername("廖一");
		user2.setScore(20);
		list.add(user2);
		User user3 = new User();
		user3.setUsername("王二");
		user3.setScore(15);
		list.add(user3);
		User user4 = new User();
		user4.setUsername("张三");
		user4.setScore(11);
		list.add(user4);
		User user5 = new User();
		user5.setUsername("李四");
		user5.setScore(24);
		list.add(user5);
		return list;
	}
	
	@RequestMapping(value="getdatas",method=RequestMethod.GET)
	public @ResponseBody List<User> getUsers(){
		return build_datas();
		
	}
	

}
