package test9cc;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import test8.Port;

public class Item {
	
	private Long id;
	private String internalNumber;;
	private int deleted;
	private Long currencyId;
	private Double price;
	public Item(Long id, String internalNumber, int deleted, Long currencyId, Double price) {
		super();
		this.id = id;
		this.internalNumber = internalNumber;
		this.deleted = deleted;
		this.currencyId = currencyId;
		this.price = price;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getInternalNumber() {
		return internalNumber;
	}
	public void setInternalNumber(String internalNumber) {
		this.internalNumber = internalNumber;
	}
	public int getDeleted() {
		return deleted;
	}
	public void setDeleted(int deleted) {
		this.deleted = deleted;
	}
	public Long getCurrencyId() {
		return currencyId;
	}
	public void setCurrencyId(Long currencyId) {
		this.currencyId = currencyId;
	}
	public Double getPrice() {
		return price;
	}
	public void setPrice(Double price) {
		this.price = price;
	}
	public static void main(String args[])throws IOException {
		   List<Item> list = new ArrayList<Item>(); 
		   File file = new File("src/input.txt");
		   String line1;
		   BufferedReader br = new BufferedReader(new FileReader(file));
		   while ((line1 = br.readLine()) != null){
			   String[] s = line1.split(" ");
			   Long id = Long.parseLong(s[1]);
			   String interNum = s[2];
			   int deleted = Integer.parseInt(s[3]);
			   Long curid = Long.parseLong(s[4]);
			   Double price  = Double.parseDouble(s[5]);
			   list.add(new Item(id,interNum,deleted,curid,price));			   
		   }
		   Integer actCount=0,delCount=0;
		   for(Item i:list){
			   Integer deleted = i.getDeleted();
			   if(deleted.toString().equals("0")){
				   actCount = actCount+1;
			   }
			   else{
				   delCount =delCount+1;
			   } 
		   }
		   System.out.println("Number of active items : "+ actCount);
		   System.out.println("Number of deleted items : "+ delCount);
	}

}
