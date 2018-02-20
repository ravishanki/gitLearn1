package threadAgain;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;
import java.text.SimpleDateFormat;
import java.util.Iterator;
import java.util.List;

public class ExportShipmentThread extends Thread
{

	private List<Shipment> shipmentList;
	private StringBuilder shipmentDetails;

    public ExportShipmentThread(List<Shipment> shipmentList) {
        this.shipmentList = shipmentList;
    }
    
    public void run() {
        
           Iterator<Shipment> itr = shipmentList.iterator();
           SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
            while(itr.hasNext()){
            	 Shipment s = itr.next();
            	 String temp  = s.getId()+"|"+s.getName()+"|"+s.getBookingNumber()+"|"+
            	 s.getExecutedPlace()+"|"+sdf.format(s.getExecutedDate())+"|"+sdf.format(s.getDepartureDate())+"|"+
            			 s.getArrivalDate()+"|"+s.getTotalWeight()+"|"+s.getShipmentStatus()
            			 +"|"+s.getCarrierId();
            	 shipmentDetails = new StringBuilder();
            	 shipmentDetails.append(temp);
            }
        
    }
    
    public StringBuilder getShipmentDetails() {
        return shipmentDetails;
    }
    
    
public static void main(String args[]) throws IOException, InterruptedException, ParseException {
        
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        
        List<Shipment> shipmentList = new ArrayList<Shipment>();
        shipmentList.add(new Shipment(2390900L,"Agro Ltd",88412525L,"Mumbai",sdf.parse("16/05/2017"),sdf.parse("16/05/2017"),null,7500,10,41004500));
        shipmentList.add(new Shipment(2391990L,"Tumac Commodities",88425455L,"Mumbai",sdf.parse("14/05/2017"),sdf.parse("16/05/2017"),null,7500,10,41004500));
        shipmentList.add(new Shipment(2356000L,"HAKAN AGRO",88412522L,"Mumbai",sdf.parse("12/05/2017"),sdf.parse("16/05/2017"),null,7500,10,41004500));
        shipmentList.add(new Shipment(2366785L,"BTW",88415522L,"Mumbai",sdf.parse("14/05/2017"),sdf.parse("16/05/2017"),null,7500,10,41004500));
        shipmentList.add(new Shipment(2366854L,"Bisk Farm",86555520L,"Mumbai",sdf.parse("16/05/2017"),sdf.parse("16/05/2017"),null,7500,10,41004500));
        shipmentList.add(new Shipment(2398222L,"Meat Products of India",88785545L,"Mumbai",sdf.parse("16/05/2017"),sdf.parse("16/05/2017"),null,7500,10,41004500));
        shipmentList.add(new Shipment(2389452L,"Balaji Group",88123455L,"Mumbai",sdf.parse("16/05/2017"),sdf.parse("16/05/2017"),null,7500,10,41004500));
        shipmentList.add(new Shipment(2352000L,"Agro Ltd",88412785L,"Mumbai",sdf.parse("13/05/2017"),sdf.parse("16/05/2017"),null,7500,10,41004500));
        shipmentList.add(new Shipment(2394566L,"Heritage Foods",88412563L,"Mumbai",sdf.parse("15/05/2017"),sdf.parse("16/05/2017"),null,7500,10,41004500));
        shipmentList.add(new Shipment(237800L,"ITC",88452678L,"Mumbai",sdf.parse("16/05/2017"),sdf.parse("16/05/2017"),null,7500,10,41004500));
        	
        
        System.out.println("Enter number of threads to process the data:");
        
        int numberOfThreads = Integer.parseInt(reader.readLine());
        ExportShipmentThread[] est = new ExportShipmentThread[shipmentList.size()];
        List<StringBuilder> details = null;
        ExecutorService executor = Executors.newFixedThreadPool(numberOfThreads);
        for(int i =0;i<shipmentList.size();i++){
        	 est[i] = new ExportShipmentThread(shipmentList.subList(i, i+1));
        	Thread t  = new Thread(est[i]);
        	executor.execute(t);
        	
        }
        executor.shutdown();
        while(!executor.isTerminated()){
        	//Thread.sleep(3000);
        }
        System.out.println("ShippingnDetails:");
       for(ExportShipmentThread i:est){
    	   System.out.println(i.getShipmentDetails().toString());
       }
    }
    
    public static void displayPrice(List<StringBuilder> list) {
        for(StringBuilder s: list){
        	System.out.println(s.toString());
        }
    }

}

