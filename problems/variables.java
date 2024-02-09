package problems;

import java.util.Scanner;



public class variables {
	
	//Class Variable message
	private String message;
	
	public void setMessage(String mes)
	{
		message = mes;
	}
	
	public String getMessage()
	{
		return message;
	}
	
	public int addition(int x, int y)
	{
		//Local variable sum
		int sum = x+y;
		return sum;
	}

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		variables obj = new variables();
		System.out.println("Enter message: ");
		String mes = in.nextLine();
		obj.setMessage(mes);
		
		obj.getMessage();
		
		System.out.println("Enter any integer: ");
		int a = in.nextInt();
		
		System.out.println("Enter any integer: ");
		int b = in.nextInt();
		
		System.out.println(obj.addition(a, b));
		in.close();
	}

}
