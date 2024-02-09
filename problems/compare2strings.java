package problems;

import java.util.Scanner;

public class compare2strings {
	
	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		System.out.println("Input the first string to be compared: ");
		String s1 = in.nextLine();
		System.out.println("Input the second string to be compared: ");
		String s2 = in.nextLine();
		
		//using compareTo method of string
		
		System.out.println("In the following situation, the case are considered");
		if(s1.compareTo(s2) > 0)
		{
			System.out.println("The first string lexicographically follows the second string");

		}
		else if(s1.compareTo(s2) < 0)
		{
			System.out.println("The second string lexicographically follows the first string");
		}
		else 
		{
			System.out.println("The two strings are equal.");
		}
		
		
		System.out.println("In the follow situation, the case are ignored");
		
		if(s1.compareToIgnoreCase(s2) > 0)
		{
			System.out.println("The first string lexicographically follows the second string");
		}
		else if(s1.compareToIgnoreCase(s2) < 0)
		{
			System.out.println("The second string lexicographically follows the first string");
		}
		else 
		{
			System.out.println("The two strings are equal.");
		}
		
		
		/*
		
		int sLength1 = s1.length();
		int sLength2 = s2.length();
		int max = 0;
		
		if(sLength1 > sLength2)
		{
			max = sLength1;
		}
		else
		{
			max = sLength2;
		}
		
		for(int i = 0; i < max; i++)
		{
			
			try {
			if(s1.charAt(i) < s2.charAt(i))
			{
				System.out.println("The first string lexicographically follows the second string");
				break;
			}
			else
			
				if(s1.charAt(i) > s2.charAt(i))
				{
					System.out.println("The second string lexicographically follows the first string");
					break;
				}
			
			else
			
				if(i == max-1)
				System.out.println("The two strings are equal");
			}
			catch(IndexOutOfBoundsException b)
			{
				System.out.println(b);
			}
			
		}
		*/
		
/*
		int sLength1 = s1.length();
		int sLength2 = s2.length();
		int counter1 = 0;
		int counter2 = 0;
		
		while(true)
			
		{
			if(s1.charAt(counter1) < s2.charAt(counter2))
			{
				System.out.println("The first string lexicographically follows the second string");
				break;
			}
			else
				if(s1.charAt(counter1) > s2.charAt(counter2))
				{
					System.out.println("The second string lexicographically follows the first string");
					break;
				}
			counter1++;
			counter2++;
		}
		
	*/	
		
		in.close();
	}

}
