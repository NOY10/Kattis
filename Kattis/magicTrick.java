package Kattis;

import java.util.Scanner;

public class magicTrick {

	public static void main(String[] args) {
		Scanner obj=new Scanner(System.in);
		String nam=obj.nextLine();
		char[] nam1=nam.toCharArray();
		int c=0;
		for(int i=0;i<nam1.length;i++) {
			int K=i+1;
			for(int j=K;j<nam1.length;j++) {
				if(nam1[i]==nam1[j]) {
					c++;
				}
			}
		}
		if(c>0) {
			System.out.println("0");
		}
		else {
			System.out.println("1");
		}
			

	}

}
