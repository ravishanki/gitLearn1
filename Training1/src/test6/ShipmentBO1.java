package test6;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ShipmentBO1 {
	public void validate(Container container, Commodity[] commodity) throws ContainerOverloadedException{
			Float weight = 0f;
				for (int i=0;i<commodity.length;i++){
					weight = weight+commodity[i].getTotalWeight();
				}
				if(container.getContainerWeight()<weight){
					throw new ContainerOverloadedException("Container is overloaded");
				}
	}
				
	
	public static void main(String args[])throws IOException {
		   BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		   
		   System.out.println("Enter the container number :");
		   String number = br.readLine();
		   System.out.println("Enter the capacity of container :");
		   Float capacity = Float.parseFloat(br.readLine());
		   System.out.println("Enter the number of commodities :");
		   Integer count = Integer.parseInt(br.readLine());
		   Commodity [] commodity = new Commodity[count];
		   System.out.println("Enter the commodities :");
		   for(int i=0;i<count;i++){
			   String temp = br.readLine();
			   String[] t = temp.split(",");
			   commodity[i] = new Commodity(t[0],Float.parseFloat(t[1]),Integer.parseInt(t[2]));
		   }
		   Container container = new Container(number,capacity,commodity);
		   ShipmentBO1 sb = new ShipmentBO1();
		   try{
		   sb.validate(container, commodity);
		   System.out.println("Commodity details are");
		   System.out.format("%-15s%-15s%s\n", "Id","Weight","Quantity");
		   container.disaplyDetails();
		   }
		   catch(ContainerOverloadedException e){
		   System.out.println("ContainerOverloadException: "+e.getMessage());
		   }
	}
}
