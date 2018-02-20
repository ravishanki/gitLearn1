package threadAgain;

import java.util.*;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
public class ItemCount extends Thread
{
	String itemName;
	List<String> itemList;
	Integer count;
	
	public ItemCount(String itemName,List<String> itemList){
		this.itemName = itemName;
		this.count = 0;
		this.itemList=itemList;
	}
	
	public void run(){

		for(String item:itemList){
			if(itemName.equalsIgnoreCase(item)){
				count+=1;
			}
		}



	}
	
	public static void main(String[] args) throws IOException, InterruptedException{

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter the number of purchases");
		Integer n =  Integer.parseInt(br.readLine());
		List<String> itemList = new ArrayList<String>();
		String item,searchItem;
		System.out.println("Enter the items purchased");
		for(int i=0;i<n;i++){
			item = br.readLine();
			itemList.add(item);
		}
		System.out.println("Number of items to search");
		n =  Integer.parseInt(br.readLine());
		List<ItemCount> threadList = new ArrayList<ItemCount>();
		for(int i=0;i<n;i++){
			searchItem = br.readLine();
			threadList.add(new ItemCount(searchItem, itemList));
		}


		System.out.format("%-15s %-15s\n","Item Name","Count");
		for(ItemCount i:threadList){
			Thread t = new Thread(i);
			t.start();
			t.join();
			System.out.format("%-15s %-15s\n",i.itemName,i.count);
		}
		

	}

}
