package test6;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String args[])throws IOException {
		   BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		   Port[] port = new Port[4];
		   port[0]=new Port(1,"India","Chennai");
		   port[1]=new Port(2,"America","california");
		   port[2]=new Port(3,"England","London");
		   port[3]=new Port(4,"Australia","Melbourne");
		   Shipment shipment=new Shipment();
		   boolean flag = false;
		   System.out.println("Enter the Shipment Id ");
		   shipment.setId(Integer.parseInt(br.readLine()));
		   System.out.println("Enter the Shipment Name ");
		   shipment.setName(br.readLine());
		   System.out.println("Available ports are");
		   System.out.format("%-15s %-15s %s","ID","Country","PortName");
		   for(int i=0;i<port.length;i++)
		   {
			   System.out.format("\n%-15s %-15s %s",port[i].getId(),port[i].getCountry(),
					   port[i].getName().substring(0,1).toUpperCase()+ port[i].getName().substring(1));
		   }
		   System.out.println("\nEnter the arrival port name");
		   String p1 = br.readLine();
		   System.out.println("Enter the departure port name");
		   String p2 = br.readLine();
		   ShipmentBO shipmentBO = new ShipmentBO();
		   
			   try {
				flag = shipmentBO.ValidateShipment(p1, p2, port);
				
				System.out.println("Shipment Details :");
				System.out.format("%-15s%-15s%-15s%-15s\n", "Shipment id","Shipment name","Arrival place","Departure place");
				shipmentBO.displayShipmentDetails(shipment,port,p1, p2);
			   }
			catch(InvalidPortException e){
				System.out.println("InvalidPortException: "+e.getMessage());
			}
			
	   }	
	
}
