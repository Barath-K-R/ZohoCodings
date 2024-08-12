package TaxiBooking;

import java.util.ArrayList;
import java.util.Scanner;

public class BookTicket {

	public static void bookticket(char pickupspot, char dropspot, int pickuptime, ArrayList<Taxi> taxilist,String customername) {
		Taxi currenttaxi=checkfreetaxi(pickupspot, dropspot, pickuptime, taxilist);
		int droptime = 0,earnings = 0;
		String tripdetails="";
		if(currenttaxi!=null)
		{
			int temp=dropspot-pickupspot;
			int distance=temp*15;
			earnings=((distance-5)*10)+100;
			droptime=pickuptime+temp;
			tripdetails=pickupspot+"     "+dropspot+"          "+pickuptime+"         "+droptime+"          "+"Rs"+earnings;
			System.out.println(droptime+" "+earnings+" "+dropspot);
		}
		else
		{
			System.out.println("Booking is rejected");
			return;
		}
		currenttaxi.setdetails(dropspot,earnings,droptime,tripdetails,customername);
		return;
	}

	public static Taxi checkfreetaxi(char pickupspot, char dropspot, int pickuptime,ArrayList<Taxi> taxilist) {
		Taxi currenttaxi = null;
		int mindistance =(taxilist.get(0).currentspot-pickupspot)*-1 ,minearnings=taxilist.get(0).earnings;
		System.out.println(mindistance);
		for(Taxi t:taxilist){
			
			if (t.freetime>pickuptime)
			{
				continue;
			}
			else if(Math.abs(t.currentspot-pickupspot)<mindistance)
            {
				System.out.println(t.id+"s "+"currentspot "+Math.abs(t.currentspot-pickupspot)+"<="+mindistance);
				
				   System.out.println("earnings "+t.earnings+"<="+minearnings);
				   currenttaxi=t;
				   minearnings=t.earnings;
				   mindistance=(t.currentspot-pickupspot)*(-1);
			}
			else if(Math.abs(t.currentspot-pickupspot)==mindistance)
			{
				if(t.earnings<=minearnings)
				{
					System.out.println("earnings "+t.earnings+"<="+minearnings);
				   currenttaxi=t;
				   minearnings=t.earnings;
				}
				else
					continue;
			}
		}
		System.out.println(currenttaxi.id+"th taxi is free");
		return currenttaxi;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		ArrayList<Taxi> taxilist = new ArrayList<Taxi>();
		for (int i = 0; i < 4; ++i) {
			taxilist.add(new Taxi());
		}
		int  pickuptime, droptime;
		char pickupspot, dropspot;
		String customername="";
		while (true) {
			 System.out.println("0 - > Book Taxi");
		        System.out.println("1 - > Print Taxi details");
		        int choice = sc.nextInt();
			switch (choice) {
			case 0: {
				sc.nextLine();
				System.out.println("Enter your name");
				customername= sc.nextLine();
				System.out.println("Enter your pickup spot");
				pickupspot= sc.next().charAt(0);
				System.out.println("Enter your drop spot");
				dropspot = sc.next().charAt(0);
				if(pickupspot<'A' || pickupspot >'F' || dropspot<'A'||dropspot>'F')
				{
					System.out.println("invalid location");
					break;
				}
				System.out.println("Enter your pickup time");
				pickuptime = sc.nextInt();
				
				//booking ticket
				bookticket(pickupspot, dropspot, pickuptime, taxilist,customername);
				System.out.println(taxilist.get(0).earnings);
			}
			case 1:
			{
				System.out.println("TaxiId"+"    "+"Customername"+"    "+"From"+"    "+"To"+"    "+"PickupTime"+"    "+"DropTime"+"    "+"Amount");
				for(Taxi t:taxilist)
				{
					t.printdetails();
				}
			}
			}
		}

	}

}
