package test7;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class test7 {
	public static void main(String args[]) throws IOException{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		Integer counter =0;
		System.out.println("Enter the number of username to be verified:");
		Integer number = Integer.parseInt(br.readLine());
		String[] username = new String[number];
		System.out.println("Enter the usernames:");
		for (int i=0;i<number;i++){
			username[i] = br.readLine();
		}
		System.out.println("Usernames after recovering:");
		for(int i=0;i<number;i++){
			String newUsername = username[i].replaceAll("[^a-zA-Z0-9]","");
			if(newUsername.length()==0){
				counter = counter+1;
				System.out.println("IV100"+counter.toString());
			}
			else{
				System.out.println(newUsername);
			}
		}
	}

	
	public void exe2() throws IOException{
	BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
	System.out.println("Enter the file content:");
	String content = br.readLine();
	System.out.println("Enter the virus keyword:");
	String keyWord  = br.readLine();
	keyWord  = keyWord.trim();
	if(content.contains(keyWord)){
		System.out.println("Virus"+keyWord+ " is present");
	}
	else{
		System.out.println("Virus"+keyWord+ " is not present");
	}

}
	public void exe3() throws IOException{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter the document 1 content:");
		String doc1 = br.readLine();
		System.out.println("Enter the document 2 content:");
		String doc2 = br.readLine();
		System.out.println(doc1.trim()+doc2.trim());
		if(doc1.equals(doc2)){
			System.out.println("Green");
		}
		else if(doc1.replace(" ", "").equals(doc2.replace(" ", ""))) {
			System.out.println("Orange");
		}
		else if(doc1.equalsIgnoreCase(doc2)) {
			System.out.println("Blue");
		}
		else  {
			System.out.println("Red");
		}
	}
	public void exe4() throws IOException{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter the email id");
		String email = br.readLine();
		int temp = email.indexOf(".");
		Integer length = email.length();
		String domain = email.substring((temp+1), length);
		if((domain.equals("com")) || (domain.equals("biz")) || (domain.equals("net"))||(domain.equals("org"))){
			System.out.println("Valid domain");
		}
		else{
			System.out.println("Not a valid domain");
		}
	}
	public void exe5() throws IOException{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter the invoice code");
		String code = br.readLine();
		if(code.contains("CU")){
			code = code.replace("CU", "CUR");
			StringBuilder sb = new StringBuilder(code);
			while(sb.length()<10){
				sb.insert(3, "0");
			}
			System.out.println("Formated Code :\n"+sb);
		}
		else if(code.contains("AT")){
			code = code.replace("AT", "AGT");
			StringBuilder sb = new StringBuilder(code);
			while(sb.length()<10){
				sb.insert(3, "0");
			}
			System.out.println("Formated Code :\n"+sb);
		}
		else if(code.contains("CY")){
			code = code.replace("CY", "CMY");
			StringBuilder sb = new StringBuilder(code);
			while(sb.length()<10){
				sb.insert(3, "0");
			}
			System.out.println("Formated Code :\n"+sb);
		}
		else{
			
		}
	}
	}
