/*Hotel booking system
Id
Name
RoomType
price
create a module where user can see list of hoetls with price
if user select any hotel then u ask for how many days and generate final bill.
*/
package com.java.testHotel;
public class Hotel {
	int ID;
	String name;
	String Roomtype;
	float price;
	public Hotel(int iD, String name, String roomtype, float price) {
		super();
		ID = iD;
		this.name = name;
		Roomtype = roomtype;
		this.price = price;
	}
	public int getID() {
		return ID;
	}
	public void setID(int iD) {
		ID = iD;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getRoomtype() {
		return Roomtype;
	}
	public void setRoomtype(String roomtype) {
		Roomtype = roomtype;
	}
	public float getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	
	
}


