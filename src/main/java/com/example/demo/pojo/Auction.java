package com.example.demo.pojo;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;

@TableName("auction")
public class Auction {
	//拍卖品编号
	@TableId(value = "auctionId",type = IdType.AUTO)
	private Integer auctionId;
	//拍卖品名称
	private String auctionName;
	//拍卖品起拍价
	private Double auctionStartPrice;
	//拍卖品底价
	private Double auctionUpset;
	//拍卖品拍卖开始时间
	private String auctionStartTime;
	//拍卖品拍卖结束时间
	private String auctionEndTime;
	//拍卖品图片路径
	private String auctionPic;
	//拍卖品描述
	private String auctionDesc;

	public Integer getAuctionId() {
		return auctionId;
	}

	public void setAuctionId(Integer auctionId) {
		this.auctionId = auctionId;
	}

	public String getAuctionName() {
		return auctionName;
	}

	public void setAuctionName(String auctionName) {
		this.auctionName = auctionName;
	}

	public Double getAuctionStartPrice() {
		return auctionStartPrice;
	}

	public void setAuctionStartPrice(Double auctionStartPrice) {
		this.auctionStartPrice = auctionStartPrice;
	}

	public Double getAuctionUpset() {
		return auctionUpset;
	}

	public void setAuctionUpset(Double auctionUpset) {
		this.auctionUpset = auctionUpset;
	}

	public String getAuctionStartTime() {
		return auctionStartTime;
	}

	public void setAuctionStartTime(String auctionStartTime) {
		this.auctionStartTime = auctionStartTime;
	}

	public String getAuctionEndTime() {
		return auctionEndTime;
	}

	public void setAuctionEndTime(String auctionEndTime) {
		this.auctionEndTime = auctionEndTime;
	}

	public String getAuctionPic() {
		return auctionPic;
	}

	public void setAuctionPic(String auctionPic) {
		this.auctionPic = auctionPic;
	}

	public String getAuctionDesc() {
		return auctionDesc;
	}

	public void setAuctionDesc(String auctionDesc) {
		this.auctionDesc = auctionDesc;
	}

	public Auction() {
		super();
	}

	public Auction(Integer auctionId, String auctionName, Double auctionStartPrice, Double auctionUpset,
			String auctionStartTime, String auctionEndTime, String auctionPic, String auctionDesc) {
		super();
		this.auctionId = auctionId;
		this.auctionName = auctionName;
		this.auctionStartPrice = auctionStartPrice;
		this.auctionUpset = auctionUpset;
		this.auctionStartTime = auctionStartTime;
		this.auctionEndTime = auctionEndTime;
		this.auctionPic = auctionPic;
		this.auctionDesc = auctionDesc;
	}

	@Override
	public String toString() {
		return "Auction [auctionId=" + auctionId + ", auctionName=" + auctionName + ", auctionStartPrice="
				+ auctionStartPrice + ", auctionUpset=" + auctionUpset + ", auctionStartTime=" + auctionStartTime
				+ ", auctionEndTime=" + auctionEndTime + ", auctionPic=" + auctionPic + ", auctionDesc=" + auctionDesc
				+ "]";
	}
	
	

}
