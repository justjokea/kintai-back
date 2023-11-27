package com.tss.entity;

import java.sql.Time;
import java.time.LocalDateTime;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Kintaibi {
	private int nengabbibangou;
	private int year;
	private int month;
	private int day;
	private String youbi;
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
	

	@Override
	public String toString() {
		return "attendanceDay [nengabbibangou=" + nengabbibangou + ", year=" + year + ", month=" + month + ", day="
				+ day + ", youbi=" + youbi + ", syukkinzikan=" + syukkinzikan + ", taikinzikan=" + taikinzikan
				+ ", kyuukeizikan=" + kyuukeizikan + ", syainbanｇou=" + syainbanｇou + ", syuuseikaisuu=" + syuuseikaisuu
				+ ", saigosyuuseizikan=" + saigosyuuseizikan + ", saigosyuuseisya=" + saigosyuuseisya
				+ ", sigotonaiyou=" + sigotonaiyou + ", bikou=" + bikou + ", isdel=" + isdel + "]";
	}
}
