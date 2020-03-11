package com.example.demo.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

import javax.annotation.Resource;

import org.apache.ibatis.annotations.Param;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.alibaba.fastjson.JSON;
import com.example.demo.biz.AuctionBiz;
import com.example.demo.pojo.Auction;
import com.example.demo.pojo.Auctionuser;
import com.example.demo.util.Cache;
import com.example.demo.util.ProducerTask;
import com.github.pagehelper.PageInfo;

@RestController
@RequestMapping("/api/Auctions")
public class AuctionController {
	@Resource
	private AuctionBiz auctionBiz;
	/**
	 * 查看商品
	 * @param pageNum
	 * @param pageSize
	 * @return
	 */
	@GetMapping("/Auction/finish/{pageNum}/{pageSize}")
	public PageInfo<Auction> findAuctions(@PathVariable Integer pageNum,@PathVariable Integer pageSize){
		return auctionBiz.findAuctions(pageNum, pageSize);
	}
	/**
	 * 查看最新上架的商品
	 * 
	 */
	@GetMapping("/Auction/UpperShelf/{pageNum}/{pageSize}")
	public PageInfo<Auction> findAuctionsUpperShelf(@PathVariable Integer pageNum,@PathVariable Integer pageSize){
		return auctionBiz.findAuctions(pageNum, pageSize);
	}
	
	@PostMapping("/Auction")
	public Map<String, String> insertActions(@RequestBody Auction auction){
		Map<String, String> message = new HashMap<String, String>();	
		if (auctionBiz.insertAuctions(auction) >0) {
			message.put("code", "200");
			message.put("msg", "新增成功");
		} else {
			message.put("code", "300");
			message.put("msg", "新增失败");
		}
		return message ;
	}
	
	@PutMapping("/Auction/fubu")
	public Map<String, String> modifyActionsByID(@RequestBody Auction auction){
		Map<String, String> message = new HashMap<String, String>();	
		if (auctionBiz.modifyAuctionByAuctionId(auction) >0) {
			message.put("code", "200");
			message.put("msg", "发布成功");
		} else {
			message.put("code", "300");
			message.put("msg", "发布失败");
		}
		return message ;
	}
	
	@PutMapping("/Auction")
	public Map<String, String> modifyActions(@RequestBody Auction auction){
		Map<String, String> message = new HashMap<String, String>();	
		if (auctionBiz.modifyAuctionByAuctionId(auction) >0) {
			message.put("code", "200");
			message.put("msg", "修改成功");
		} else {
			message.put("code", "300");
			message.put("msg", "修改失败");
		}
		return message ;
	}
	
	@DeleteMapping("/Auction/remove/{auctionId}")
	public  Map<String, String> removeAuctionById(@PathVariable String  auctionId){
		Map<String, String> message = new HashMap<String, String>();	
		if (auctionBiz.removeAuctionByAuctionId(auctionId) >0) {
			message.put("code", "200");
			message.put("msg", "删除成功");
		} else {
			message.put("code", "300");
			message.put("msg", "删除失败");
		}
		return message ;
	}
	
	
	
	
}
