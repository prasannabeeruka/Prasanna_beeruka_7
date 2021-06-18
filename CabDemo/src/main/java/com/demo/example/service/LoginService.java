

package com.demo.example.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.demo.example.bean.LoginBean;
import com.demo.example.bean.UserProfileBean;
import com.demo.example.dao.LoginDao;

@Component
public class LoginService {
    @Autowired
	private LoginDao dao;
	public String login(LoginBean bean) {
		boolean b;
		String temp;
		if(bean==null)
			return "INVALID";
		else if(bean.getLogin_id()==null || bean.getPassword()==null)
			return "INVALID";
		else
			b=dao.validateUser(bean);

		if(b==false)
			return "INVALID";
		else
			{
			temp=dao.getUserType(bean);
		   return temp;
		}

	}

	public String addNewUser(LoginBean loginbean){
		String result = dao.checkUser(loginbean);
		if(result.equals("NOT_PRESENT"))
		{
			return dao.addNewUser(loginbean);

		}
		else
			return "PRESENT";
	}
	public String addNewUser(UserProfileBean upbean){
		return dao.addNewUser(upbean);
	}

	}
