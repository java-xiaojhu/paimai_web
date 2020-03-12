package com.example.demo.biz;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.toolkit.Wrappers;
import com.example.demo.dao.IAuctionRecordDao;
import com.example.demo.pojo.Auctionrecord;
import com.example.demo.vo.AuctionRecordVo;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;

@Service("AuctionRecordBiz")
@Transactional(propagation = Propagation.SUPPORTS, isolation = Isolation.READ_COMMITTED, readOnly = true)
public class AuctionRecordBiz {
	@Resource
	private IAuctionRecordDao iAuctionRecordDao;	
	
	public List<AuctionRecordVo> selectrecord(Integer pageNum, Integer pageSize){
		PageHelper.startPage(pageNum, pageSize);
		return iAuctionRecordDao.selectList();
	};
	@Transactional(propagation = Propagation.REQUIRED, isolation = Isolation.READ_COMMITTED, readOnly = false)
	public Integer addRecord(Auctionrecord auctionrecord) {
		return	iAuctionRecordDao.insert(auctionrecord);
	}
	public List<AuctionRecordVo> selectpaiListByid(Integer auctionId){
		return iAuctionRecordDao.selectByList(auctionId);
	};
	
}
