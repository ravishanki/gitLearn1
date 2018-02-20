package test8cc;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.EnumMap;
import java.util.List;

import test8.Port;

public class Shipment {
	private String customerName;
	private String bookingNumber;
	private Double weight;
	private String status;
	public Shipment(String customerName, String bookingNumber, Double weight, String status) {
		super();
		this.customerName = customerName;
		this.bookingNumber = bookingNumber;
		this.weight = weight;
		this.status = status;
	}
	public String getCustomerName() {
		return customerName;
	}
	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}
	public String getBookingNumber() {
		return bookingNumber;
	}
	public void setBookingNumber(String bookingNumber) {
		this.bookingNumber = bookingNumber;
	}
	public Double getWeight() {
		return weight;
	}
	public void setWeight(Double weight) {
		this.weight = weight;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public enum ShipmentStatus {         DELIVERED, TRANSIT, PENDING;   } 
	   public static void main(String args[])throws IOException {
	 BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
	   List<Shipment> list = new ArrayList<Shipment>(); 
	   System.out.println("Enter the number of shipments");
	   Integer number = Integer.parseInt(br.readLine());
	   for(int i=0;i<number;i++){
		   String order = br.readLine();
		   String[] t = order.split(",");
		   list.add(new Shipment(t[0],t[1],Double.parseDouble(t[2]),t[3]));
	   }
	   EnumMap <ShipmentStatus,List<Shipment>> map  = new EnumMap<ShipmentStatus,List<Shipment>>(ShipmentStatus.class);
	   for(Shipment s: list){
		  String status =  s.getStatus();
		  switch(status){
		  case "DELIVERED":
		  map.put(ShipmentStatus.DELIVERED,list);
		  break;
		  case "TRANSIT":
			  map.put(ShipmentStatus.TRANSIT,list);
			  break;
		  case "PENDING":
			  map.put(ShipmentStatus.PENDING,list);
			  break;
		  }
	   }
	   	System.out.println("Display\n1.Delivered Shipments\n2.Pending Shipments\n3.Transit Shipments");
	   String selection = br.readLine();
	   switch(selection){
	   case "1":
			  System.out.println(map.get(ShipmentStatus.DELIVERED.name()));
			  break;
	   case "2":
		   System.out.println(map.get(ShipmentStatus.TRANSIT));
		   break;
	   case "3":
		   System.out.println(map.get(ShipmentStatus.PENDING));
		   break;  
	   }
	   }
}
