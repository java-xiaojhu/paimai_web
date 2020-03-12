package com.example.demo.pojo;

import java.util.Date;
import java.util.List;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;

@TableName("auction")
public class Auction {
	// 拍卖品编号
	@TableId(value = "auctionId", type = IdType.AUTO)
	private Integer auctionId;
	// 拍卖品名称
	private String auctionname;
	// 拍卖品起拍价
	private Double auctionstartprice;
	// 拍卖品底价
	private Double auctionupset;
	// 拍卖品拍卖开始时间
	private Date auctionstarttime;
	// 拍卖品拍卖结束时间
	private Date auctionendtime;
	// 拍卖品图片路径
	private String auctionpic;
	// 拍卖品描述
	private String auctiondesc;
	//拍卖品的状态
	private Integer isup;

	public Auction() {
		super();
	}

	public Integer getAuctionId() {
		return auctionId;
	}

	public void setAuctionId(Integer auctionId) {
		this.auctionId = auctionId;
	}

	public String getAuctionname() {
		return auctionname;
	}

	public void setAuctionname(String auctionname) {
		this.auctionname = auctionname;
	}

	public Double getAuctionstartprice() {
		return auctionstartprice;
	}

	public void setAuctionstartprice(Double auctionstartprice) {
		this.auctionstartprice = auctionstartprice;
	}

	public Double getAuctionupset() {
		return auctionupset;
	}

	public void setAuctionupset(Double auctionupset) {
		this.auctionupset = auctionupset;
	}

	public Date getAuctionstarttime() {
		return auctionstarttime;
	}

	public void setAuctionstarttime(Date auctionstarttime) {
		this.auctionstarttime = auctionstarttime;
	}

	public Date getAuctionendtime() {
		return auctionendtime;
	}

	public void setAuctionendtime(Date auctionendtime) {
		this.auctionendtime = auctionendtime;
	}

	public String getAuctionpic() {
		return auctionpic;
	}

	public void setAuctionpic(String auctionpic) {
		this.auctionpic = auctionpic;
	}

	public String getAuctiondesc() {
		return auctiondesc;
	}

	public void setAuctiondesc(String auctiondesc) {
		this.auctiondesc = auctiondesc;
	}

	public Auction(Integer auctionId, String auctionname, Double auctionstartprice, Double auctionupset,
			Date auctionstarttime, Date auctionendtime, String auctionpic, String auctiondesc, Integer isup) {
		super();
		this.auctionId = auctionId;
		this.auctionname = auctionname;
		this.auctionstartprice = auctionstartprice;
		this.auctionupset = auctionupset;
		this.auctionstarttime = auctionstarttime;
		this.auctionendtime = auctionendtime;
		this.auctionpic = auctionpic;
		this.auctiondesc = auctiondesc;
		this.isup = isup;
	}

	public Integer getIsup() {
		return isup;
	}

	public void setIsup(Integer isup) {
		this.isup = isup;
	}

	@Override
	public String toString() {
		return "Auction [auctionId=" + auctionId + ", auctionname=" + auctionname + ", auctionstartprice="
				+ auctionstartprice + ", auctionupset=" + auctionupset + ", auctionstarttime=" + auctionstarttime
				+ ", auctionendtime=" + auctionendtime + ", auctionpic=" + auctionpic + ", auctiondesc=" + auctiondesc
				+ "]";
	}

}
