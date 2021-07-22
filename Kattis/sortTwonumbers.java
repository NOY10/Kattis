package Kattis;

import java.util.Scanner;

public class sortTwonumbers {
	public static void main(String[] args) {
		Scanner obj=new Scanner(System.in);
        int a=obj.nextInt();
        int b=obj.nextInt();
        if(a>b) {
        	System.out.println(b+" "+a);
        }
        else {
        	System.out.println(a+" "+b);
        }

	}

}
