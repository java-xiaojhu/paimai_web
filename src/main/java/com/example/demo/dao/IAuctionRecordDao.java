package com.example.demo.dao;

import java.util.List;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.example.demo.pojo.Auctionrecord;
import com.example.demo.vo.AuctionRecordVo;

public interface IAuctionRecordDao extends BaseMapper<Auctionrecord>  {
	
	List<AuctionRecordVo>  selectList();

}
