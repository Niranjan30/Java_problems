package problems;

import java.util.Scanner;

public class replaceSubString {
	
	public static String replaceSubS(String s, String subS, String replaceS) {
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
                sb.insert(temp, replaceS);
                i = Integer.max(0,temp - j + 1); 
            } 
            else
            {
                i = temp + 1;
            }
        }
        return sb.toString();
	}

	//Special character error
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Enter a string: ");
		String s = in.nextLine();
		
		System.out.println("Enter substring which needs to be replaced from main string: ");
		String subString = in.nextLine();
		
		System.out.println("Enter substring that will take the spot of replaced substring: ");
		String replacedSubString = in.nextLine();
		
		//s = s.replaceAll(subString, replacedSubString);
		
		System.out.println("The replaced string is : " + replaceSubS(s,subString,replacedSubString));

		in.close();
	}

}
