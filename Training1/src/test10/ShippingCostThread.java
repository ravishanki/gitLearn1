package test10;




import java.util.ArrayList;

import java.util.List;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class ShippingCostThread extends Thread
{
	
	private List<Cargo> cargoList;
	private List<Double> priceList;
	public ShippingCostThread(){

	}
	
	public ShippingCostThread(List<Cargo> cargoList){
		this.cargoList = cargoList;
	}
    
    public void run() {
        Double price =0d;
        priceList = new ArrayList<Double>();
      for(Cargo c:this.cargoList){
    	  if(c.getStorageType().equals(Cargo.COLD_STORAGE)){
    		  price = 1.85*c.getWeight();
    	  }
    	  else{
    		  price = 0.90*c.getWeight();
    	  }
    	  this.priceList.add(price);
      }
        
    }

    public List<Cargo> getCargoList() {
        return cargoList;
    }

    public void setCargoList(List<Cargo> cargoList) {
        this.cargoList = cargoList;
    }


    public List<Double> getPriceList() {
        return priceList;
    }

    public void setPriceList(List<Double> priceList) {
        this.priceList = priceList;
    }
    
public static void main(String args[]) throws IOException, InterruptedException {
        
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter the number of Cargo:");
        int numberOfCargo = Integer.parseInt(reader.readLine());
        
        System.out.println("Enter cargo details (id,length,width,weight,cargo type,storage type):");
        List<Cargo> cargoList = new ArrayList<Cargo>();
        for(int i=0;i<numberOfCargo;i++) {
            cargoList.add(new Cargo(reader.readLine()));
        }
        int length = cargoList.size();
        int halfSize  = length/2;
        List<Cargo> firstHalf = cargoList.subList(0,halfSize);
        List<Cargo> secondhalf = cargoList.subList(halfSize,length);
        ShippingCostThread sct1  = new ShippingCostThread(firstHalf );
        ShippingCostThread sct2  = new ShippingCostThread(secondhalf);
        Thread t1 = new Thread(sct1); 
        t1.start();
        Thread t2 = new Thread(sct2); 
        t2.start();
        while(t2.isAlive()){
        	Thread.sleep(2000);
        }
        displayPrice(sct1.getPriceList());
        displayPrice(sct2.getPriceList());
        
    }
 	
    public static  void displayPrice(List<Double> list) {
        for (Double d:list){
        	System.out.println(d.toString());
        }
    }
    
}

