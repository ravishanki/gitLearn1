package test8;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Port {
    
    Integer id;
    String name;
    String city;
    
    Port(){}
    Port(Integer id,String name,String city){
     this.id = id;
     this.name = name;
     this.city = city;    
    }
    void setId(Integer id){
     this.id = id;
    }
    Integer getId(){
     return id;
    }
    
    void setName(String name){
     this.name = name;
    }
    String getName(){
     return name;
    }
    
    void setCity(String city){
     this.city = city;
    }
    
    String getCity(){
     return city;
    }
    
   public String toString(){
     return String.format("%-15s %-15s %-15s",getId(),getName(),getCity());
   }
    
   public static void main(String args[])throws IOException {
	   BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
	   List<Port> list = new ArrayList<Port>(); 
	   System.out.println("Enter the number of port details");
	   Integer number = Integer.parseInt(br.readLine());
	   System.out.println("Enter the port details");
	   for(int i=0;i<number;i++){
		   String order = br.readLine();
		   String[] t = order.split(",");
		   list.add(new Port(Integer.parseInt(t[0]),t[1],t[2]));
	   }
	   System.out.format("%-15s %-15s %-15s\n","Port Id","Name","Location");
	   for(Port p:list){
  			System.out.println(p.toString());
	   }
	   System.out.println("Enter the position");
	   Integer position = Integer.parseInt(br.readLine());
	   System.out.println("Enter port detail to be inserted");
	   String[] t = br.readLine().split(",");
	   list.add((position-1),new Port(Integer.parseInt(t[0]),t[1],t[2]));
	   System.out.println("After the insertion of port details");
	   System.out.format("%-15s %-15s %-15s\n","Port Id","Name","Location");
	   		for(Port p:list){
	   			System.out.println(p.toString());
	   }
	}

}
