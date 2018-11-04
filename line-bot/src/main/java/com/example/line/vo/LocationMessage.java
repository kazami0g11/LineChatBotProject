package com.example.line.vo;

public class LocationMessage extends BaseMessage {
	private String title;

	private String address;

	private Double latitude;

	private Double longitude;

	public LocationMessage(String title, String address, Double latitude, Double longitude) {
		super();
		this.title = title;
		this.address = address;
		this.latitude = latitude;
		this.longitude = longitude;
		setType("location");
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public Double getLatitude() {
		return latitude;
	}

	public void setLatitude(Double latitude) {
		this.latitude = latitude;
	}

	public Double getLongitude() {
		return longitude;
	}

	public void setLongitude(Double longitude) {
		this.longitude = longitude;
	}
}
