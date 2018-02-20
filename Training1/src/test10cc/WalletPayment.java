package test10cc;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class WalletPayment implements Runnable
{

    Long invoiceNumber;
    String mobileNumber;
    Double amount;
    
    public WalletPayment(Long invoiceNumber,String mobileNumber,Double amount) {
        this.invoiceNumber = invoiceNumber;
        this.mobileNumber = mobileNumber;
        this.amount = amount;
    }
    
    public void run() {
    	String acNum = this.mobileNumber;
    	if(acNum.contains("555")){
    		System.out.println("Oops! Payment processing failed using Mobile number "+ this.mobileNumber);
    	}
    	else{
    		System.out.println("Payment processing completed using the Mobile number");
    	}
        
    }
    
  
        public static void main(String args[]) throws IOException, InterruptedException {
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

          /*  System.out.println("Enter the number of payments:");
            int numberOfPayments = Integer.parseInt(reader.readLine());
            
            System.out.println("Enter the payment details (Invoice ID, ACC Number, Payment Amount, Payment Type)");
            List<String> input = new ArrayList<String>();
            for(int i=0;i<numberOfPayments;i++) {
                input.add(reader.readLine());
            }        
            for(String i: input){
            	String[] t = i.split(",");
            	String type = t[3];
            	switch (type){
            	case "OLB":
            		Runnable obp =new OnlineBankingPayment(Long.parseLong(t[0]),t[1],Double.parseDouble(t[2]));
            		Thread t1 = new Thread(obp);
            		t1.start();
            		break;
            	case "WA":
            		Runnable wp =new WalletPayment(Long.parseLong(t[0]),t[1],Double.parseDouble(t[2]));
            		Thread t2 = new Thread(wp);
            		t2.start();
            		break;
            	case "CC":
            		CreditCardPayment ccp =new CreditCardPayment(Long.parseLong(t[0]),t[1],Double.parseDouble(t[2]));
            		Thread t3 = new Thread(ccp);
            		t3.start();
            		break;
            	}
            }*/

            List<Integer> testList = new ArrayList<>();
            for (int i = 1; i < 50; i += 2)
                testList.add(i);

        }
    
}
