package TaxiBooking;

import java.util.ArrayList;

public class Taxi {

    static int tempid=0;
    int id;
	char currentspot;
	int freetime;
	int earnings;
	
	ArrayList<String>trips;
	ArrayList<String>customernames;
    public  Taxi(){
    	    tempid=tempid+1;
           	id=tempid;
           	currentspot='A';
           	freetime=6;
           	earnings=0;
            customernames=new ArrayList<String>();
           	trips=new ArrayList<String>();
    }
    public void setdetails(char dropspot,int earnings,int droptime,String tripdetails,String cutomername) {
    	this.currentspot=dropspot;
    	this.earnings=earnings;
    	this.freetime=droptime;
    	this.trips.add(tripdetails);
    	this.customernames.add(cutomername);
    	return;
    }
    public void printdetails() {
    	
    	
    	
    	
    	if(this.trips.isEmpty())
    	{
    		System.out.println();
    		System.out.println("-------------------------------------------------------------------------------------");
    	}
    	for(int i=0;i<this.trips.size();++i)
    	{
    		System.out.print("   "+this.id+"         ");
    		System.out.print(this.customernames.get(i)+"          ");
    	    System.out.println(this.trips.get(i));
    	}
    }
	public static void main(String[] args) {
		

	}

}
