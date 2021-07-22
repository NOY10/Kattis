/**
 * 
 */
package Kattis;

import java.util.*;

public class Test {

	public static void main(String[] args) {
		Scanner obj=new Scanner(System.in);
		char[] colname= {'C','S','T','R','O','Y','A','L','U','N','I','V','E','R','S','O','T','Y','O','F','B','H','U','T','A','N'};
		int sum=0;
		System.out.print("enter name in capital letter");
		String name=obj.nextLine();
		char[] name1=name.toCharArray();
		for(int i=0;i<name.length();i++) {
			for(int j=0;j<26;j++) {
				if(name1[i]==colname[j]) {
					sum+=5;
					break;
					}
			}
			
		}
		if(sum>40) {
			System.out.print("good virtue in CST");
		}
		else {
			System.out.print("Work hard");
		}
		
		
		

	}

}
