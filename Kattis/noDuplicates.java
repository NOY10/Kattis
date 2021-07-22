package Kattis;

import java.util.*;
public class noDuplicates {

	public static void main(String[] args) {
		Scanner obj=new Scanner(System.in);
		String sen=obj.nextLine();
		char[] sen1=sen.toCharArray();
		int c=0;
		for(int i=0;i<sen.length();i++) {
			if(sen1[i]==' ') {
				c++;
			}
		}
		int s=0;
		String[] parts=sen.split(" ");
		for(int i=0;i<c+1;i++) {
			for(int j=i+1;j<c+1;j++) {
				if(parts[i].equals(parts[j])) {
					s++;
					}
				}
		   }
		if(s>0) {
			System.out.println("no");
		}
		else {
			System.out.println("yes");
		}
       }
			
	}


