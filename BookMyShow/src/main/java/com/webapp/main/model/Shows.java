package com.webapp.main.model;

public class Shows {
	private int showId;
	private String name;
	private String time;
	private int availableTicket;
	private int price;
	private String type;
	private String date;
	public int getShowId() {
		return showId;
	}
	public void setShowId(int showId) {
		this.showId = showId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getTime() {
		return time;
	}
	public void setTime(String time) {
		this.time = time;
	}
	public int getAvailableTicket() {
		return availableTicket;
	}
	public void setAvailableTicket(int availableTicket) {
		this.availableTicket = availableTicket;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}

}
