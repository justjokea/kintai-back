package com.tss.entity;

import java.util.Date;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Syainjyouhou {
	private int syainbangou;
	private String name;
	private String katakana;
	private Date birthday;
	private String phonenumber;
	private String email;
	private String mynumber;
	private String zairyuucardbango;
	private Date zairyuukikan;
	private String yuubinbango;
	private String zyuusyo;
	private String moyorieki;
	private String nihongosikaku;
	private String sonohokasikaku;
	private Date rainitizikan;
	private String saisyuugakureigakkouna;
	private String sotugyouzikan;
	private Date nyuusyabi;
	private int kinmukeikennensuu;
	private String gingoumei;
	private String sitenbangou;
	private String kouzabangou;
	private String ginkoumeigi	;
	private String zainitikinkyuurenrakusimei;	
	private String zainitikinkyuurenrakudenwa;
	private String kinkyuurenrakuoyasimei;
	private String kinkyuurenrakudenwa;
	@Override
	public String toString() {
		return "Syainjyouhou [syainbangou=" + syainbangou + ", name=" + name + ", katakana=" + katakana + ", birthday="
				+ birthday + ", phonenumber=" + phonenumber + ", email=" + email + ", mynumber=" + mynumber
				+ ", zairyuucardbango=" + zairyuucardbango + ", zairyuukikan=" + zairyuukikan + ", yuubinbango="
				+ yuubinbango + ", zyuusyo=" + zyuusyo + ", moyorieki=" + moyorieki + ", nihongosikaku=" + nihongosikaku
				+ ", sonohokasikaku=" + sonohokasikaku + ", rainitizikan=" + rainitizikan + ", saisyuugakureigakkouna="
				+ saisyuugakureigakkouna + ", sotugyouzikan=" + sotugyouzikan + ", nyuusyabi=" + nyuusyabi
				+ ", kinmukeikennensuu=" + kinmukeikennensuu + ", gingoumei=" + gingoumei + ", sitenbangou="
				+ sitenbangou + ", kouzabangou=" + kouzabangou + ", ginkoumeigi=" + ginkoumeigi
				+ ", zainitikinkyuurenrakusimei=" + zainitikinkyuurenrakusimei + ", zainitikinkyuurenrakudenwa="
				+ zainitikinkyuurenrakudenwa + ", kinkyuurenrakuoyasimei=" + kinkyuurenrakuoyasimei
				+ ", kinkyuurenrakudenwa=" + kinkyuurenrakudenwa + "]";
	}
}
