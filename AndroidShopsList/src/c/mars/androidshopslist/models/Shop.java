package c.mars.androidshopslist.models;

import android.location.Location;

public class Shop {
	public Integer id;
	public String name;
	public String address;
	public String phone;
	public Location location;
	
	public Shop (String name, String address, String phone) {
		this.name = name;
		this.address = address;
		this.phone = phone;
	}
}
