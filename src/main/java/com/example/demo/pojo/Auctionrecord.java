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
	private Integer auctionId;
	// 竞价时间
	private String auctionTime;
	// 竞拍价格
	private Double auctionPrice;

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

	public Integer getAuctionId() {
		return auctionId;
	}

	public void setAuctionId(Integer auctionId) {
		this.auctionId = auctionId;
	}

	public String getAuctionTime() {
		return auctionTime;
	}

	public void setAuctionTime(String auctionTime) {
		this.auctionTime = auctionTime;
	}

	public Double getAuctionPrice() {
		return auctionPrice;
	}

	public void setAuctionPrice(Double auctionPrice) {
		this.auctionPrice = auctionPrice;
	}

	public Auctionrecord(Integer id, Integer userId, Integer auctionId, String auctionTime, Double auctionPrice) {
		super();
		this.id = id;
		this.userId = userId;
		this.auctionId = auctionId;
		this.auctionTime = auctionTime;
		this.auctionPrice = auctionPrice;
	}

	public Auctionrecord() {
		super();
	}

	@Override
	public String toString() {
		return "Auctionrecord [id=" + id + ", userId=" + userId + ", auctionId=" + auctionId + ", auctionTime="
				+ auctionTime + ", auctionPrice=" + auctionPrice + "]";
	}

}
