package test8cc;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class ShipmentBO {
	
	public List<Commodity> readCommodity(String fileName) throws NumberFormatException, IOException {
		List<Commodity> list = new ArrayList();
		 File file = new File("src/input.txt");
	        BufferedReader br = new BufferedReader(new FileReader(file));
	        String line1;
	        Boolean flag =false;
         while ((line1 = br.readLine()) != null){
         	String[] s = line1.split(",");
         	if(s[3].equals("1")){
         		flag = true;
         	}
         	list.add(new Commodity(Long.parseLong(s[0]),Double.parseDouble(s[1]),
         			Integer.parseInt(s[2]),flag,Long.parseLong(s[4])));
         }
                  
         return list;
	}	
	public void checkCommodity(List<Commodity> commodityList){
		Boolean flag = false;
		double totalWeight = 0d;
		Integer totalQty = 0;
		for(Commodity c:commodityList){
			totalWeight = totalWeight+c.getWeight();
			totalQty = totalQty+c.getQuantity();
			if (!flag){
			if(c.getHazardous()){
				flag = true;
			}
			}
		}
		System.out.println("Total Weight: "+totalWeight);
		System.out.println("Total Quantity: "+totalQty);
		if(flag){
			System.out.println("Hazardous Commodity Found!");
		}
		
	}
	 public static void main(String args[])throws IOException {
		 ShipmentBO Bo = new ShipmentBO();
		 List<Commodity> list= Bo.readCommodity("input.txt");
		 Bo.checkCommodity(list);
	 }

}
