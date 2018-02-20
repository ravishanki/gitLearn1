package test5cc;

import java.util.Arrays;
import java.util.Scanner;

public class Account {
	private String username;
	private String password;
	private int cvv;
	private byte[] fingerPrint;
	public Account(String username, String password, int cvv, byte[] fingerPrint) {
		super();
		this.username = username;
		this.password = password;
		this.cvv = cvv;
		this.fingerPrint = fingerPrint;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public int getCvv() {
		return cvv;
	}
	public void setCvv(int cvv) {
		this.cvv = cvv;
	}
	public byte[] getFingerPrint() {
		return fingerPrint;
	}
	public void setFingerPrint(byte[] fingerPrint) {
		this.fingerPrint = fingerPrint;
	}
		 public Boolean authentication(String username,String password){
	         if ((this.username.equals(username)) && (this.password.equals(password))){
	        	 return true;
	         }
	         else{
	        	 return false;
	         }
	 }
	 public Boolean authentication(String username,int cvv){
		 if ((this.username.equals(username)) && (this.cvv==cvv)){
        	 return true;
         }
         else{
        	 return false;
         }
	 }
	 public Boolean authentication(byte[] fingerPrint){
		 if (Arrays.equals(this.fingerPrint,fingerPrint))
		 {
        	 return true;
         }
         else{
        	 return false;
         }
	 }
	 
	 
	 public static void main(String args[]) {
		 
		 Scanner reader =  new Scanner(System.in);
		 	 String username;
			 String password;
			 int cvv;
			 byte[] fingerPrint;
			 boolean flag = false;
	        Account accountArray[]=new Account[5];
	        accountArray[0]=new Account("vicky","vicky123",999,"0011".getBytes());
	        accountArray[1]=new Account("mark","mark007",100,"1111".getBytes());
	        accountArray[2]=new Account("priya","priya332",444,"0101".getBytes());
	        accountArray[3]=new Account("max","max232",555,"0001".getBytes());
	        accountArray[4]=new Account("martin","martin345",888,"0010".getBytes());
	        System.out.println("Enter the login mode");
	        System.out.println("1)Browser\n2)Wallet\n3)Mobile");
		   Integer choice = Integer.parseInt(reader.nextLine());
	        switch(choice){
	            case 1:
	                System.out.println("Enter the username");
	                username = reader.nextLine();
	                System.out.println("Enter the password");
	                password = reader.nextLine();
	                for(int i=0;i<accountArray.length;i++){
	                	if(!flag){
	                	flag = accountArray[i].authentication(username,password);
	                	}
	                }
	                break;
	            case 2:
	                System.out.println("Enter the username");
	                username = reader.nextLine();
	                System.out.println("Enter the CVV");
	                cvv = Integer.parseInt(reader.nextLine());
	                for(int i=0;i<accountArray.length;i++){
	                	if(!flag){
	                	flag= accountArray[i].authentication(username,cvv);
	                	}
	                }
	                break;
	            case 3:
	                System.out.println("Enter the fingerprint");
	                String temp = reader.nextLine();
	                fingerPrint = temp.getBytes();
	                for(int i=0;i<accountArray.length;i++){
	                	if(!flag){
	                	flag = accountArray[i].authentication(fingerPrint);
	                	}
	                }
	                break;
	        }
	        
	        if (flag){
	        	System.out.println("Authentication successful");
	        }
	        else{
	        	System.out.println("Authentication failed");
	        }
	    }

}
