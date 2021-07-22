package Kattis;

import java.util.Scanner;

public class DetailedDifferences {

	public static void main(String[] args) {
	Scanner obj=new Scanner(System.in);
	int num=Integer.parseInt(obj.nextLine());
	for(int t=0;t<num;t++) {
		String a=obj.nextLine();
		String b=obj.nextLine();
		char[] a1=a.toCharArray();
		char[] b1=b.toCharArray();
		System.out.println(a);
		System.out.println(b);
		for(int i=0;i<a.length();i++) {
			if(a1[i]==b1[i]) {
				System.out.print(".");
			}
			else {
				System.out.print("*");
			}
			}
		System.out.print("\n");
		
	}

	

	}

}
