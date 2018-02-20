package test4cc;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.DecimalFormat;
import java.util.Scanner;
public class InvoiceBo {
	
	public void displayUserDetailsByStatus(String status,Invoice[] invoiceArray) {
		for(int i=0;i<invoiceArray.length;i++){
			if(status.equals(invoiceArray[i].getStatus())){
				System.out.format(invoiceArray[i].getCustomer().toString());
			}
		}
}
public double getTotalInvoiceValue(String userName,Invoice[] invoiceArray) {
		Double total = (double) 0  ;
		for(int i=0;i<invoiceArray.length;i++){
			if(userName.equals(invoiceArray[i].getCreatedBy())){
				total =total+ invoiceArray[i].getTotal();
			}
		}
		return total;
}		

public static void main(String[] args) throws NumberFormatException, IOException {
	BufferedReader buf = new BufferedReader(new InputStreamReader(System.in));
	System.out.println("Enter the number of invoices :");
	int n = Integer.parseInt(buf.readLine());
	Invoice[] invoice = new Invoice[n];
	User[] user = new User[n]; 
	InvoiceBo  iBo = new InvoiceBo();
	Scanner reader = new Scanner(System.in);
	for(int i=0;i<n;i++){
		System.out.println("Enter the invoice "+ (i+1) +" details :");
		String temp = reader.nextLine();
		String[] t1 = temp.split(",");
		String name  = t1[0];
		String state = t1[1];
		String country = t1[2];
		Double total = Double.parseDouble(t1[3]);
		String status =t1[4];
		String createdBy =t1[5];
		user[i] = new User(name,state,country);
		invoice[i] = new Invoice(user[i],total,status,createdBy);
	}
	System.out.println("Customer details with status cleared Invoices :");
	System.out.format("%-15s %-15s %-15s\n","Name","State","Country");
	iBo.displayUserDetailsByStatus("Cleared",invoice);
	System.out.println("Enter the Invoice creator name :");
	String creatorName = reader.nextLine();
	Double overAll = iBo.getTotalInvoiceValue(creatorName, invoice);
	DecimalFormat df = new DecimalFormat("#.00");
	if (overAll>0){
		System.out.println("The total invoice value :\n"+df.format(overAll).toString());
	}
		else{
			System.out.println("The total invoice value :");
			System.out.println("No invoice available");
		}
	}
	
}
