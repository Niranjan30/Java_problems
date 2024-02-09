package problems;

import java.util.Scanner;

public class eliminateSubString {
	
	//Sliding Window
	public static String removeOccurrences(String s, String subS) {
        StringBuilder sb = new StringBuilder(s);
        
        int i = 0;
        while (i < sb.length()) {
            int j = 0, temp = i; 
            while (i < sb.length() && j < subS.length() && sb.charAt(i) == subS.charAt(j)) 
            {
                i++; j++; 
            }
            if (j == subS.length())
            { 
                sb.delete(temp, temp+j); 
                i = Integer.max(0,temp - j + 1); 
            } 
            else
            {
                i = temp + 1;
            }
        }
        return sb.toString();
    }

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Enter a string: ");
		String s = in.nextLine();
		
		System.out.println("Enter substring which needs to be eliminated from main string: ");
		String subString = in.nextLine();
		
		// Replaced with user-defined logic
		// s = s.replaceAll(subString, "");
		
		System.out.println("The replaced string is : " + removeOccurrences(s,subString));
		
		in.close();

	}

}
