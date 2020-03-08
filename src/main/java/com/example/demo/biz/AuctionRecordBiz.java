package com.example.demo.biz;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.example.demo.dao.IAuctionRecordDao;

@Service
public class AuctionRecordBiz {
	@Resource
	private IAuctionRecordDao iAuctionRecordDao;	
}
