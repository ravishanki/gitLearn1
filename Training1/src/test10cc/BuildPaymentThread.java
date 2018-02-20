package test10cc;




import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class BuildPaymentThread extends Thread
{
    
	private List<Payment> paymentList;
	private List<String> csvInput;
    
    public BuildPaymentThread(List<String> csvInput) {
        
        this.csvInput = csvInput;
    }
    
    public void run() {
    	SimpleDateFormat formatter = new SimpleDateFormat("dd/mm/yyyy");
    	paymentList = new ArrayList<Payment>();
        for(String s:csvInput){
        	String[] t = s.split(",");
        	try {
        	if(Integer.parseInt(t[4])==1){
        		CreditCard card  = new CreditCard(t[5],formatter.parse(t[6]),t[7],Integer.parseInt(t[8]));
        		Cheque check = null;
        		
					this.paymentList.add( new Payment(Long.parseLong(t[0]),Double.parseDouble(t[1]),
							formatter.parse(t[2]),formatter.parse(t[3]),Integer.parseInt(t[4]),
							card,check,t[9]));
				} 
        	else{
        		CreditCard card = new CreditCard();
        		Cheque check = new Cheque(t[5],t[6],formatter.parse(t[7]));
        		
        		this.paymentList.add(new Payment(Long.parseLong(t[0]),Double.parseDouble(t[1]),
						formatter.parse(t[2]),formatter.parse(t[3]),Integer.parseInt(t[4]),
						card,check,t[8]));
        		
        	}
        	}
        	catch (NumberFormatException e) {
					e.printStackTrace();
				} catch (ParseException e) {
					e.printStackTrace();
				}
        	catch(NullPointerException e){
        		e.printStackTrace();
        	}
        	
        }
        
    }

    public List<Payment> getPaymentList() {
        return paymentList;
    }

    public void setPaymentList(List<Payment> paymentList) {
        this.paymentList = paymentList;
    }

    public List<String> getCsvInput() {
        return csvInput;
    }

    public void setCsvInput(List<String> csvInput) {
        this.csvInput = csvInput;
    }
    
    
 public static void main(String args[]) throws IOException, ParseException, InterruptedException {
        
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter the number of payments:");
        int numberOfPayments = Integer.parseInt(reader.readLine());
        System.out.println("Enter all the payments:");
        List<String> csvInput = new ArrayList<String>();
        for(int i=0;i<numberOfPayments;i++) {
            csvInput.add(reader.readLine());
        }
     
        List<Payment> payList = new ArrayList<Payment>();
        BuildPaymentThread bpt = null;
        System.out.println("Enter number of threads to process the data:");
        int numberOfThreads = Integer.parseInt(reader.readLine());
        Thread[] t=new Thread[numberOfThreads];
        for(int j=0;j<numberOfPayments;j++){
        for(int i=0;i<numberOfThreads;i++){
        	List<String> nwList = csvInput.subList(j, j+1);
        	t[i] = new Thread(bpt=new BuildPaymentThread(nwList));
        	t[i].start();
        	payList.addAll(bpt.getPaymentList());
        	j=j+1;
        }
        System.out.println("Check");
        }
       for(Payment p:payList){
    	   System.out.println(p.getAmount()+","+p.getStatus());
       }
        
    }
    
    
}
