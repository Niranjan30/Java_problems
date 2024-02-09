package problems;

import java.util.Scanner;

public class subStringOccurence {
	
	//AABBAAAB
	//AA
	//2
	
	//AABBAAAB
	//BB
	//1
	
	//do not use indexOF
	public static int occurences(String s, String subS)
	{
		if(s.length() == 0 || subS.length() == 0)
		{
			return 0;
		}
		
		StringBuilder sb = new StringBuilder(s);
		int occ = 0;
        
        int i = 0;
        while (i < sb.length()) {
            int j = 0, temp = i; 
            while (i < sb.length() && j < subS.length() && sb.charAt(i) == subS.charAt(j)) 
            {
                i++; j++; 
               
            }
            if (j == subS.length())
            { 
                occ = occ + 1; 
                i = Integer.max(temp,temp + j + 1); 
            } 
            else
            {
                i = temp + 1;
            }
        }
        return occ;
	}

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		System.out.println("Enter the String: ");
		String str = in.nextLine();
		
		System.out.println("Enter the Sub String: ");
		String subStr = in.nextLine();
		
		int occ = occurences(str,subStr);
		System.out.println("The number of occurences of substring in string is : " + occ);
		
		in.close();
	}

}
