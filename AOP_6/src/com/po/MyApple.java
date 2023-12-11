package com.po;

public class MyApple {
	private Integer appleid;//主键
	private String aplace;
	private float aweight;
	private float aprice;
	
	public Integer getAppleid() {
		return appleid;
	}
	public void setAppleid(Integer appleid) {
		this.appleid = appleid;
	}
	public String getAplace() {
		return aplace;
	}
	public void setAplace(String aplace) {
		this.aplace = aplace;
	}
	public float getAweight() {
		return aweight;
	}
	
	public void setAweight(float aweight) {
		this.aweight = aweight;
	}
	
	public float getPrice() {
		return aprice;
	}
	public void setPrice(float aprice) {
		this.aprice = aprice;
	}
	
	@Override
	public String toString() {
		return "MyApple [appleid=" + appleid + ", aplace=" + aplace + ", aweight=" + aweight + ", aprice=" + aprice
				+ "]";
	}
}
