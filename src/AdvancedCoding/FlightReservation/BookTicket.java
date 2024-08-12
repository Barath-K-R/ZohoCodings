package AdvancedCoding.FlightReservation;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class BookTicket {
    public static void book(Flight currentflight,int flightid,String passengername,int nooftickets,ArrayList<Integer>usertickets,ArrayList<Flight>flightslist)
    {
    	currentflight.addPassengerDetails(flightid,passengername,nooftickets, usertickets);
    	
    	currentflight.flightSummary();
    }
    public static void cancel(Flight currentflight,String passengername)
    {
    	currentflight.cancelTicket(passengername);
    }
	public static void main(String[] args) {
		ArrayList<Flight>flightslist=new ArrayList<Flight>();
		flightslist.add(new Flight("airIndia"));
		flightslist.add(new Flight("spicejet"));
		flightslist.add(new Flight("indica"));
		flightslist	.add(new Flight("KingFisher"));
		ArrayList<Integer>usertickets;
		
		
		
		 
		 while(true)
	        {
	        System.out.println("1. Book 2. Cancel 3. Print");
	        Scanner sc = new Scanner(System.in);
	        int choice = sc.nextInt();
	        
	        switch(choice)
	        {
	        case 1:
	        {
	        	System.out.println("List of flights");
	        	for(Flight f:flightslist)
	        		System.out.println(f.id+". "+f.flightname);
	        	
	        	System.out.println();
	        	System.out.println("Enter your name");
	        	sc.nextLine();
	        	String passengername=sc.nextLine();
	        	System.out.println("Enter flight id");
	        	
	        	int flightid=sc.nextInt();
	        	int check=0;
	        	
	        	if(!Flight.flights.containsKey(flightid))
	        	{
	        		System.out.println("Invalid flight name");
	        		break;
	        	}
	        	
	        	Flight currentFlight = null;
	        	
	        	for(Flight f:flightslist)
	        	{
	        		if(f.id==flightid)
	        			currentFlight=f;
	        		
	            }
	        	
	        	currentFlight.flightSummary();
	        	
	        	 System.out.println("Enter the no of tickets");
	        	 int notickets=sc.nextInt();
	        	 System.out.println("choose your seats");
	        	 usertickets=new ArrayList<Integer>();
	        	 for(int p=0;p<notickets;++p)
	        	 {
	        	     usertickets.add(sc.nextInt());
	        	     
	        	 }
	        	
	        	 for(int l:usertickets)
	        	 {
	        		System.out.println(l);
	        		 if(currentFlight.tickets.indexOf(l)==-1)
	        	     {
	        	    	 System.out.println("entered ticket is unavailable");
	        	    	 check=1;
	        	    	 break;
	        	     }
	        	 }
	        	
	        	 if(check!=1)
	        	 book(currentFlight,flightid,passengername,notickets,usertickets,flightslist);
	        	 
	             break;
	        	 
	             
	        }
	        case 2:
	        {
	        	System.out.println("Enter flight ID and passenger name to cancel booking");
	            int fid=sc.nextInt();
	            sc.nextLine();
	            String passengername=sc.nextLine();
	            
	            if(!Flight.flights.containsKey(fid))
	        	{
	        		System.out.println("Invalid flight name");
	        		break;
	        	}
	            

	        	Flight currentFlight = null;
	        	
	        	for(Flight f:flightslist)
	        	{
	        		if(f.id==fid)
	        			currentFlight=f;
	        		
	            }
	            cancel(currentFlight,passengername);
	            
	        
	        }
	        case 3:
	        {
	        	for(Flight f:flightslist)
	        	{
	        		int count=0;
	        		System.out.println(f.id+"."+f.flightname);
	        		for(String s:f.passengerIDs)
	        		{
	        			int index=f.passengerIDs.indexOf(s);
	        			System.out.print(s+"--");
	        			System.out.println(f.bookedTicketsPerPassenger.get(index));
	        		}
	        		for(int t:f.tickets)
	        		{
	        			if(t!=0)
	        				count++;
	        		}
	        		System.out.println("available tickets: "+count);
	        		System.out.println("current price: "+f.price);
	        		System.out.println();
	        	}
	        }
	        }
	}
}
}
	
