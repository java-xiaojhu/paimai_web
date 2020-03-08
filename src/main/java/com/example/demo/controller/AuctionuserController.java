package com.example.demo.controller;

import java.util.HashMap;
import java.util.Map;

import javax.annotation.Resource;
import javax.servlet.http.HttpSession;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.biz.AuctionuserBiz;
import com.example.demo.pojo.Auctionuser;

@RestController
@RequestMapping("/api/Auctionusers")
public class AuctionuserController {
	@Resource
	private AuctionuserBiz auctionuserBiz;
	@PostMapping("/login/{}/{}")
	public Map<String, String > userLogin(String name,String password,HttpSession ssession){
		Map<String , String> message=new HashMap<String, String>();
		Auctionuser user=auctionuserBiz.findUserBynamepas(name, password);
		if(user!=null) {
			ssession.setAttribute("user", user);
			message.put("code", "200");
			message.put("dizhi", "");
		}else {			
			message.put("code", "300");
			message.put("msg", "密码或者用户名错误");
		}	
		return message; 
		
	}

}
