package test5cc;

import java.io.*;

public class Main {

    public static void main(String[] args) throws Exception {
        int choice = 0,noOfPerson,noOfDays;
        Boolean roomBoolean = false;
        String roomChoice = null;
        String lengthBreadth;
        int size=0;
        Double totalCost;
        Double totalAmount = 0d;
        Room room = null;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Room booking:");
        System.out.println("1. Single room\n2. Double room\n3. Deluxe Room\nEnter your choice:");
        choice  = Integer.parseInt(br.readLine());
        System.out.println("Enter the number of person:");
        noOfPerson  = Integer.parseInt(br.readLine());
        System.out.println("Enter the number of days:");
        noOfDays  = Integer.parseInt(br.readLine());
        System.out.println("Enter the length x breadth:");
        lengthBreadth = br.readLine();
        String[] t = lengthBreadth.split("x");
        Integer length  = Integer.parseInt(t[0]);
        Integer breadth = Integer.parseInt(t[1]);
        switch(choice)
        {
            case 1:
                System.out.println("Do you want AC or not (y/n):");
                roomChoice = (br.readLine());
                room = new SingleRoom(600d,length,breadth);
                break;
            case 2:
                System.out.println("Do you want extra cot (y/n):");
                roomChoice = (br.readLine());
                room = new DoubleRoom(1000d,length,breadth);
                break;
            case 3:
                System.out.println("Do you want complementary breakfast (y/n):");
                roomChoice = br.readLine();
                room = new DeluxeRoom(1500d,length,breadth);
                break;
        }
        totalCost = room.calculateTotalCost(noOfPerson, noOfDays);
        switch(choice)
        {
            case 1:
                if(roomChoice.equalsIgnoreCase("Y")){
                	totalAmount =totalCost+(totalCost*(8.9/100));
                }
                else{
                	totalAmount =totalCost+(totalCost*(5.8/100));
                }
                break;
            case 2:
            	 if(roomChoice.equals("Y")){
                 	totalAmount =totalCost+(totalCost*(6.4/100));
                 }
                 else{
                 	totalAmount =totalCost+(totalCost*(3.5/100));
                 }
            	 break;
            case 3:
            	 if(roomChoice.equals("Y")){
                 	totalAmount =totalCost+(totalCost*(7.3/100));
                 }
                 else{
                 	totalAmount =totalCost+(totalCost*(4.9/100));
                 }
            	 break;
        }
        size = room.calculateArea();
        System.out.println("The total Amount is:"+totalAmount);
        System.out.println("The total area is:"+size+"sq.ft");
    }
    
}

