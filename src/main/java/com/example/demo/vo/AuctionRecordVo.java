package com.example.demo.vo;

import java.util.Date;

public class AuctionRecordVo {

	private Integer id;
	// 竞拍者编号
	private Integer userId;
	// 用户名
	private String username;
	// 拍卖品编号
	private Integer auctionid;
	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	// 竞价时间
	private String auctiontime;
	// 竞拍价格
	private Double auctionprice;
	// 拍卖品名称
	private String auctionname;
	// 拍卖品起拍价
	private Double auctionstartprice;
	// 拍卖品拍卖开始时间
	private Date auctionstarttime;
	// 拍卖品拍卖结束时间
	private Date auctionendtime;

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

	public AuctionRecordVo() {
		super();
	}

	public AuctionRecordVo(Integer id, Integer userId, Integer auctionid, String auctiontime, Double auctionprice,
			String auctionname, Double auctionstartprice, Date auctionstarttime, Date auctionendtime) {
		super();
		this.id = id;
		this.userId = userId;
		this.auctionid = auctionid;
		this.auctiontime = auctiontime;
		this.auctionprice = auctionprice;
		this.auctionname = auctionname;
		this.auctionstartprice = auctionstartprice;
		this.auctionstarttime = auctionstarttime;
		this.auctionendtime = auctionendtime;
	}

	@Override
	public String toString() {
		return "AuctionRecordVo [id=" + id + ", userId=" + userId + ", auctionid=" + auctionid + ", auctiontime="
				+ auctiontime + ", auctionprice=" + auctionprice + ", auctionname=" + auctionname
				+ ", auctionstartprice=" + auctionstartprice + ", auctionstarttime=" + auctionstarttime
				+ ", auctionendtime=" + auctionendtime + "]";
	}

}
