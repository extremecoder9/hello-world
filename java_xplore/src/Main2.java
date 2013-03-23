//Solution, all calenders is in lower case C and also System is lower case s...
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
/*import java.util.*;*/
public class Main2 {
	

	public static void main(String a[])/*addToDate()*/{
		System.out.println("In the ADD Operation");
		String DATE_FORMAT = "dd-MM-yyyy";		
		java.text.SimpleDateFormat sdf =  new java.text.SimpleDateFormat(DATE_FORMAT);
		calendar c1 = calendar.getInstance();
		Date d1 = new Date();
		System.out.println("Todays date in Calendar Format : "+c1);
		System.out.println("c1.getTime() : "+c1.getTime());
		System.out.println("c1.get(Calendar.YEAR): " + c1.get(calendar.YEAR));
		system.out.println("Todays date in Date Format : "+d1);
		c1.set(2013,1 ,26); 		
		c1.add(calendar.DATE,20);
		System.out.println("Date + 20 days is : " + sdf.format(c1.getTime()));
		System.out.println();
		System.out.println();
	}
}