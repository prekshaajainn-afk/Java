package com.java.testHotel;
//displayAll, visibleAll
import java.util.List;
import java.util.Scanner;

public class HotelVisible {
	//public static void UserBill() {
	public static void main(String[] args) {
		List<Hotel> listnew= HotelData.displayAllHotels();
		Scanner sc = new Scanner(System.in);
		/*System.out.println("Select hotel(1/2/3):  ");
		int HNo = sc.nextInt();
		System.out.println("For how many days you need the room :  ");
		int days = sc.nextInt();
		float bill = 0.0f;*/
		System.out.println("enter hostel name (sarovar/raj/simran): ");
		String name = sc.next();
		System.out.println("For how many days you need the room :  ");
		int days = sc.nextInt();
		float bill = 0.0f;
		/*for(Hotel g: listnew) {
			if(HNo == g.getID()) {
				System.out.println("Your booked Hotel - "+(g.getName()));
			}
		}*/
	
		for(Hotel g: listnew) {
			/*if(HNo==g.getID()) {
				System.out.println("Your booked Hotel - "+(g.getName()));
				bill = g.getPrice()* days;
			}*/
			if (name.equals(g.getName())){
				System.out.println("Your booked Hotel - "+(g.getName()));
			
				bill = g.getPrice()* days;}
			}
			System.out.println("Total Bill is $"+bill);
			boolean y = sc.next() != null;
			System.out.println("Enter y to accept(yes): ");
			String yes = null;
			if(y=yes != null) {
				
				System.exit(0);
			}
			else {
				System.out.println("enter hostel name (sarovar/raj/simran): ");
			}
		
			
	}

}
