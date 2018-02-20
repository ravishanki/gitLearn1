package test5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class User {
	
	String userName;
	String firstName;
	String lastName;
	String contact;
	
	public User(String userName, String firstName, String lastName, String contact) {
		super();
		this.userName = userName;
		this.firstName = firstName;
		this.lastName = lastName;
		this.contact = contact;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	
	public String getContact() {
		return contact;
	}
	public void setContact(String contact) {
		this.contact = contact;
	}
	
	
	public static User findUser(User userArray[],String userName){
		for(int i=0;i<userArray.length;i++){
			if(userName.equals(userArray[i].getUserName())){
				return userArray[i];
			}
		}
		return null;
	}
	public static User findUser(User userArray[],String firstName,String lastName){
		for(int i=0;i<userArray.length;i++){
			if(firstName.equals(userArray[i].getFirstName())&& (lastName.equals(userArray[i].getLastName())))
			{
				return userArray[i];
			}
		}
		return null;
	}
	
	public static void main(String[] args) throws NumberFormatException, IOException {
		Scanner reader =new Scanner(System.in);
		System.out.println("Enter the total number of users");
		int n = Integer.parseInt(reader.nextLine());
		User[] user = new User[n]; 
		System.out.println("Enter user details");
		for(int i=0;i<n;i++){
			String temp = reader.nextLine();
			String[] t1 = temp.split(",");
			String userName = t1[0];
			String firstName = t1[1];
			String lastName = t1[2];
			String contact = t1[3];
			user[i] = new User(userName,firstName,lastName,contact);
		}
		System.out.println("1)Search user by user name");
		System.out.println("2)Search user by first name and last name");
		System.out.println("Enter your option");
		int option = Integer.parseInt(reader.nextLine());
		User u = null;
		if (option==1){
			System.out.println("Enter the user name to search");
			String usrName = reader.nextLine();
			u =  u.findUser(user,usrName);
		}
		else{
			String fName = reader.nextLine();
			String lName = reader.nextLine();
			u =  u.findUser(user,fName,lName);
		}
		if (u== null){
			System.out.println("User not found");
		}
		else{
			System.out.println("User details :");
			System.out.println("Username :"+ u.getUserName());
			System.out.println("FirstName :"+u.getFirstName());
			System.out.println("LastName :"+u.getLastName());
			System.out.println("Contact :"+u.getContact());
		}
		
}
}
