package problems;

import java.util.Scanner;
import java.util.StringTokenizer;

public class tokenizeString {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		System.out.println("Enter the String that needs to be tokenized: ");
		String s = in.nextLine();
		
		System.out.println("Enter the delimiter: ");
		String delimiter = in.nextLine();
		StringTokenizer str = new StringTokenizer(s,delimiter);
		while(str.hasMoreTokens())
		{
			System.out.println(str.nextToken());
		}
		
		in.close();
	}

}
