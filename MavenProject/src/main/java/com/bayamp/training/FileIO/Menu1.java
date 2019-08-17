package com.bayamp.training.FileIO;

public class Menu1 {

	String dishName;
	String type;
	int price;

	Menu1(String d, String t, int p) {
		d = dishName;
		t = type;
		p = price;

	}

	public String getDishName() {
		return dishName;
	}

	public String getType() {
		return type;
	}

	public int getPrice() {
		return price;
	}public Menu1() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "MenuList1 [dishName=" + dishName + ", type=" + type + ", price=" + price + "]";
	}


}
