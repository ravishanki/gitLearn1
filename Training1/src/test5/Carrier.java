package test5;

import java.io.*;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Carrier extends ShipmentEntity {

private String carrierCode;
private String iata;

public Carrier(String shipmentEntityName, String identificationNumber,String carrierCode,String iata) {
	super(shipmentEntityName, identificationNumber);
	this.carrierCode= carrierCode;
	this.iata = iata;
}
 
   public void setCarrierCode(String carrierCode){
   this.carrierCode = carrierCode;
  }
  public String getCarrierCode(){
   return carrierCode;
  }
  
 
  public void setIata(String iata){
   this.iata = iata;
  }
  public String getIata(){
   return iata;
  }
  @Override
  void display(){
 	 System.out.format("%-15s %-25s %-15s %-15s\n",shipmentEntityName,
 			 identificationNumber,carrierCode,iata);
  }
	
      
      public static void main(String args[]) throws IOException, ParseException{
    	  
    	  BufferedReader buf = new BufferedReader(new InputStreamReader(System.in));
    		System.out.println("Enter the number of shipment entity");
    		int n = Integer.parseInt(buf.readLine());
    		String temp;
    		String[] t;
    		Customer[] cus = new Customer[n];
    		Company [] com = new Company[n];
    		Agent [] age = new Agent[n];
    		Carrier [] car = new Carrier[n];
    		for(int i=0;i<n;i++){
    			System.out.println("Enter the invoice "+ (i+1) +" details :");
    			System.out.println("Select the shipment entity type");
          		System.out.println("1)Customer");
          		System.out.println("2)Company");
          		System.out.println("3)Agent");
          		System.out.println("4)Carrier");
    			int type = Integer.parseInt(buf.readLine());
    			switch (type){
    			case 1:
    				temp = buf.readLine();
            		 t = temp.split(",");
            		int id = Integer.parseInt(t[2]);
            		cus[i] = new Customer(t[0],t[1],id,t[3]);
            		break;
    			case 2:
    				 temp = buf.readLine();
            		t = temp.split(",");
            		com[i] = new Company(t[0],t[1],t[2],t[3],t[4]);
            		break;
    			case 3:
   				 temp = buf.readLine();
           		t = temp.split(",");
           		age[i] = new Agent(t[0],t[1],t[2],t[3],t[4]);
           		break;
    			case 4:
      				 temp = buf.readLine();
              		t = temp.split(",");
              		car[i] = new Carrier(t[0],t[1],t[2],t[3]);
              		break;
    			}
 
    		}
    		
    		System.out.println("Shipment details are");
    		System.out.println("Enter the shipment entity type to display");
    		String enType = buf.readLine();
    		switch (enType){
    		case "Customer":
    			System.out.format("%-15s %-25s %-15s %-15s\n","Name","Identification Number","Customer Id","Customer Name");
    			for(int i=0;i<n;i++){
    				if(cus[i] !=null){
    					cus[i].display();
    				}
    			}
    			break;
    		case "Company":
    			System.out.format("%-15s %-25s %-15s %-15s %-15s\n","Name","Identification Number","Company Name","IATA","FMC");
    			for(int i=0;i<n;i++){
    				if(com[i] !=null){
    					com[i].display();
    				}
    			}
    			break;
    		case "Agent":
    			System.out.format("%-15s %-25s %-15s %-15s %-15s\n","Name","Identification Number ","Agent Name","IATA","FMC");
    			for(int i=0;i<n;i++){
    				if(age[i] !=null){
    					age[i].display();
    				}
    			}
    			break;
    		case "Carrier":
    			System.out.format("%-15s %-25s %-15s %-15s\n","Name","Identification Number","Code Name","IATA");
    			for(int i=0;i<n;i++){
    				if(car[i] !=null){
    					car[i].display();
    				}
    			}
    			break;
    		}
      }
      	

  
}
