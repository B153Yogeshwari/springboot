package com.webapp.main.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Address {
	@Id
	private int homeno;
	public int getHomeno() {
		return homeno;
	}
	public void setHomeno(int homeno) {
		this.homeno = homeno;
	}
	private String areaname;
	private String cityname;
	public String getAreaname() {
		return areaname;
	}
	public void setAreaname(String areaname) {
		this.areaname = areaname;
	}
	public String getCityname() {
		return cityname;
	}
	public void setCityname(String cityname) {
		this.cityname = cityname;
	}
	

}
