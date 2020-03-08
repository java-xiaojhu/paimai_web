package com.example.demo.biz;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.example.demo.dao.IAuctionDao;

@Service("AuctionBiz")
public class AuctionBiz {
	@Resource
	private IAuctionDao iAuctionDao;

}
