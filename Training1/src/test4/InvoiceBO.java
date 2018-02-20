package test4;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;
public class InvoiceBO {
	
	public static Item findItemById(Integer itemId,Item item[]){
		int id = itemId;
		for(int j=0;j<=8;j++){
			if(item[j].id == id){
				return item[j];
			}
		}
		return null;
	}
	public static Double totalInvoiceAmount(Invoice invoice){
		Double totalInvoice =(double) 0;
		for(int j =0;j<invoice.invoiceLine.length;j++ ){
			totalInvoice  = totalInvoice+(invoice.invoiceLine[j].amount);
		}
		return totalInvoice;
	}
	
	public void nextTwoRemainders(Invoice invoice){
		Date startDate = invoice.startDate;
		SimpleDateFormat formatter = new SimpleDateFormat("dd-MM-yyyy");
		Calendar c = Calendar.getInstance();
		c.setTime(startDate);
		c.add(Calendar.DATE, 16);
		System.out.println("Due Date Remainder 1 : "+formatter.format(c.getTime()));
		c.add(Calendar.DATE, 14);
		System.out.println("Due Date Remainder 2 : "+formatter.format(c.getTime()));
	}
	public static void main(String[] args){
	Scanner reader = new Scanner(System.in);
	Item[] item = new Item[9];
	item[0] = new Item(111,"Laptop",28000.0);
	item[1] = new Item(112,"Headset",900.0 );
	item[2] = new Item(113,"Watch",3000.0);
	item[3] = new Item(114,"Fan",5000.0 );
	item[4] = new Item(211,"Keyboard",4000.0);
	item[5] = new Item(212,"Mouse",300.0);
	item[6] = new Item(311,"Mike",2000.0);
	item[7] = new Item(313,"PC",25000.0 );
	item[8] = new Item(314,"Inverter",11000.0);
	for(int j=0;j<9;j++){
	      
	       System.out.format("%-15s %-15s %-15s\n",item[j].id.toString(),
	    		   item[j].name,item[j].price.toString());   
	    }
	Integer id;
	String raisedBy;
	String customerName;
	Date startDate = null;
	Date dueDate = null;
	System.out.println("Enter invoice details");
	String temp = reader.nextLine();
	String[] t1 = temp.split(",");
	id = Integer.valueOf(t1[0]);
	raisedBy = t1[1];
	customerName = t1[2];
	try {
		startDate =new SimpleDateFormat("dd-MM-yyyy").parse(t1[3]);
		dueDate =new SimpleDateFormat("dd-MM-yyyy").parse(t1[4]);
	} catch (ParseException e) {
		e.printStackTrace();
	}
	
	int itemID, quantity;
	double totalLine;
	System.out.println("Enter number of invoice line");
	temp = reader.nextLine();
	int numL = Integer.parseInt(temp);
	InvoiceLine[] iL = new InvoiceLine[numL]; 
		for(int j =0;j<numL;j++){
			System.out.println("Enter the invoice line "+(j+1)+" details");
			temp =  reader.nextLine();
			t1 = temp.split(",");
			itemID = Integer.parseInt(t1[0]);
			quantity = Integer.parseInt(t1[1]);
			item[j] = findItemById(itemID,item);
			totalLine = quantity*item[j].price;
			iL[j] = new InvoiceLine(item[j],quantity,totalLine);
		}
	
		Invoice inv = new Invoice(id,raisedBy,customerName,startDate,dueDate,iL);
		InvoiceBO iB = new InvoiceBO();
		System.out.format("%-15s %-15s  %-15s %-15s %-15s\n","Invoice Id","Item Name","Quantity","Price","Total Amount");
		for(int j =0;j<numL;j++){
			item[j] =InvoiceBO.findItemById(iL[j].item.id,item);
			System.out.format("%-15s %-15s  %-15s %-15s %-15s\n",inv.id.toString()
					,item[j].name.toString(),
					iL[j].quantity.toString(),
					item[j].price,
					(iL[j].quantity*item[j].price));
		}
			System.out.println("Total Amount "+ InvoiceBO.totalInvoiceAmount(inv) );
			
			iB.nextTwoRemainders(inv);
		
	}
	 
	
}
