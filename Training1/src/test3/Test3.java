package test3;
import java.util.ArrayList;
import java.util.Scanner;
public class Test3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner reader = new Scanner(System.in);
		int i;
		System.out.println("Enter the number of items");
		String tp = reader.nextLine();
		int count = Integer.parseInt(tp);
		int[] numbers = new int [count];
		System.out.println("Enter the item id details");
		for(i=0;i<count;i++){
			String tp1 = reader.nextLine();
			numbers[i] = Integer.parseInt(tp1);
		}
		int temp;
		for (int k = 0; k < numbers.length - 1; k++) {
       	 
            for ( int j = k + 1; j < numbers.length; j++) {
                if (numbers[k] > numbers[j]) {
                    temp = numbers[j];
                    numbers[j] = numbers[k];
                    numbers[k] = temp;
                }
            }
		}
		int numDup = 0, dupCount = 0,dupVal=0;;
		int previous = -1;
		for ( i=0; i < numbers.length; ++i) {
		    if (numbers[i] == previous) {
		        ++numDup;
		        if (numDup == 1) {
		            ++dupCount;
		            if (dupCount == 1) {
		            	dupVal = numbers[i];
		            }
		            else {
		            	dupVal =  numbers[i];
		            }   
		        }
		    }
		    else {
		        previous = numbers[i];
		        numDup = 0;
		    }
		}
		if(dupCount>0)
		System.out.println("Frequently purchased item is "+ dupVal);
		else{
			System.out.println("There is no frequently purchased item");
		}
	}

public void execc1(){
	Scanner reader = new Scanner(System.in);
	int i;
	String tp = reader.nextLine();
	int count = Integer.parseInt(tp);
	int[] numbers = new int [count];
	System.out.println("Enter port details :");
	for(i=0;i<count;i++){
		numbers[i] = reader.nextInt();
	}
	boolean flag = false;
	for(int num : numbers){
		if((num<1) || (num>1000)){
				flag = true;
				System.out.println("Invalid Input");
				break;
		}
	}
	int counter1 = 0;
	int counter2 = 0;
	int counter3 = 0;
	int counter4 = 0;
	int counter5 = 0;
	
	if (!flag){
		for(int num : numbers){
			if (num>0 && num<=25)
				counter1+=1;
			if (num>25 && num<=50)
				counter2+=1;
			if (num>50 && num<=100)
				counter3+=1;
			if (num>100 && num<=500)
				counter4+=1;
			if (num>500 && num<=1000)
				counter5+=1;
	}
	
	System.out.println("The number of items between 0 to 25 :"+counter1);
	System.out.println("The number of items between 25 to 50 :"+counter2);
	System.out.println("The number of items between 50 to 100 :"+counter3);
	System.out.println("The number of items between 100 to 500 :"+counter4);
	System.out.println("The number of items between 500 to 1000 :"+counter5);
	}
}
public void exe4(){
	Scanner reader = new Scanner(System.in);
	int i;
	System.out.println("Enter number of ports :");
	String tp = reader.nextLine();
	int count = Integer.parseInt(tp);
	String[] portDetails = new String[count];
	String[] oneMode  = new String[count];
	String[] multiMode  = new String[count];
	System.out.println("Enter port details :");
	for(i=0;i<count;i++){
		portDetails[i] = reader.nextLine();
	}
	int iterator1 =0;
	int iterator2 =0;
	for(String port : portDetails){
		String[] splitDetails = port.split("\\|");
		int counter =0;
		for(int j=2;j<=splitDetails.length-1;j++){
			if(splitDetails[j].equals("1")){
				counter+=1;
			}
		}
		if(counter>0){
			if (counter>1){
				multiMode[iterator1]= port;
				iterator1+=1;
				}
				else{
					oneMode[iterator2]= port;
					iterator2+=1;
				}
			}
	}
	System.out.println("One mode of transportation :");
	if (oneMode[0] != null){
		System.out.format("%-5s%s\n","Id","Name");
		for(int j=0;j<=oneMode.length-1.;j++){
			if (oneMode[j] != null){
			String[] myList = oneMode[j].split("\\|");
			System.out.format("%-5s%s\n",myList[0],myList[1]);
		}
		}
	}
		else{
			System.out.println("No such transportation available");
		}
		 
	System.out.println("More than one mode of transportation :");
	if (multiMode[0]!= null){
		System.out.format("%-5s%s\n","Id","Name");
		for(int j=0;j<=oneMode.length-1;j++){
			if (multiMode[j] != null){
			String[] myList = multiMode[j].split("\\|");
			System.out.format("%-5s%s\n",myList[0],myList[1]);
			}
		}
	}
		else{
			System.out.println("No such transportation available");
		}

}
public void exe3(){
	int i;
	Scanner reader = new Scanner(System.in);
	System.out.println("Input:");
	String tp = reader.nextLine();
	int count = Integer.parseInt(tp);
	String[] city = new String[count];
	double[] rate = new double[count];
	for(i=0;i<count;i++){
		city[i] = reader.nextLine();
	}
	for(i=0;i<count;i++){
		 String temp = reader.next();
		rate[i] = Double.parseDouble(temp);
	}
	 double temp = 0;
	 String tempCity;
	
        for (int k = 0; k < rate.length - 1; k++) {
        	 
            for ( int j = k + 1; j < rate.length; j++) {
                if (rate[k] > rate[j]) {
                    temp = rate[j];
                    rate[j] = rate[k];
                    rate[k] = temp;
                    tempCity = city[j];
                    city[j] = city[k];
                    city[k] = tempCity;
                    		
                }
                
            }
        }
	
	for(int j= 0;j<count;j++){
		System.out.println(city[j]+" - "+rate[j]);
		
	}
}
public void exe2(){
	int i;
	int maxNum=0;
	int temp1 =0;
	Scanner reader = new Scanner(System.in);
	System.out.println("Input:");
	String tp = reader.nextLine();
	int count = Integer.parseInt(tp);
	int[] num = new int[count];
	for(i=0;i<count;i++){
		String temp = reader.next();
		num[i] = Integer.parseInt(temp);
	}
	maxNum = num[0];
	for(int j= 1;j<count;j++){
		if (num[j]>=maxNum) {
			maxNum = num[j];
		}
	}
	for(int j= 0;j<count;j++){
		temp1 = temp1+num[j];}
	int total = ((maxNum*(maxNum+1))/2);
	System.out.println("Customer id "+ (total - temp1)+" is missing");
}


public void exe1(){
	int i;
	int maxNum=0;
	Scanner reader = new Scanner(System.in);
	System.out.println("Input:");
	String tp = reader.nextLine();
	int count = Integer.parseInt(tp);
	int[] num = new int[count];
	for(i=0;i<count;i++){
		String temp = reader.next();
		num[i] = Integer.parseInt(temp);
	}
	maxNum = num[0];
	for(int j= 1;j<count;j++){
		
		if (num[j]>=maxNum) {
			maxNum = num[j];
		}

	}
	System.out.println("Next customer id is "+ (maxNum+1));

}
}
