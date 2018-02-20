package test5;

import java.io.IOException;
import java.util.Scanner;

public class Container extends Cargo {

	private String containerNumber;

	public Container(Float length, Float width, Float height, Double weight,String containerNumber) {
		super(length, width, height, weight);
		this.containerNumber = containerNumber;
	}
	public String getContainerNumber() {
		return containerNumber;
	}
	public void setContainerNumber(String containerNumber) {
		this.containerNumber = containerNumber;
	}
	public void displayContainerDetails() {
		
		System.out.format("%-20s %-15s %-15s %-15s %s\n", containerNumber.toString(), 
				length.toString(), width.toString(),
				height.toString(), weight.toString());
		
	}
public static void main(String[] args) throws IOException {
		
		Scanner reader =new Scanner(System.in);
		
		System.out.println("Enter the number of containers :");
		int n = Integer.parseInt(reader.nextLine());
		Container[] container = new Container[n];
		Cargo[] cargo =new Cargo[n]; 
		
		for(int i=0;i<n;i++) {
			
			System.out.println("Enter the container "+(i+1)+" details :");
			String temp = reader.nextLine();
			String[] t = temp.split(",");
			String containerNumber = t[0];
			Float length =Float.parseFloat(t[1]);
			Float width = Float.parseFloat(t[2]);
			Float height = Float.parseFloat(t[3]);
			Double weight = Double.parseDouble(t[4]);
			container[i] = new Container(length,width,height,weight,containerNumber);
			
		}
		
		System.out.format("Container details are\n%-20s %-15s %-15s %-15s %s\n","Container Number","Length","Width","Height","Weight");
		for(int i=0;i<n;i++) {
			container[i].displayContainerDetails();
		}
		
	}
}
