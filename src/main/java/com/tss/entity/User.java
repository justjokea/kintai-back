package com.tss.entity;

public class User {
	private int syainbangou;
	private String loginid;
	private String password;
	private int isdel;
	
	public User(int syainbangou, String loginid, String password, int isdel) {
		super();
		this.syainbangou = syainbangou;
		this.loginid = loginid;
		this.password = password;
		this.isdel = isdel;
	}
	
	public int getSyainbangou() {
		return syainbangou;
	}
	public void setSyainbangou(int syainbangou) {
		this.syainbangou = syainbangou;
	}
	public String getLoginid() {
		return loginid;
	}
	public void setLoginid(String loginid) {
		this.loginid = loginid;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public int getIsdel() {
		return isdel;
	}
	public void setIsdel(int isdel) {
		this.isdel = isdel;
	}
	
	@Override
	public String toString() {
		return "user [syainbangou=" + syainbangou + ", loginid=" + loginid + ", password=" + password + ", isdel="
				+ isdel + "]";
	}	
}
