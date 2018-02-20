package threadAgain;


import java.util.Collection;
import java.util.Iterator;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.TimeUnit;

public class ChequeProcessingThread implements Runnable
 {
	
    ArrayBlockingQueue<String> queue = new ArrayBlockingQueue<String>(10);

    public void run()  {
        try {
			String temp = queue.take();
			String[] s = temp.split(",");
			System.out.println("Cheque processing completed for payment id "+s[0]);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
        queue.poll();
        
    }
    
    public void addCheque(String val) {
    	queue.add(val);
    }
}

