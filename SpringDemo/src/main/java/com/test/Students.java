package com.test;

public class Students {
	
	private String name;
	private String dept;
	private int roll_no;
	private Address adr;
	public Address getAdr() {
		return adr;
	}
	public void setAdr(Address adr) {
		this.adr = adr;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDept() {
		return dept;
	}
	public void setDept(String dept) {
		this.dept = dept;
	}
	public int getRoll_no() {
		return roll_no;
	}
	public void setRoll_no(int roll_no) {
		this.roll_no = roll_no;
	}
	
	public void disp() {
		System.out.println("Name:"+name+" "+"Department"+dept+" "+"Roll_No:"+roll_no);
		adr.addrDisp();
	}
	

}
