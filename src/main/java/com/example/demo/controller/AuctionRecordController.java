package com.example.demo.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.alibaba.fastjson.JSON;
import com.example.demo.biz.AuctionRecordBiz;
import com.example.demo.pojo.Auctionrecord;
import com.example.demo.vo.AuctionRecordVo;

@RestController
@RequestMapping("/api/AuctionRecords")
public class AuctionRecordController {
	
	@Resource
	private AuctionRecordBiz auctionRecordBiz;
	@GetMapping("/{pageNum}/{pageSize}")
	public List<AuctionRecordVo> selectrecord(@PathVariable Integer pageNum, @PathVariable Integer pageSize){	
		return auctionRecordBiz.selectrecord(pageNum, pageSize);
	};
	@GetMapping("/Auctionrecord/{auctionid}")
	public List<AuctionRecordVo> selectrecord(@PathVariable Integer auctionid){	
		return auctionRecordBiz.selectpaiListByid(auctionid);
	};
	@PostMapping("/Auctionrecord")
	public Map<String, String> addAuctionRecord(@RequestBody Auctionrecord Auction){	
		Map<String, String> message = new HashMap<String, String>();
		if (auctionRecordBiz.addRecord(Auction)>0) {		
			message.put("code", "200");		
			message.put("msg", "出价成功");
		} else {
			message.put("code", "300");
			message.put("msg", "出价失败");
		}
		return message;
	};
	
}
