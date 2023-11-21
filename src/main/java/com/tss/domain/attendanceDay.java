package com.tss.domain;

import java.sql.Time;
import java.time.LocalDateTime;


public class attendanceDay {
	private int nengabbibangou;
	private int year;
	private int month;
	private int day;
	private char youbi;
	private Time syukkinzikan;
	private Time taikinzikan;
	private Time kyuukeizikan;
	private int syainbanｇou;
	private int syuuseikaisuu;
	private LocalDateTime saigosyuuseizikan;
	private int saigosyuuseisya;
	private String sigotonaiyou;
	private String bikou;
	private int isdel;
	
	
	
	public attendanceDay(int nengabbibangou, int year, int month, int day, char youbi, Time syukkinzikan,
			Time taikinzikan, Time kyuukeizikan, int syainbanｇou, int syuuseikaisuu, LocalDateTime saigosyuuseizikan,
			int saigosyuuseisya, String sigotonaiyou, String bikou, int isdel) {
		super();
		this.nengabbibangou = nengabbibangou;
		this.year = year;
		this.month = month;
		this.day = day;
		this.youbi = youbi;
		this.syukkinzikan = syukkinzikan;
		this.taikinzikan = taikinzikan;
		this.kyuukeizikan = kyuukeizikan;
		this.syainbanｇou = syainbanｇou;
		this.syuuseikaisuu = syuuseikaisuu;
		this.saigosyuuseizikan = saigosyuuseizikan;
		this.saigosyuuseisya = saigosyuuseisya;
		this.sigotonaiyou = sigotonaiyou;
		this.bikou = bikou;
		this.isdel = isdel;
	}
	
	public int getNengabbibangou() {
		return nengabbibangou;
	}
	public void setNengabbibangou(int nengabbibangou) {
		this.nengabbibangou = nengabbibangou;
	}
	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		this.year = year;
	}
	public int getMonth() {
		return month;
	}
	public void setMonth(int month) {
		this.month = month;
	}
	public int getDay() {
		return day;
	}
	public void setDay(int day) {
		this.day = day;
	}
	public char getYoubi() {
		return youbi;
	}
	public void setYoubi(char youbi) {
		this.youbi = youbi;
	}
	public Time getSyukkinzikan() {
		return syukkinzikan;
	}
	public void setSyukkinzikan(Time syukkinzikan) {
		this.syukkinzikan = syukkinzikan;
	}
	public Time getTaikinzikan() {
		return taikinzikan;
	}
	public void setTaikinzikan(Time taikinzikan) {
		this.taikinzikan = taikinzikan;
	}
	public Time getKyuukeizikan() {
		return kyuukeizikan;
	}
	public void setKyuukeizikan(Time kyuukeizikan) {
		this.kyuukeizikan = kyuukeizikan;
	}
	public int getSyainbanｇou() {
		return syainbanｇou;
	}
	public void setSyainbanｇou(int syainbanｇou) {
		this.syainbanｇou = syainbanｇou;
	}
	public int getSyuuseikaisuu() {
		return syuuseikaisuu;
	}
	public void setSyuuseikaisuu(int syuuseikaisuu) {
		this.syuuseikaisuu = syuuseikaisuu;
	}
	public LocalDateTime getSaigosyuuseizikan() {
		return saigosyuuseizikan;
	}
	public void setSaigosyuuseizikan(LocalDateTime saigosyuuseizikan) {
		this.saigosyuuseizikan = saigosyuuseizikan;
	}
	public int getSaigosyuuseisya() {
		return saigosyuuseisya;
	}
	public void setSaigosyuuseisya(int saigosyuuseisya) {
		this.saigosyuuseisya = saigosyuuseisya;
	}
	public String getSigotonaiyou() {
		return sigotonaiyou;
	}
	public void setSigotonaiyou(String sigotonaiyou) {
		this.sigotonaiyou = sigotonaiyou;
	}
	public String getBikou() {
		return bikou;
	}
	public void setBikou(String bikou) {
		this.bikou = bikou;
	}
	public int getIsdel() {
		return isdel;
	}
	public void setIsdel(int isdel) {
		this.isdel = isdel;
	}

	@Override
	public String toString() {
		return "attendanceDay [nengabbibangou=" + nengabbibangou + ", year=" + year + ", month=" + month + ", day="
				+ day + ", youbi=" + youbi + ", syukkinzikan=" + syukkinzikan + ", taikinzikan=" + taikinzikan
				+ ", kyuukeizikan=" + kyuukeizikan + ", syainbanｇou=" + syainbanｇou + ", syuuseikaisuu=" + syuuseikaisuu
				+ ", saigosyuuseizikan=" + saigosyuuseizikan + ", saigosyuuseisya=" + saigosyuuseisya
				+ ", sigotonaiyou=" + sigotonaiyou + ", bikou=" + bikou + ", isdel=" + isdel + "]";
	}
	
	

}
