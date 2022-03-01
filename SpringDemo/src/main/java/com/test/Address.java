package com.test;

public class Address {
	private String str;
	private String city;
	private String state;
	public String getStr() {
		return str;
	}
	public void setStr(String str) {
		this.str = str;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	
	public void addrDisp() {
		System.out.println();
		System.out.println("Street"+" "+str+" City Name: "+city+" State: "+state);
	}

}
