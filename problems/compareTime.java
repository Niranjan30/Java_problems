package problems;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;


public class compareTime {

	//Use own logic
	
	public static void main(String[] args) throws ParseException {
		Scanner in = new Scanner(System.in);
		
		
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
		
		System.out.println("Enter the date, and time according to the format dd/MM/yyyy HH:mm:ss");
		
		System.out.println("Enter the date & time to be compared: ");
		String t1 = in.nextLine();
		
		Date d = new Date(System.currentTimeMillis());
		
		String t2 = sdf.format(d);
		
		Date time1 = sdf.parse(t1);
		
		Date time2 = sdf.parse(t2);

        int diff = time1.compareTo(time2);
        
        if(diff > 0)
        {
        	System.out.println(time1 + " is greater than " + time2);
        	
        } else if (diff < 0) 
        {
            System.out.println(time1 + " is less than " + time2);
            
        } 
        else
        {
            System.out.println(time1 + " is equal to " + time2);
        }
        in.close();

	}

}
