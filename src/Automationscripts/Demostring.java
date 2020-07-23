package Automationscripts;

public class Demostring {
	public static void main(String[] args)
	{
		
		//String constant literals - pool
		String str1="Hello";
		
		String str3="Hello";
		
		
		//Heap Memory - Objects store in Heap memory		
		String str2=new String("Welcome");
		
		String str4=new String("Welcome");
		
		
		//Strings are immumtable
//Now More hello will be created but str1 will be now referenced to more hello but not the hello
		str1="More hello"; 
				
	}

}
