package test9;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Role {
	
	private Long roleId;
	private String name;
	public Role(Long roleId, String name) {
		super();
		this.roleId = roleId;
		this.name = name;
	}
	public Long getRoleId() {
		return roleId;
	}
	public void setRoleId(Long roleId) {
		this.roleId = roleId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public static void main(String args[])throws IOException {
		   
	        List<User> list = new ArrayList<User>();
	        Role[] role = new Role[3];
	        role[0]= new Role(100l,"Admin");
	        role[1]= new Role(101l,"Shipping Manager");
	        role[2]= new Role(102l,"Purchase Manager");
	        System.out.format("%-15s %-15s\n","id","RoleName");
	        for(int i =0;i<role.length;i++){
	        	 System.out.format("%-15s %-15s\n",role[i].getRoleId(),role[i].getName());
	        }
	        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	        System.out.println("Enter the number of users:");
	        Integer number = Integer.parseInt(br.readLine());
	        System.out.println("Enter the user details:");
	        for(int i=0;i<number;i++){
	        	System.out.println("Enter the User ID");
	        	Long id = Long.parseLong(br.readLine());
	        	System.out.println("Enter the first name");
	        	String fname = br.readLine();
	        	System.out.println("Enter the last name");
	        	String lname = br.readLine();
	        	System.out.println("Enter the username");
	        	String uname = br.readLine();
	        	System.out.println("Enter the password");
	        	String pwd = br.readLine();
	        	System.out.println("Enter the mobile number");
	        	String mobnum = br.readLine();
	        	System.out.println("Enter the role name");
	        	String rolename = br.readLine();
	        	int j;
	        	for(j=0;j<role.length;j++ ){
	        		if(rolename.equals(role[j].name)){
	        			break;
	        		}
	        	}
	        	list.add(new User(id,fname,lname,uname,pwd,mobnum,role[j]));
	        }
	       UserBO bo = new UserBO();
	       bo.saveAllUser(list, "output.txt");
         
	 }
}
