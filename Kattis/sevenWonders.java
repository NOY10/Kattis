package Kattis;

import java.util.Scanner;

public class sevenWonders {

	public static void main(String[] args) {
		Scanner obj=new Scanner(System.in);
		String nam=obj.nextLine();
		
		char[] nam1=nam.toCharArray();
		char[] cards= {'T','C','G'};
		int[] answer=new int[3];
		for(int i=0;i<3;i++) {
			int s=1;
			for(int j=0;j<nam.length();j++) {
				if(cards[i]==nam1[j]) {
					answer[i]=s++;
					
				}
			}			
		}
		int lowest=0;
		if(answer[0]!=0&&answer[1]!=0&&answer[2]!=0) {
			 lowest=answer[0];
			for(int i=0;i<3;i++) {
				if(lowest>answer[i]) {
					lowest=answer[i];
				}
			}
		}
		int t=0,Fans;
		for(int i=0;i<3;i++) {
		 t=t+(int) Math.pow(answer[i], 2);
				
		}
		Fans=t+(7*lowest);
		System.out.println(Fans);
		
	}

}
