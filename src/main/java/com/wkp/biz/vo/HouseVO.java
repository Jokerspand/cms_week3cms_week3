package com.wkp.biz.vo;

import java.util.List;

import com.wkp.biz.domain.House;
import com.wkp.biz.domain.Type;

public class HouseVO extends House{

	private int p1;
	private int p2;
	private String name;
	private String d1;
	private String d2;
	private String tname;
	private String phone;
	
	
	
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getTname() {
		return tname;
	}
	public void setTname(String tname) {
		this.tname = tname;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getP1() {
		return p1;
	}
	public void setP1(int p1) {
		this.p1 = p1;
	}
	public int getP2() {
		return p2;
	}
	public void setP2(int p2) {
		this.p2 = p2;
	}
	public String getD1() {
		return d1;
	}
	public void setD1(String d1) {
		this.d1 = d1;
	}
	public String getD2() {
		return d2;
	}
	public void setD2(String d2) {
		this.d2 = d2;
	}
	public HouseVO(int id, String date, String name, String phone, String bz, int tid, List<Type> types, int p1, int p2,
			String d1, String d2) {
		super(id, date, name, phone, bz, tid, types);
		this.p1 = p1;
		this.p2 = p2;
		this.d1 = d1;
		this.d2 = d2;
	}
	public HouseVO() {
		super();
		// TODO Auto-generated constructor stub
	}
	public HouseVO(int id, String date, String name, String phone, String bz, int tid, List<Type> types) {
		super(id, date, name, phone, bz, tid, types);
		// TODO Auto-generated constructor stub
	}
	
	
}
