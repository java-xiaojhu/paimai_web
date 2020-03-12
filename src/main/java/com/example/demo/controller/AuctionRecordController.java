package com.example.demo.controller;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


import com.example.demo.biz.AuctionRecordBiz;
import com.example.demo.vo.AuctionRecordVo;

@RestController
@RequestMapping("/api/AuctionRecords")
public class AuctionRecordController {
	
	@Resource
	private AuctionRecordBiz auctionRecordBiz;
	@GetMapping("/{pageNum}/{pageNum}")
	public List<AuctionRecordVo> selectrecord(@PathVariable Integer pageNum, @PathVariable Integer pageSize){	
		return auctionRecordBiz.selectrecord(pageNum, pageSize);
	};
}
