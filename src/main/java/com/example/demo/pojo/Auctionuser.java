package com.example.demo.pojo;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;

@TableName("auctionuser")
public class Auctionuser {
	//用户编号
	@TableId(value = "userId" ,type = IdType.AUTO)
	private Integer userId;
	//用户名
	private String userName;
	//用户密码
	private String userPassword;
	//用户身份证号
	private String userCardNo;
	//用户电话
	private String userTel;
	//用户地址
	private String userAddress;
	//用户邮政编号
	private String userPostNumber;
	//用户是否是管理员，0是竞拍者，1是管理员，默认值是0
	private Integer  userIsadmin;
	//用户找回密码的问题
	private String userQuestion;
	//用户找回密码答案
	private String userAnswer;

	public Auctionuser(Integer userId, String userName, String userPassword, String userCardNo, String userTel,
			String userAddress, String userPostNumber, Integer userIsadmin, String userQuestion, String userAnswer) {
		super();
		this.userId = userId;
		this.userName = userName;
		this.userPassword = userPassword;
		this.userCardNo = userCardNo;
		this.userTel = userTel;
		this.userAddress = userAddress;
		this.userPostNumber = userPostNumber;
		this.userIsadmin = userIsadmin;
		this.userQuestion = userQuestion;
		this.userAnswer = userAnswer;
	}

	public Auctionuser() {
		super();
	}

	public Integer getUserId() {
		return userId;
	}

	public void setUserId(Integer userId) {
		this.userId = userId;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getUserPassword() {
		return userPassword;
	}

	public void setUserPassword(String userPassword) {
		this.userPassword = userPassword;
	}

	public String getUserCardNo() {
		return userCardNo;
	}

	public void setUserCardNo(String userCardNo) {
		this.userCardNo = userCardNo;
	}

	public String getUserTel() {
		return userTel;
	}

	public void setUserTel(String userTel) {
		this.userTel = userTel;
	}

	public String getUserAddress() {
		return userAddress;
	}

	public void setUserAddress(String userAddress) {
		this.userAddress = userAddress;
	}

	public String getUserPostNumber() {
		return userPostNumber;
	}

	public void setUserPostNumber(String userPostNumber) {
		this.userPostNumber = userPostNumber;
	}

	public Integer getUserIsadmin() {
		return userIsadmin;
	}

	public void setUserIsadmin(Integer userIsadmin) {
		this.userIsadmin = userIsadmin;
	}

	public String getUserQuestion() {
		return userQuestion;
	}

	public void setUserQuestion(String userQuestion) {
		this.userQuestion = userQuestion;
	}

	public String getUserAnswer() {
		return userAnswer;
	}

	public void setUserAnswer(String userAnswer) {
		this.userAnswer = userAnswer;
	}

	@Override
	public String toString() {
		return "Auctionuser [userId=" + userId + ", userName=" + userName + ", userPassword=" + userPassword
				+ ", userCardNo=" + userCardNo + ", userTel=" + userTel + ", userAddress=" + userAddress
				+ ", userPostNumber=" + userPostNumber + ", userIsadmin=" + userIsadmin + ", userQuestion="
				+ userQuestion + ", userAnswer=" + userAnswer + "]";
	}
	
	
}
