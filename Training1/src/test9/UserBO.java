package test9;


import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

public class UserBO {

	public UserBO() {
		
	}
	public void saveAllUser(List<User> userList,String fileName) throws IOException{
		 FileWriter fw = new FileWriter(fileName);
			BufferedWriter writer = new BufferedWriter(fw);
		    
				for(User u:userList){
		             writer.write(u.getId().toString()+","+u.getFirstName()+","+u.getLastName()
		    			+","+u.getUsername()+","+u.getPassword()+","+u.getMobileNumber().toString()
						+","+u.getRole().getRoleId()+","+u.getRole().getName());
		    		 writer.newLine();  
		    
				}
		        writer.flush();
		         writer.close();
				
				System.out.print("User information saved successfully");
			
	}
}
