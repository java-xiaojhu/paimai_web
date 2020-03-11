package com.example.demo.biz;

import java.util.Date;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.PathVariable;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.toolkit.Wrappers;
import com.example.demo.dao.IAuctionDao;
import com.example.demo.pojo.Auction;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;

@Service("AuctionBiz")
@Transactional(propagation = Propagation.SUPPORTS, isolation = Isolation.READ_COMMITTED, readOnly = true)
public class AuctionBiz {
	@Resource
	private IAuctionDao iAuctionDao;
	
	public PageInfo<Auction> findAuctions(Integer pageNum,Integer pageSize, String name, String desc,Date startime, Date endTime,Integer price){
		QueryWrapper<Auction>  qw = Wrappers.query();
		qw.like("auctionName", name).like("auctionDesc", desc);
		if(endTime.equals(null)) {
			qw.lt("auctionEndTime", endTime);
		}
		if(startime.equals(null)) {
			qw.gt("auctionStartTime", startime);
		}
		if(!(startime.equals(null)  && endTime.equals(null))) {
			qw.gt("auctionStartTime", startime).lt("auctionEndTime", endTime);
		}
		qw.eq("auctionStartPrice", price);
		qw.orderByDesc("auctionId");
		PageHelper.startPage(pageNum, pageSize);
		return new PageInfo<Auction>(iAuctionDao.selectList(qw));
	}
	/**
	 * 新增拍卖品
	 * @param auction
	 * @return
	 */
	@Transactional(propagation = Propagation.REQUIRED, isolation = Isolation.READ_COMMITTED, readOnly = false)
	public Integer insertAuctions(Auction auction){
		return iAuctionDao.insert(auction);
	}
	/**
	 * 修改拍卖品
	 * @param auction
	 * @return
	 */
	@Transactional(propagation = Propagation.REQUIRED, isolation = Isolation.READ_COMMITTED, readOnly = false)
	public Integer modifyAuctionByAuctionId(Auction auction) {
		return iAuctionDao.updateById(auction);
	}
	
	/**
	 * 修改拍卖品上下架
	 * @param auction
	 * @return
	 */
	@Transactional(propagation = Propagation.REQUIRED, isolation = Isolation.READ_COMMITTED, readOnly = false)
	public Integer removeAuctionByAuctionId(String auctionId) {
		return iAuctionDao.deleteById(auctionId);
	}
}
