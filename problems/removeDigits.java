package problems;

import java.util.Scanner;

public class removeDigits {
	
	//Sliding Window
	public static String removeNumber(String s) {
	       StringBuilder sb = new StringBuilder(s);
	        
	        int i = 0;
	        while (i < sb.length()) {
	        	
	        	if(sb.charAt(i) >= '0' && sb.charAt(i) <= '9')
	        	{
	        		
	        		sb.deleteCharAt(i);
	        		i--;	        		
	        	}
	        	i++;
	        	
	        }
	        return sb.toString();
	    }

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Enter string where digit characters are required to be removed: ");
		String str = in.nextLine();
		
		// str = str.replaceAll("[A-Z][a-z][a-z]", "");
		
		System.out.println(removeNumber(str));
		
		in.close();
	}

}
