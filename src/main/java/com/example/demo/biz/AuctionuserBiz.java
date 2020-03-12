package com.example.demo.biz;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.toolkit.Wrappers;
import com.example.demo.dao.IAuctionUserDao;
import com.example.demo.pojo.Auctionuser;

@Service("AuctionuserBiz")
public class AuctionuserBiz {
	@Resource
	private IAuctionUserDao iAuctionUserDao;
	/**
	 * 登录  获取 用户名以及密码
	 * @param name
	 * @param password
	 * @return
	 */
	public Auctionuser findUserBynamepas(String name,String password) {
		QueryWrapper<Auctionuser> qw=Wrappers.query();
		qw.eq("userName", name).eq("userPassword", password);
		return iAuctionUserDao.selectOne(qw);
	}
	
	/**
	 * 注册
	 */
	@Transactional(propagation = Propagation.REQUIRED, isolation = Isolation.READ_COMMITTED, readOnly = false)
	public Integer insertUser(Auctionuser auctionuser) {	
		return iAuctionUserDao.insert(auctionuser);
	}
	
	/**
	 * 用户名验证
	 */
	public Auctionuser findUserByname(String name) {
		QueryWrapper<Auctionuser> qw=Wrappers.query();
		qw.eq("userName", name);
		return iAuctionUserDao.selectOne(qw);
	}

}
