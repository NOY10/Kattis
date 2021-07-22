package Kattis;

import java.util.Scanner;

public class stopwatch {

	public static void main(String[] args) {
		Scanner obj=new Scanner(System.in);
		int N=obj.nextInt();
		int[] N1=new int[N];
		for(int i=0;i<N;i++) {
			 N1[i]=obj.nextInt();
		}
		int even=0;
		int odd=0;
		int mol=N%2;
		if(mol==0) {
			for(int j=0;j<N;j++) {
			int mo=j%2;
			  if(mo==0) {
				  even=N1[j]+even;
				
				
		   }
			  else {
				  odd=N1[j]+odd;
			  }
		}
			int ans=odd-even;
            System.out.println(ans);
			
		}
		else {
			 System.out.print("still running");
		}
	

	}

}
