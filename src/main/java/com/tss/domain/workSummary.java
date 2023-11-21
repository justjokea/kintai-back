package com.tss.domain;

public class workSummary {
	private int nengatsubangou;
	private int year;
	private int month;
	private int nitisuu;
	private float roudouzikan;
	private int heizitsusuu;
	private int syukuzisusuu;
	private int syainbangou;
	private int syukkinitisuu;
	private int kakuteiflg;
	private int isdel;
	
	public workSummary(int nengatsubangou, int year, int month, int nitisuu, float roudouzikan, int heizitsusuu,
			int syukuzisusuu, int syainbangou, int syukkinitisuu, int kakuteiflg, int isdel) {
		super();
		this.nengatsubangou = nengatsubangou;
		this.year = year;
		this.month = month;
		this.nitisuu = nitisuu;
		this.roudouzikan = roudouzikan;
		this.heizitsusuu = heizitsusuu;
		this.syukuzisusuu = syukuzisusuu;
		this.syainbangou = syainbangou;
		this.syukkinitisuu = syukkinitisuu;
		this.kakuteiflg = kakuteiflg;
		this.isdel = isdel;
	}
	
	public int getNengatsubangou() {
		return nengatsubangou;
	}
	public void setNengatsubangou(int nengatsubangou) {
		this.nengatsubangou = nengatsubangou;
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
	public int getNitisuu() {
		return nitisuu;
	}
	public void setNitisuu(int nitisuu) {
		this.nitisuu = nitisuu;
	}
	public float getRoudouzikan() {
		return roudouzikan;
	}
	public void setRoudouzikan(float roudouzikan) {
		this.roudouzikan = roudouzikan;
	}
	public int getHeizitsusuu() {
		return heizitsusuu;
	}
	public void setHeizitsusuu(int heizitsusuu) {
		this.heizitsusuu = heizitsusuu;
	}
	public int getSyukuzisusuu() {
		return syukuzisusuu;
	}
	public void setSyukuzisusuu(int syukuzisusuu) {
		this.syukuzisusuu = syukuzisusuu;
	}
	public int getSyainbangou() {
		return syainbangou;
	}
	public void setSyainbangou(int syainbangou) {
		this.syainbangou = syainbangou;
	}
	public int getSyukkinitisuu() {
		return syukkinitisuu;
	}
	public void setSyukkinitisuu(int syukkinitisuu) {
		this.syukkinitisuu = syukkinitisuu;
	}
	public int getKakuteiflg() {
		return kakuteiflg;
	}
	public void setKakuteiflg(int kakuteiflg) {
		this.kakuteiflg = kakuteiflg;
	}
	public int getIsdel() {
		return isdel;
	}
	public void setIsdel(int isdel) {
		this.isdel = isdel;
	}

	@Override
	public String toString() {
		return "workSummary [nengatsubangou=" + nengatsubangou + ", year=" + year + ", month=" + month + ", nitisuu="
				+ nitisuu + ", roudouzikan=" + roudouzikan + ", heizitsusuu=" + heizitsusuu + ", syukuzisusuu="
				+ syukuzisusuu + ", syainbangou=" + syainbangou + ", syukkinitisuu=" + syukkinitisuu + ", kakuteiflg="
				+ kakuteiflg + ", isdel=" + isdel + "]";
	}

	
}
