package test10cc;

public class CreditCardPayment extends Thread{
    
    private Long invoiceNumber;
    private String cardNumber;
    private Double amount;
    
    public CreditCardPayment(Long invoiceNumber,String cardNumber,Double amount) {
        this.invoiceNumber = invoiceNumber;
        this.amount = amount;
        this.cardNumber = cardNumber;
    }
    
    public Long getInvoiceNumber() {
		return invoiceNumber;
	}

	public void setInvoiceNumber(Long invoiceNumber) {
		this.invoiceNumber = invoiceNumber;
	}

	public String getCardNumber() {
		return cardNumber;
	}

	public void setCardNumber(String cardNumber) {
		this.cardNumber = cardNumber;
	}

	public Double getAmount() {
		return amount;
	}

	public void setAmount(Double amount) {
		this.amount = amount;
	}

	public void run() {
		String acNum = this.cardNumber;
    	if(acNum.contains("555")){
    		System.out.println("Oops! Payment processing failed using credit card number "+ this.cardNumber);
    	}
    	else{
    		System.out.println("Payment processing completed using the credit card number");
    	}
        
        
    }
}

