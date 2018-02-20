package test4;

import java.util.Scanner;

public class Port {
	
	Integer id;
	String name;
	String country;
	
	public Port(Integer id,String name){
		this.id = id;
		this.name = name;
		this.country = "India";
	}
    public Port(Integer id,String name,String country){
    	this.id = id;
		this.name = name;
		this.country = country;
    }
    @Override
    public String toString(){
    	return String.format("%-15s %-15s %-15s",id.toString(),name,country);
    }
    
    public static void main(String[] args) {
	   Integer id;
		String name;
		String country;
		String flag;
		int i;
		System.out.println("Enter the number of ports");
    	Scanner reader =  new Scanner(System.in);
    	String temp = reader.nextLine();
    	int nos = Integer.parseInt(temp);
    	Port[] s = new Port[nos];
    	for(i=0;i<nos;i++){
    		System.out.println("Enter the port" + (i+1) + " details");
	    	temp = reader.nextLine();
	    	id = Integer.valueOf(temp);
	    	name = reader.nextLine();
	    	System.out.println("Is the port from same country[Y/N]");
	    	flag =  reader.nextLine();
	    	if (flag.equals("N")){
	    		System.out.println("Enter the country");
	    		country = reader.nextLine();
	    		s[i] = new Port(id,name,country);
	    	}
	    	else{
	    		s[i] = new Port(id,name);
	    	}
	   
	    	}
    	System.out.println("Port details are");
    	System.out.format("%-15s %-15s %-15s\n","id","Name", "Country");
    	for(i=0;i<nos;i++){
    		System.out.println(s[i]);
    	}
    }
 
}
