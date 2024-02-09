package problems;

import java.util.Scanner;

public class replaceChar {

	public static String replaceCharacter(String s, char c, char replaceChar) {
        StringBuilder sb = new StringBuilder(s);
        
        int i = 0;
        while (i < sb.length()) {
        	
        	if(sb.charAt(i) == c)
        	{
        		sb.setCharAt(i, replaceChar);
        	}
        	i++;
        }
        return sb.toString();
    }
	
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Enter a string: ");
		String s = in.nextLine();
		
		System.out.println("Enter character that needs to be replaced: ");
		
		char c = in.nextLine().charAt(0);
				
		System.out.println("Enter character that will take place of the substituted character: ");
		char replaceChar = in.nextLine().charAt(0);
		
		//s = s.replace(c,replaceChar);
		
		System.out.println("The final string after replacing character(s) is: " + replaceCharacter(s,c,replaceChar));
		
		in.close();
	}

}
