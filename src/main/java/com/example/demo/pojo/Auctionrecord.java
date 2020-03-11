package com.example.demo.pojo;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;

@TableName("auctionrecord")
public class Auctionrecord {
	// 竞拍记录编号
	@TableId(value = "id", type = IdType.AUTO)
	private Integer id;
	// 竞拍者编号
	private Integer userId;
	// 拍卖品编号
	private Integer auctionid;
	// 竞价时间
	private String auctiontime;
	// 竞拍价格
	private Double auctionprice;
	
	public Auctionrecord(Integer id, Integer userId, Integer auctionid, String auctiontime, Double auctionprice) {
		super();
		this.id = id;
		this.userId = userId;
		this.auctionid = auctionid;
		this.auctiontime = auctiontime;
		this.auctionprice = auctionprice;
	}

	public Auctionrecord() {
		super();
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Integer getUserId() {
		return userId;
	}

	public void setUserId(Integer userId) {
		this.userId = userId;
	}

	public Integer getAuctionid() {
		return auctionid;
	}

	public void setAuctionid(Integer auctionid) {
		this.auctionid = auctionid;
	}

	public String getAuctiontime() {
		return auctiontime;
	}

	public void setAuctiontime(String auctiontime) {
		this.auctiontime = auctiontime;
	}

	public Double getAuctionprice() {
		return auctionprice;
	}

	public void setAuctionprice(Double auctionprice) {
		this.auctionprice = auctionprice;
	}

	@Override
	public String toString() {
		return "Auctionrecord [id=" + id + ", userId=" + userId + ", auctionid=" + auctionid + ", auctiontime="
				+ auctiontime + ", auctionprice=" + auctionprice + "]";
	}
	
	

	
}
