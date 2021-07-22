package Kattis;

import java.util.Scanner;

public class harshadNumbers {

	public static void main(String[] args) {
		Scanner obj=new Scanner(System.in);
		int num=obj.nextInt();
		int ans;
		do {
		int c=0;
		String nam=Integer.toString(num);
		char[] num1=nam.toCharArray();
		for(char each: num1) {
			c+=Integer.parseInt(Character.toString(each));
		}
		ans=num%c;
		num++;
		}while(ans!=0);
		System.out.println(num-1);

	}

}
