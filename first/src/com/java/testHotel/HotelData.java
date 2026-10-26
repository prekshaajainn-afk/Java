package com.java.testHotel;
import java.util.Scanner;
import java.security.DomainCombiner;
import java.util.ArrayList;
import java.util.List;


public class HotelData {
	public static List<Hotel> displayAllHotels(){
		System.out.println("How many hotels you want to input? ");
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		System.out.println("Enter hotel name");
		System.out.println("Enter room type");
		System.out.println("Enter price");
		List<Hotel> list = new ArrayList<Hotel>();
		for(int i=0; i<a; i++) {
			String hotel_namee = sc.next();
			String room_typ = sc.next();
			float price = sc.nextFloat();
			
			Hotel hotel=new Hotel(i+1, hotel_namee, room_typ, price);
			list.add(hotel);
		}
		
		
		
		//String hotelName[]=new String[h];
	
		/*Hotel h1 = new Hotel(1, "Sarovar", "L1", 9000);
		Hotel h2 = new Hotel(2, "Manya", "L4", 11000);
		Hotel h3 = new Hotel(3, "Tom", "L3", 7700);
		
		
		list.add(h1);
		list.add(h2);
		list.add(h3);*/
	
			
			for(Hotel g:list)
			{ 
				System.out.println( "["+g.getName() +"   "+ "$"+ g.getPrice() +"   "+ g.getRoomtype()+"]");
				
			}
			
		
		return list;
}

	public HotelData() {
		super();
	}

	public HotelData() {
		super();
	}}
