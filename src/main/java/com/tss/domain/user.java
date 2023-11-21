package com.tss.domain;

public class user {
	private int syainbangou;
	private char loginid;
	private char password;
	private int isdel;
	
	public user(int syainbangou, char loginid, char password, int isdel) {
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
	public char getLoginid() {
		return loginid;
	}
	public void setLoginid(char loginid) {
		this.loginid = loginid;
	}
	public char getPassword() {
		return password;
	}
	public void setPassword(char password) {
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
