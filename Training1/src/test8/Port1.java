package test8;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Port1 implements Comparable<Port1> {
 
	  Integer id;
	  String name;
	  String country;
	  Port1(){}
	  public Port1(Integer id, String name, String country) {
	        this.id = id;
	        this.name = name;
	        this.country = country;
	  }
	      
	    public Integer getId() {
	        return id;
	    }

	    public void setId(Integer id) {
	        this.id = id;
	    }

	    public String getName() {
	        return name;
	    }

	    public void setName(String name) {
	        this.name = name;
	    }

	    public String getCountry() {
	        return country;
	    }

	    public void setCountry(String country) {
	        this.country = country;
	    }
		@Override
		public int compareTo(Port1 o) {
			int res = this.country.compareTo(o.country);
			if(res>0){
				return res; 
			} 
			else if(res==0){
				return res;
			}
			else{
				return -1;
			}
			
		}
		public String toString(){
		     return String.format("%-15s %-15s %-15s",getId(),getName(),getCountry());
		   }
		
		public static void main(String args[])throws IOException {
			   BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
			   List<Port1> plist = new ArrayList<Port1>();
			   String flag =null;
			   System.out.println("Enter the port details");
			   do{
			   String[] p = br.readLine().split(",");
			   plist.add(new Port1(Integer.parseInt(p[0]),p[1],p[2]));
			   System.out.println("Do you want to continue[Yes/No]");
			   flag= br.readLine();
			   }while(flag.equals("Yes"));
				Collections.sort(plist);
				System.out.println("Port details in sorted order");
				String.format("%-15s %-15s %-15s","Port Id","Name","Country");
				for(Port1 p:plist){
		   			System.out.println(p.toString());
		   }
		}
					   

}
