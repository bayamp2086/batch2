package com.bayamp.training.Collections;

public class Address {
	private int buildingNumber;
	private String streetName;
	private String city;
	private String state;
	private int zipCode;

	public Address(int buildingNumber, String streetName, String city, String state, int zipCode) {
		this.buildingNumber = buildingNumber;
		this.streetName = streetName;
		this.city = city;
		this.state = state;
		this.zipCode = zipCode;
		

	}

	public Address() {
	}

	@Override
	public String toString() {
		return "buildingNumber=" + buildingNumber + ", streetName=" + streetName + ", city=" + city + ", state=" + state
				+ ", zipCode=" + zipCode;
	}

	public int getBuildingNumber() {
		return buildingNumber;
	}

	public void setBuildingNumber(int buildingNumber) {
		this.buildingNumber = buildingNumber;
	}

	public String getStreetName() {
		return streetName;
	}

	public void setStreetName(String streetName) {
		this.streetName = streetName;
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

	public int getZipCode() {
		return zipCode;
	}

	public void setZipCode(int zipCode) {
		this.zipCode = zipCode;
	}
}
