package test8cc;

import java.util.List;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.HashMap;

public class PaymentBO {
//("SUCCESS","FAILED","WITHHELD")
	private HashMap<String,Double> hashMap;
	private  List<Payment> paymentList;
	public HashMap<String, Double> getHashMap() {
		return hashMap;
	}

	public void setHashMap(HashMap<String, Double> hashMap) {
		this.hashMap = hashMap;
	}

	public List<Payment> getPaymentList() {
		return paymentList;
	}

	public void setPaymentList(List<Payment> paymentList) {
		this.paymentList = paymentList;
	}

	public PaymentBO() {
		this.hashMap = new HashMap<String,Double>(){{
		put("SUCCESS",0d);
		put("FAILED",0d);
		put("WITHHELD",0d);}};
	}
	
	public void calculateTransactionStatusAmount(){
		double sucesstotal =0d;
		double failedtotal = 0d;
		double wheldtotal  =0d;
		for(Payment p:paymentList){
			String status = p.getStatus();
			switch(status){
			case "SUCCESS":
				sucesstotal = sucesstotal+p.getAmount();
				break;
			case "FAILED":
				failedtotal = sucesstotal+p.getAmount();
				break;
			case "WITHHELD":
				wheldtotal = sucesstotal+p.getAmount();
				break;
			}
		}
		hashMap.put("SUCCESS",sucesstotal);
		hashMap.put("FAILED",failedtotal);
		hashMap.put("WITHHELD",wheldtotal);
		System.out.println("SUCCESS "+ hashMap.get("SUCCESS"));
		System.out.println("FAILED "+ hashMap.get("FAILED"));
		System.out.println("WITHHELD "+ hashMap.get("WITHHELD"));
	}
	
	public static void main(String args[])throws IOException, NumberFormatException, ParseException {
		 BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		 SimpleDateFormat formatter = new SimpleDateFormat("DD/MM/YYYY");
		   List<Payment> list = new ArrayList<Payment>(); 
		   System.out.println("Enter the number of payments");
		   System.out.println("Enter all the payments:( Id, Amount,Date (MM/dd/YYYY),mode(CHEQ / CC / OLB ),Status ( SUCCESS / FAILED / WITHHELD ) )");
		   Integer number = Integer.parseInt(br.readLine());
		   for(int i=0;i<number;i++){
			   String order = br.readLine();
			   String[] t = order.split(",");
			   list.add(new Payment(Long.parseLong(t[0]),
					   Double.parseDouble(t[1]),
					   formatter.parse(t[2]),t[3],t[4]));
		   }
		   PaymentBO paymentBO = new PaymentBO();
		   paymentBO.setPaymentList(list);
		   paymentBO.calculateTransactionStatusAmount();
	}
}
