
package Kattis;

import java.util.Scanner;

public class zamka {


	public static void main(String[] args) {
		Scanner obj=new Scanner(System.in);
		int L=obj.nextInt();
		int D=obj.nextInt();
		int X=obj.nextInt();
		
		for(int i=L;i<=D;i++) {
			String num=Integer.toString(i);
			char[] L1=num.toCharArray();
			int c=0;
			for(char each: L1) {
				c+=Integer.parseInt(Character.toString(each));
				
			}
			if(X==c) {
				System.out.println(i);
				break;
			}
			
			
		}
		for(int j=D;j>=L;j--) {
			String num2=Integer.toString(j);
			char[] L2=num2.toCharArray();
			int c2=0;
			for(char each: L2) {
				c2+=Integer.parseInt(Character.toString(each));
			}
			if(c2==X) {
				System.out.println(j);
				break;
			}
			
			
		}
//		
		obj.close();
	}

}
