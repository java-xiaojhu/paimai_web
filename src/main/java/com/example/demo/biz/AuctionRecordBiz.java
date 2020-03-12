package com.example.demo.biz;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.example.demo.dao.IAuctionRecordDao;
import com.example.demo.vo.AuctionRecordVo;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;

@Service("AuctionRecordBiz")
public class AuctionRecordBiz {
	@Resource
	private IAuctionRecordDao iAuctionRecordDao;	
	
	public List<AuctionRecordVo> selectrecord(Integer pageNum, Integer pageSize){
		PageHelper.startPage(pageNum, pageSize);
		return iAuctionRecordDao.selectList();
	};
}
