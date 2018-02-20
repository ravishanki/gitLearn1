package test4;

import java.util.Scanner;

public class Cargo {
	
	String name;
	String description;
	Double width;
	Double length;
	
	public String getName() {   
        return name;   
		}   
	public void setName(String name) {   
        this.name = name;   
		}
	public String getDescription() {   
        return description;   
		}   
	public void setDescription(String description) {   
        this.description = description;   
		}
	public Double getWidth() {   
        return width;   
		}   
	public void setWidth(Double width) {   
        this.width = width;   
		}
	public Double getLength() {   
        return length;   
		}   
	public void setLength(Double length) {   
        this.length = length;   
		}
	
public void displayCargoDetails(){
	
	System.out.println("Name :"+this.getName());
	System.out.println("Description :"+this.getDescription());
	System.out.println("Length :"+this.getLength());
	System.out.println("Width :"+this.getWidth());
}
	
	public static void main(String[] args) {
		
		Scanner reader = new Scanner(System.in);
		System.out.println("Enter the cargo details:");
		System.out.println("Enter the name");
		String name = reader.nextLine();
		System.out.println("Enter the description");
		String desc = reader.nextLine();
		System.out.println("Enter the length");
		String temp = reader.nextLine();
		double len = Double.parseDouble(temp);
		System.out.println("Enter the width");
		temp = reader.nextLine();
		double wid = Double.parseDouble(temp);
		Cargo c = new Cargo();
		c.setName(name);
		c.setDescription(desc);
		c.setLength(len);
		c.setWidth(wid);
		System.out.println("The cargo details are:");
		c.displayCargoDetails();
	
	}

}
