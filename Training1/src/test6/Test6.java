package test6;

import java.util.Scanner;

public class Test6 {
	public static void main(String[] args) {
		Scanner reader = new Scanner (System.in);
		System.out.println("Enter the total number of items");
		Integer no  = Integer.parseInt(reader.nextLine());
		Integer[] item = new Integer[no];
		Integer temp = 0;
		for(int i=0;i<no;i++){
			System.out.println("Enter the shipping price of the item "+(i+1)+" : ");
			try{
			item[i] = Integer.parseInt(reader.nextLine());
			}
			catch(NumberFormatException e){
				System.out.println("Exception : java.lang.NumberFormatException");
				System.out.println("Re-enter the item price :");
				item[i] = Integer.parseInt(reader.nextLine());
			}
			temp = temp+item[i];
		}
		System.out.println("Total cost of the container is "+ temp);
		
}
	public void exec1(){
		Scanner reader = new Scanner (System.in);
		System.out.println("Enter the container price :");
		Integer price  = Integer.parseInt(reader.nextLine());
		System.out.println("Enter the number of items in the container :");
		Integer no  = Integer.parseInt(reader.nextLine());
		try{
			System.out.println("The average price of the item is Rs."+(price/no));
		}
		catch(ArithmeticException e){
			System.out.println("Exception : "+e.getCause());
		}
	}
}
