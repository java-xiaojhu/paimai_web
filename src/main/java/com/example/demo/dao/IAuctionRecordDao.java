package com.example.demo.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.example.demo.pojo.Auctionrecord;
import com.example.demo.vo.AuctionRecordVo;

public interface IAuctionRecordDao extends BaseMapper<Auctionrecord>  {
	
	List<AuctionRecordVo>  selectList();
	List<AuctionRecordVo>  selectByList( @Param("auctionId") Integer auctionId);

}
