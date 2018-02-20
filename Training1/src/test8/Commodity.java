package test8;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
	
import java.util.*;

public class Commodity {


private String commodityName;
private String quantity;
private String totalvalue;
private String totalWeight;
private String hazardous;

Commodity(){}


Commodity(String commodityName,String quantity,String totalvalue,String totalWeight,String hazardous){
super();
this.commodityName=commodityName;
this.quantity=quantity;
this.totalvalue=totalvalue;
this.totalWeight=totalWeight;
this.hazardous=hazardous;
}

public String getCommodityName() {
    	return commodityName;
	}

	public void setCommodityName(String commodityName) {
		this.commodityName = commodityName;
	}


public String getQuantity() {
		return quantity;
	}

	public void setQuantity(String quantity) {
		this.quantity = quantity;
	}

public String getTotalvalue() {
		return totalvalue;
	}

	public void setTotalvalue(String totalvalue) {
		this.totalvalue = totalvalue;
	}

public String getTotalWeight() {
		return totalWeight;
	}

	public void setTotalWeight(String totalWeight) {
		this.totalWeight = totalWeight;
	}
public String getHazardous() {
		return hazardous;
	}

	public void setHazardous(String hazardous) {
		this.hazardous = hazardous;
	}

public String toString(){
			if(this.hazardous.equals("False")){
				this.hazardous = "No";
			}
			else{
				this.hazardous = "Yes";
			}
	     return String.format("%-15s%-15s%-15s%-15s%s", this.commodityName,this.quantity,
	    		 this.totalvalue,this.totalWeight,this.hazardous);
	   }

public static void main(String args[])throws IOException {
	   BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
	   List<Commodity> list = new ArrayList<Commodity>(); 
	   System.out.println("Enter the number of commodities:");
	   Integer number = Integer.parseInt(br.readLine());
	   System.out.println("Enter the commodity details");
	   for(int i=0;i<number;i++){
		   String order = br.readLine();
		   String[] t = order.split(",");
		   list.add(new Commodity(t[0],t[1],t[2],t[3],t[4]));
	   }
	   System.out.println("Commodity details are:");
	   System.out.format("%-15s%-15s%-15s%-15s%s\n", "Commodity Name","Quantity","Total Value","TotalWeight","Hazardous");
	   		for(Commodity c:list){
	   			System.out.println(c.toString());
	   }
	}

}
