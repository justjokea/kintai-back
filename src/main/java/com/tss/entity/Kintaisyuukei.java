package com.tss.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Kintaisyuukei {
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
	

	@Override
	public String toString() {
		return "workSummary [nengatsubangou=" + nengatsubangou + ", year=" + year + ", month=" + month + ", nitisuu="
				+ nitisuu + ", roudouzikan=" + roudouzikan + ", heizitsusuu=" + heizitsusuu + ", syukuzisusuu="
				+ syukuzisusuu + ", syainbangou=" + syainbangou + ", syukkinitisuu=" + syukkinitisuu + ", kakuteiflg="
				+ kakuteiflg + ", isdel=" + isdel + "]";
	}

	
}
