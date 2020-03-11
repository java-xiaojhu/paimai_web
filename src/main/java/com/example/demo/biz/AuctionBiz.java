package com.example.demo.biz;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.example.demo.dao.IAuctionDao;
import com.example.demo.pojo.Auction;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;

@Service("AuctionBiz")
@Transactional(propagation = Propagation.SUPPORTS, isolation = Isolation.READ_COMMITTED, readOnly = true)
public class AuctionBiz {
	@Resource
	private IAuctionDao iAuctionDao;
	
	public PageInfo<Auction> findAuctions(Integer pageNum,Integer pageSize){
		PageHelper.startPage(pageNum, pageSize);
		return new PageInfo<Auction>(iAuctionDao.selectList(null));
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
