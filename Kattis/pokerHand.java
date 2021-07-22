package Kattis;

import java.util.Scanner;

public class pokerHand {

	public static void main(String[] args) {
		Scanner obj=new Scanner(System.in);
		int a,b=1;
	    String nam=obj.nextLine();
	    char[] card=nam.toCharArray();
	    String Mcards="A23456789TJQK";
	    char[] Mcard= Mcards.toCharArray();
		
		int[] ans=new int[Mcards.length()];
	    for(int i=0;i<Mcards.length();i++) {
	    	a=0;
	    	for(int j=0;j<1;j++) {	
				if(card[0]==Mcard[i]) {
					a++;
				}
			    if(card[3]==Mcard[i]) {
					a++;
				}
			   if(card[6]==Mcard[i]) {
					a++;
				}
				if(card[9]==Mcard[i]) {
					a++;
				}
				if(card[12]==Mcard[i]) {
					a++;
				}
				ans[i]=	a;
	    		
	    	}
			
		}
		int max=ans[0];
		for(int i=0;i<Mcards.length();i++) {
			if(max<ans[i]) {
				max=ans[i];
			}
		}
		System.out.println(max);
		
		
	}

}
