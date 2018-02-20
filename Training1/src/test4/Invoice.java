package test4;

import java.util.Date;

public class Invoice {
	Integer id;
	String raisedBy;
	String customerName;
	Date startDate;
	Date dueDate;
	InvoiceLine invoiceLine[];
	
	Invoice(Integer id,String raisedBy,String customerName,Date startDate,Date dueDate
			,InvoiceLine invoiceLine[])
	{
		this.id = id;
		this.raisedBy = raisedBy;
		this.customerName = customerName;
		this.startDate = startDate;
		this.dueDate =dueDate;
		this.invoiceLine = invoiceLine;
	}

}
