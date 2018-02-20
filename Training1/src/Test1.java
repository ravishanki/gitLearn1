import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.DecimalFormat;
import java.util.Scanner;

public class Test1 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		/*  System.out.println("Enter the name");
			Scanner reader = new Scanner(System.in);
	    	String temp = reader.nextLine();
			System.out.println("Hello "+ temp + "! Get access to the unique shipping!");*/
		/*BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		Scanner reader = new Scanner(System.in);
		System.out.println("Enter the item details");		
		System.out.println("Enter the name of the item :");	
		String item = br.readLine();
		System.out.println("Enter the description :");
		String desc = br.readLine();
		System.out.println("Enter the item number :");
		String itmNum = br.readLine();
		Integer itmNum1 = Integer.parseInt(itmNum);
		System.out.println("Enter the price :");
		String amount = br.readLine();
		double amount1  = Double.parseDouble(amount);
		System.out.println("Item Details");
		System.out.println("Name: "+ item);
		System.out.println("Description: "+ desc);
		System.out.println("Item Number : "+ itmNum1);
		DecimalFormat df = new DecimalFormat("#.00");
		System.out.println("Price: "+ df.format(amount1));
		*/
		Scanner reader = new Scanner(System.in);
		System.out.println("Enter the total weight :");
		String temp = reader.nextLine();
		Float totalWeight = Float.parseFloat(temp);
		DecimalFormat df = new DecimalFormat("#.#");
		Float test = reader.nextFloat();
		System.out.println(totalWeight.toString());
		System.out.println(df.format(test).toString());
	}
	public void exe5(){
		Scanner reader = new Scanner(System.in);
		System.out.println("Enter the shipping Cost of item 1");
		int i1 = reader.nextInt();
		System.out.println("Enter the shipping Cost of item 2");
		int i2 = reader.nextInt();
		System.out.println("Enter the shipping Cost of item 3");
		int i3 = reader.nextInt();
		System.out.println("Total Shipping Cost of Item is "+ (i1+i2+i3));
	}
	public void exe() throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter the agent details");
		System.out.println("Enter the agent name :");
		String name = br.readLine();
		System.out.println("Enter the identification number :");
		String id = br.readLine();
		System.out.println("Enter the accountNumber :");
		String acNum = br.readLine();
		System.out.println("Enter the creditLimit :");
		String creditLimit = null;
		try {
			 creditLimit = br.readLine();
		} catch (IOException e) {
			e.printStackTrace();
		}
		DecimalFormat df = new DecimalFormat("#.00");
		System.out.println("Agent details are");
		System.out.println("Name : "+ name);
		System.out.println("Identification Number : "+ id);
		System.out.println("Account Number : "+ acNum);
		double creditlimit= Double.parseDouble(creditLimit);
		System.out.println("Credit Limit : "+ df.format(creditlimit));
	}
	public void ex3 () {
		Scanner reader = new Scanner(System.in);
		System.out.println("Enter the User Details");
		System.out.println("Enter the id :");
		String id = reader.nextLine();
		System.out.println("Enter the name :");
		String name = reader.nextLine();
		System.out.println("Enter the username :");
		String userName = reader.nextLine();
		System.out.println("Enter the password :");
		String password = reader.nextLine();
		System.out.println("Enter the mobilenumber :");
		String mobnum = reader.nextLine();
		System.out.println("Enter the rating :");
		String rating = reader.nextLine();
		System.out.println("User details are :");
		System.out.println("Id : "+ id);
		System.out.println("Name : "+ name);
		System.out.println("Username : "+ userName);
		System.out.println("Mobile Number : "+ mobnum);
		System.out.println("Rating : "+ rating);
	}

}
