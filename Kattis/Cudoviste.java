package Kattis;

import java.util.Scanner;

public class Cudoviste {

	public static void main(String[] args) {
		Scanner obj=new Scanner(System.in);
		int num=obj.nextInt();
		int num2=obj.nextInt();
		String[] p=new String[num+1];
		String s="";
		for(int i=0;i<=num;i++) {
			p[i]=obj.nextLine();
			s=s+p[i];
		}
		
		char[][] pa=new char[num][num2];
		int offset=0;
		for(int i=0;i<num;i++) {
			for(int j=0;j<num2;j++) {
				pa[i][j]=s.charAt(offset++);
				
			}
		}
		int t=2;
		for(int i=0;i<t;i++) {
			for(int j=0;j<t;j++) {
				System.out.println(pa[i][j]);
				
				
			}
		}
	}

}
