package test10cc;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

import test10.Cargo;
import test10.ShippingCostThread;

public class Main {

    public static void main(String args[]) throws IOException, InterruptedException {
        
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Enter the number of records:");
        int noOfRecords = Integer.parseInt(reader.readLine());
        List<String> inputs = new ArrayList<String>();
        System.out.println("Enter all the records:");
        for(int i=0;i<noOfRecords;i++) {
            inputs.add(reader.readLine());
            
        }
        int length = inputs.size();
        int halfSize  = length/2;
        List<String> firstHalf = inputs.subList(0,halfSize);
        List<String> secondhalf = inputs.subList(halfSize,length);
        TrackContainer tc1  = new TrackContainer(firstHalf, 1 );
        TrackContainer tc2  = new TrackContainer(secondhalf,2);
        Thread t1 = new Thread(tc1); 
        t1.setName("Thread 1");
        t1.start();
        Thread t2 = new Thread(tc2); 
        t2.setName("Thread 2");
        t2.start();
        while(t2.isAlive()){
        	Thread.sleep(2000);
        }
    }
    
}
