package test2;

import java.util.Scanner;
public class test2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner reader = new Scanner(System.in);
		System.out.println("Enter the name of the city :");
		String city = reader.nextLine();
		
		if ((city.equals("Coimbatore")) || (city.equals("Varanasi")))
			System.out.println("Tax free");
		else
			System.out.println("Taxable");
		
	}
	
	public void exe5(){
		int profit;
		int temp;
		Scanner reader = new Scanner(System.in);
		System.out.println("Enter the number of months :");
		int months = reader.nextInt();
		if (months> 0) {
			System.out.println("Enter the profit of each month in shipment");
			 temp =0;
			for (int i=0;i<months;i++){
				profit = reader.nextInt();
				temp = temp + profit; 
			}
			System.out.println("Total profit :"+temp);
		}
		else {
			System.out.println("Invalid Input");
		}
	}
	public void exe3(){
		Scanner reader = new Scanner(System.in);
		System.out.println("Enter the number of months :");
		String Code = reader.nextLine();
		Integer times = Integer.parseInt(Code);
		System.out.println("Enter the total number of shipment per month :");
		Code = reader.nextLine();
		Integer shipments = Integer.parseInt(Code);
		int Countries =0;
		if ((Countries>150) && (shipments>1500))
			System.out.println("The company grade is : A");
		else if ((Countries> 125 && Countries<=150) && shipments>1200 )
			System.out.println("The company grade is : B");
		else if((Countries> 100 && Countries<=125) && shipments>1000)
			System.out.println("The company grade is : C");
		else if((Countries> 75 && Countries<=100) && shipments>700)
			System.out.println("The company grade is : D");
		else if((Countries> 0 && Countries<=75) && (shipments>0 && shipments<=700))
			System.out.println("The company grade is : E");
		else if((Countries<0) || (shipments<0))
			System.out.println("Invalid Input");
	}
	
	public void exe2(){
		
		System.out.println("Enter the shipment code :");
		Scanner reader = new Scanner(System.in);
		String Code = reader.nextLine();
		char ch1 = Code.charAt(0);
		char ch2 = Code.charAt(1);
		char ch3 = Code.charAt(2);
		if((ch1=='1')&& (ch2=='0') && (ch3=='0'))
			System.out.println("Airway");
		else if((ch1=='0')&& (ch2=='1') && (ch3=='0'))
			System.out.println("Waterway");
		else if((ch1=='0')&& (ch2=='0') && (ch3=='1'))
			System.out.println("Roadway");
		else if((ch1=='1')&& (ch2=='1') && (ch3=='0'))
			System.out.println("Airway and Waterway");
		else if((ch1=='0')&& (ch2=='1') && (ch3=='1'))
			System.out.println("Waterway and Roadway");
		else if((ch1=='1')&& (ch2=='0') && (ch3=='1'))
			System.out.println("Airway and Roadway");
		else if((ch1=='1')&& (ch2=='1') && (ch3=='1'))
			System.out.println("All ways");
	}
	public void exe1(){
		Scanner reader = new Scanner(System.in);
		System.out.println("Enter the number of shipments per month :");
		int num = reader.nextInt();
		if(num>0 && num<=20){
			System.out.println("Not a valuable customer");
		}
		else if(num>20){
			System.out.println("Valuable customer");
		}
		else{
			System.out.println("Invalid Input");
		}
	}
}
