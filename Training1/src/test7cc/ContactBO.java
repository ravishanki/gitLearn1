package test7cc;
import java.util.regex.Pattern;
import java.util.regex.Matcher;
import java.io.*;

public class ContactBO {
	public ContactBO()
	{
		
	}
	private Pattern regexPattern;
	private Matcher regMatcher;
	public boolean validateContactDetails(Contact co) throws InvalidContactException 
	{	
		 String email_ptn =
				"^[_A-Za-z0-9-\\+]+(\\.[_A-Za-z0-9-]+)*@"
				+ "[A-Za-z0-9-]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,})$";
			 regexPattern = Pattern.compile(email_ptn);
			regMatcher = regexPattern.matcher(co.email);
		if(((co.name).isEmpty())||((co.streetname).isEmpty())
		||((co.address).isEmpty())||((co.city).isEmpty())
		||((co.state).isEmpty())||((co.phoneNumber).isEmpty())||((co.email).isEmpty())){
			throw new InvalidContactException("Make sure you entered all the fields");
		}
		else if(!((co.phoneNumber).length()==10)){
			throw new InvalidContactException("Invalid Phone Number");
		}
		else if (!(regMatcher.matches())){
			throw new InvalidContactException("Invalid email");
		}
		else{
		return true;
		}
	
	}
	
	public static void main(String arg[])throws IOException 
	{
		 BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		   System.out.println("CONTACT DETAILS");
		   System.out.println("Enter the name:");
		   String name = br.readLine();
		   System.out.println("Enter the street name :");
		   String stName = br.readLine();
		   System.out.println("Enter the address :");
		   String address = br.readLine();
		   System.out.println("Enter the city :");
		   String city = br.readLine();
		   System.out.println("Enter the state :");
		   String state = br.readLine();
		   System.out.println("Enter the phone number :");
		   String phone = br.readLine();
		   System.out.println("Enter the email id :");
		   String email = br.readLine();
		   Contact contact = new Contact(name,stName,address,city,state,phone,email);
		   ContactBO cbo  = new ContactBO();
		   try{
			   cbo.validateContactDetails(contact);
			   System.out.println("Contact is valid");
		   }
		   catch(InvalidContactException e){
			   System.out.println(e.toString());
		   }
		   
	}
}
