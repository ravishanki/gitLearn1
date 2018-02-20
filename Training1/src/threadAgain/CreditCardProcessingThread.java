package threadAgain;

import java.util.concurrent.ArrayBlockingQueue;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class CreditCardProcessingThread implements Runnable 
{
	ArrayBlockingQueue<String> queue = new ArrayBlockingQueue<String>(10);

    public void run() {
        
    	try {
			String temp = queue.take();
			String[] s = temp.split(",");
			System.out.println("Credit card processing completed for payment id "+s[0]);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
        
    }
    
    public void addCreditCard(String val) {
        queue.add(val);
    }
    
    
    
 public static void main(String args[]) throws IOException, InterruptedException {
        
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        
        System.out.println("Enter number of payment:");
        int numberOfPayments = Integer.parseInt(reader.readLine());
        
        System.out.println("Enter all the payment details");
        	
        	
        
        for(int i=0;i<numberOfPayments;i++) {
            String temp = reader.readLine();
            String[] s  = temp.split(",");
            if(s[2].equals("CC")){
            	CreditCardProcessingThread crt = new CreditCardProcessingThread();
            	Thread t = new Thread(crt);
            	crt.addCreditCard(temp);
            	t.start();
            }
            else{
            	ChequeProcessingThread cpt = new ChequeProcessingThread();
            	Thread t = new Thread(cpt);
                 	cpt.addCheque(temp);
                 	t.start();
                 	
            }
            
        }

       
        
	// fill in your code here
    }
    
}

