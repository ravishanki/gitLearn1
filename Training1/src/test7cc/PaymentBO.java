package test7cc;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class PaymentBO {
	
	public boolean processPayment(Cheque cheque) throws InvalidDateException, ParseException{
		SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");
		String currentDate = "15/05/2017";
		Calendar cal = new GregorianCalendar();		
		Date today = formatter.parse(currentDate);
		cal.setTime(today);
		cal.add(Calendar.DAY_OF_MONTH, -3);
		Date  prev = cal.getTime();
		Date check = cheque.getChequeDate();
		
		if(check.after(prev)){
			return true;
		}
		else{
			throw new InvalidDateException("Cheque is valid only for three months");
		}
		
	}
	 public static void main(String args[])throws IOException, ParseException {
		   BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		   SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");
		   System.out.println("Enter the cheque details");
		   System.out.println("Enter the bank name :");
		   String bankName = br.readLine();
		   System.out.println("Enter the cheque number :");
		   String checkNum = br.readLine();
		   System.out.println("Enter the cheque date :");
		   Date checkdate = formatter.parse(br.readLine());
		   Cheque cheque = new Cheque(bankName,checkNum,checkdate);
		   PaymentBO bo = new PaymentBO();
		   try{
		   bo.processPayment(cheque);
		   System.out.println("Cheque is sent to clearing house");
		   }
		   catch(InvalidDateException e){
			   System.out.println(e.toString());
			   
		   }
	 }
	 
}
