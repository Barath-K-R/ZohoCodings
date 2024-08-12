package AdvancedCoding.FlightReservation;

import java.util.ArrayList;
import java.util.HashMap;

public class Flight {
	
    static int tempid = 0;
    int id;
    ArrayList<Integer> tickets;
    int price;
    String flightname;
    ArrayList<String> passengerDetails;
    ArrayList<ArrayList<Integer>>bookedTicketsPerPassenger;
    ArrayList<Integer> passengerCost;
    ArrayList<String>passengerIDs;
    static HashMap<Integer,String> flights=new HashMap<Integer,String>();
    int indextoremove;
	 public Flight(String s)
	    {
	      tickets=new ArrayList<Integer>();
	       for(int j=1;j<=50;++j)
	    	   tickets.add(j);
	       
	        price = 5000;
	        tempid = tempid + 1;
	        id=tempid;
	        flights.put(id,s);
	        flightname=s;
	        passengerIDs=new ArrayList<String>();
	        passengerDetails = new ArrayList<String>();
	        bookedTicketsPerPassenger = new  ArrayList<ArrayList<Integer>>();
	        passengerCost = new ArrayList<Integer>();
	    }
	 
	 public  void addPassengerDetails(int flightid, String passengername, int nooftickets,
				ArrayList<Integer> usertickets) {
			
		 passengerIDs.add(passengername);
		 bookedTicketsPerPassenger.add(usertickets);
		 passengerCost.add(price*nooftickets);
		 price=price+(nooftickets*200);
		 for(int t:usertickets)
		 {
			 int index=tickets.indexOf(t);
			 tickets.set(index, 0);
		 }
		 System.out.println("booked successfully");
		}
	 
	 public void flightSummary() {
		 
		 System.out.println("available tickets");
		 int temp=3;
		 for(int t=0;t<tickets.size();++t)
		 {
			 
			 if(t%6==0)
				 System.out.println();
			if(t==temp)
			{
				System.out.print("-- ");
				temp+=6;
			}
			 System.out.print(tickets.get(t)+" ");
		 }
		 System.out.println();
		 System.out.println("Current Ticket Price Rs."+price);
		 System.out.println();
	 }
	 public void cancelTicket(String passengername)
	 {
		 indextoremove=passengerIDs.indexOf(passengername);
		 price=price-bookedTicketsPerPassenger.get(indextoremove).size()*200;
		 passengerCost.remove(indextoremove);
		 for(int i:bookedTicketsPerPassenger.get(indextoremove))
		 {
			 tickets.set(i-1, i);
		 }
		
		 passengerIDs.remove(indextoremove);
		 
		 System.out.println("your bookings"+bookedTicketsPerPassenger.get(indextoremove) +" in "+flightname+" have been successfully cancelled");
		 bookedTicketsPerPassenger.remove(indextoremove);
		 
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	

}
