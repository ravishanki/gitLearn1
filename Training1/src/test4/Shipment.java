package test4;
import java.awt.List;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Scanner;
public class Shipment {
	
	    private  int id;
	    private String shipperName;
	    private String modeOfTransportation;
	    private Float totalWeight;
	    private String arrivalPort;
	    private String departurePort;
	    private static int nextShipmentId=1000;
	    
	    
	    public Shipment(int id,String shipperName, String modeOfTransportation,Float totalWeight,String arrivalPort,String departurePort)
	    {
	    	this.id = id;
	    	this.shipperName =shipperName;
	    	this.modeOfTransportation = modeOfTransportation;
	    	this.totalWeight = totalWeight;
	    	this.arrivalPort =arrivalPort;
	    	this.departurePort = departurePort;
	    	    	
	    }
	    public static Shipment createNewShipment(String shipperName,String modeOfTransportation,Float totalWeight,String arrivalPort,String departurePort)
	    {	
	    	
	    	nextShipmentId+=1;
	    	Shipment s1 = new Shipment(nextShipmentId,shipperName, modeOfTransportation,totalWeight, arrivalPort, departurePort);
	    	return s1;
	    }
	    @Override
		public String toString(){
	    	DecimalFormat df = new DecimalFormat("#.#");
	    	return String.format("%-15d%-15s%-25s%-15s%-20s%s",this.id,this.shipperName,this.modeOfTransportation,df.format(this.totalWeight).toString()+"Kg",this.arrivalPort,this.departurePort) ;
	    }
	 
	    public static void main(String[] args) {
	    
		    String shipperName;
		    String modeOfTransportation;
		    Float totalWeight;
		    String arrivalPort;
		    String departurePort;
	    	int i;
	    	System.out.println("Enter the number of shipments :");
	    	Scanner reader =  new Scanner(System.in);
	    	String temp = reader.nextLine();
	    	int nos = Integer.parseInt(temp);
	    	Shipment[] s = new Shipment[nos];
	    	
	    	for(i=0;i<nos;i++){
	    		System.out.println("Enter the shipment " + (i+1) + " details");
	    		System.out.println("Enter the shipper name :");
	    		shipperName = reader.nextLine();
	    		System.out.println("Enter the mode of transportation :");
	    		modeOfTransportation = reader.nextLine();
	    		System.out.println("Enter the total weight :");
	    		temp = reader.nextLine();
	    		totalWeight = Float.parseFloat(temp);
	    		System.out.println("Enter the arrival port :");
	    		arrivalPort = reader.nextLine();
	    		System.out.println("Enter the departure port :");
	    		departurePort = reader.nextLine();
	    		//s[i] = new Shipment(id,shipperName,modeOfTransportation,totalWeight,arrivalPort,departurePort);
	    		s[i] = Shipment.createNewShipment(shipperName, modeOfTransportation, totalWeight, arrivalPort, departurePort);
	    
	    		}
	    	System.out.println("Shipment details are");
	    	System.out.format("%-15s%-15s%-25s%-15s%-20s%s\n","Id","Shippername","Mode of transportation","Total Weight","Arrival port","Departure port");
	    	for(i=0;i<nos;i++){
	    		System.out.println(s[i]);
	    	}
	    	
	    }
}
