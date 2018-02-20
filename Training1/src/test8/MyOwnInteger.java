package test8;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class MyOwnInteger implements Comparable<MyOwnInteger> {
	private Integer number;
	

	public MyOwnInteger(Integer number) {
		super();	
		this.number = number;
	}
	@Override
	public int compareTo(MyOwnInteger o) {
		if(this.number==o.number){
			return 0; 
		} 
		else if(this.number < o.number){
			return 1;
		}
		else{
			return -1;
		}

	}
	public String toString(){
		return String.format(number.toString());
	}
	public static void main(String args[])throws IOException {
		   BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		   System.out.println("Enter n");
		   Integer n = Integer.parseInt(br.readLine());
		   List<MyOwnInteger> plist = new ArrayList<MyOwnInteger>();
		   List<MyOwnInteger> nlist = new ArrayList<MyOwnInteger>();
		   for (int i =0;i<n;i++){
			   Integer input =Integer.parseInt(br.readLine());
			   if(input<0){
			   nlist.add(new MyOwnInteger(input));
			   }
			   else{
				   plist.add(new MyOwnInteger(input));
			   }
		   }
		   Collections.sort(nlist,Collections.reverseOrder());
		   Collections.sort(plist);
		   nlist.addAll(plist);
		   System.out.println(nlist.toString());
	}
	
}
