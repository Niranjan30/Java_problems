package problems;

import java.util.Scanner;

public class splitString {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Enter the string that needs to be split: ");
		String s = in.nextLine();
		
		System.out.println("Enter the delimiter: ");
		String delimit = in.nextLine();
		
		System.out.println("Enter the number of strings that is required to be obtained after splitting: ");
		int count = in.nextInt();
		
		for(String split: s.split(delimit, count))
		{
			System.out.println(split);
		}
		in.close();
	}

}
