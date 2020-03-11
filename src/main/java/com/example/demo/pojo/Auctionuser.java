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
	private String username;
	//用户密码
	private String userpassword;
	//用户身份证号
	private String usercardno;
	//用户电话
	private String usertel;
	//用户地址
	private String useraddress;
	//用户邮政编号
	private String userpostnumber;
	//用户是否是管理员，0是竞拍者，1是管理员，默认值是0
	private Integer  userisadmin;
	//用户找回密码的问题
	private String userquestion;
	//用户找回密码答案
	private String useranswer;

	public Auctionuser() {
		super();
	}

	public Auctionuser(Integer userId, String username, String userpassword, String usercardno, String usertel,
			String useraddress, String userpostnumber, Integer userisadmin, String userquestion, String useranswer) {
		super();
		this.userId = userId;
		this.username = username;
		this.userpassword = userpassword;
		this.usercardno = usercardno;
		this.usertel = usertel;
		this.useraddress = useraddress;
		this.userpostnumber = userpostnumber;
		this.userisadmin = userisadmin;
		this.userquestion = userquestion;
		this.useranswer = useranswer;
	}

	public Integer getUserId() {
		return userId;
	}

	public void setUserId(Integer userId) {
		this.userId = userId;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getUserpassword() {
		return userpassword;
	}

	public void setUserpassword(String userpassword) {
		this.userpassword = userpassword;
	}

	public String getUsercardno() {
		return usercardno;
	}

	public void setUsercardno(String usercardno) {
		this.usercardno = usercardno;
	}

	public String getUsertel() {
		return usertel;
	}

	public void setUsertel(String usertel) {
		this.usertel = usertel;
	}

	public String getUseraddress() {
		return useraddress;
	}

	public void setUseraddress(String useraddress) {
		this.useraddress = useraddress;
	}

	public String getUserpostnumber() {
		return userpostnumber;
	}

	public void setUserpostnumber(String userpostnumber) {
		this.userpostnumber = userpostnumber;
	}

	public Integer getUserisadmin() {
		return userisadmin;
	}

	public void setUserisadmin(Integer userisadmin) {
		this.userisadmin = userisadmin;
	}

	public String getUserquestion() {
		return userquestion;
	}

	public void setUserquestion(String userquestion) {
		this.userquestion = userquestion;
	}

	public String getUseranswer() {
		return useranswer;
	}

	public void setUseranswer(String useranswer) {
		this.useranswer = useranswer;
	}

	@Override
	public String toString() {
		return "Auctionuser [userId=" + userId + ", username=" + username + ", userpassword=" + userpassword
				+ ", usercardno=" + usercardno + ", usertel=" + usertel + ", useraddress=" + useraddress
				+ ", userpostnumber=" + userpostnumber + ", userisadmin=" + userisadmin + ", userquestion="
				+ userquestion + ", useranswer=" + useranswer + "]";
	}

	


	
	
}
