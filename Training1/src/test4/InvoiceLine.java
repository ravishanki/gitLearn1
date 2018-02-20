package test4;

public class InvoiceLine {
	
	Item item;  
	Integer quantity;  
	Double amount;
	
	InvoiceLine(Item item,Integer quantity,Double amount){
		this.item = item;
		this.quantity = quantity;
		this.amount = amount;
	}

}
