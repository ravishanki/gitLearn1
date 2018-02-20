package test5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader buf = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter the number of carriers :");
		int n = Integer.parseInt(buf.readLine());
		WaterCarrier[] waterCarrier = new WaterCarrier[n];
		for(int i=0;i<n;i++){
			System.out.println("Enter the carrier "+ (i+1) +" details :");
			String temp = buf.readLine();
			String[] t = temp.split(",");
			waterCarrier[i] = WaterCarrier.createShip(t[0],t[1],t[2],t[3],t[4],Integer.parseInt(t[5]));

		}
		System.out.println("Ship details are");
		System.out.format( "%-20s%-15s%-15s%-15s%-15s%-25s%s\n","Carrier type","Name","Code","IATAcode","Location","Capacity","OwnedBy") ;
		for(int i=0;i<n;i++){
			String type = waterCarrier[i].getCarrierType();
			waterCarrier[i].displayShipDetails();
		/*	switch(type){
			case "BulkShip":
				waterCarrier[i].displayShipDetails();
				break;
			case "ContainerShip":
				waterCarrier[i].displayShipDetails();
				break;
			case "Ferry":
				waterCarrier[i].displayShipDetails();
				break;
			}*/
		}
	}
}
