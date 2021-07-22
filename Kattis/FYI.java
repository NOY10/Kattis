package Kattis;

import java.util.Scanner;

public class FYI {

	public static void main(String[] args) {
		Scanner obj=new Scanner(System.in);
		String num=obj.next();
		
		if(num.startsWith("555")) {
			System.out.println("1");
		}
		else {
			System.out.println("0");
		}

	}

}
