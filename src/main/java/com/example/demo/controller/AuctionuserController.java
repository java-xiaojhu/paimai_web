package com.example.demo.controller;

import java.util.HashMap;
import java.util.Map;

import javax.annotation.Resource;
import javax.servlet.http.HttpSession;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.alibaba.fastjson.JSON;
import com.example.demo.biz.AuctionuserBiz;
import com.example.demo.pojo.Auctionuser;

@RestController
@RequestMapping("/api/Auctionusers")
public class AuctionuserController {
	@Resource
	private AuctionuserBiz auctionuserBiz;

	@GetMapping("/login/{name}/{password}")
	public Map<String, String> userLogin(@PathVariable String name, @PathVariable String password,
			HttpSession ssession) {
		Map<String, String> message = new HashMap<String, String>();
		Auctionuser user = auctionuserBiz.findUserBynamepas(name, password);
		if (user != null) {
			ssession.setAttribute("user", user);
			message.put("code", "200");
			message.put("user", JSON.toJSONString(user));
			message.put("dizhi", "竞拍首页.html");
		} else {
			message.put("code", "300");
			message.put("msg", "密码或者用户名错误");
		}
		return message;
	}

	@GetMapping("/destroy")
	public Map<String, String> userDestroy(HttpSession session) {
		Map<String, String> message = new HashMap<String, String>();
		session.removeAttribute("user");
		session.invalidate();// 会话销毁
		message.put("code", "200");
		message.put("dizhi", "竞拍首页.html");
		return message;
	}

}
