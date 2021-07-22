package Kattis;
import java.util.Scanner; 
import java.time.LocalDate;

public class Datum {
	public static String getDay(int day, int month, int year) 
	{
	    LocalDate dt=LocalDate.of(year, month, day);
	    return dt.getDayOfWeek().toString();
	}
	public static void main(String[] args) {
		Scanner obj=new Scanner(System.in);
		int D=obj.nextInt();
		int M=obj.nextInt(); 
		
		String name=getDay(D, M, 2009);
		 String upperCase = name.substring(0,1).toUpperCase() + name.substring(1).toLowerCase();
	        System.out.println(upperCase);
	
		

	}

}
