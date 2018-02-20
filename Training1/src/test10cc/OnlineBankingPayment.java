package test10cc;


public class OnlineBankingPayment implements Runnable
{

    Long invoiceNumber;
    String accountNumber;
    Double amount;
    
    public OnlineBankingPayment(Long invoiceNumber,String accountNumber,Double amount) {
        this.invoiceNumber = invoiceNumber;
        this.accountNumber = accountNumber;
        this.amount = amount;
    }
    
    public void run() {
    	try {
			Thread.sleep(200);
		} catch (InterruptedException e) {
			
			e.printStackTrace();
		}
    	String acNum = this.accountNumber;
    	if(acNum.contains("555")){
    		System.out.println("Oops! Payment processing failed using Online banking "+ this.accountNumber);
    	}
    	else{
    		System.out.println("Payment processing completed using the Online banking");
    	}

        
    }
    
}