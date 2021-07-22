package Kattis;

import java.util.Scanner;

public class janitorTroubles {

	public static void main(String[] args) {
		Scanner obj=new Scanner(System.in);
		double a=obj.nextInt();
		double b=obj.nextInt();
		double c=obj.nextInt();
		double d=obj.nextInt();
		double SP=(a+b+c+d)/2;
		
		double ans=Math.sqrt((SP-a)*(SP-b)*(SP-c)*(SP-d));
		
		System.out.println(ans);
		

	}

}
