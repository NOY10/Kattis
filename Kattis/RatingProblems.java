package Kattis;

import java.util.Scanner;

public class RatingProblems {

	public static void main(String[] args) {
		Scanner obj=new Scanner(System.in);
		int n,k;
		n=obj.nextInt();
		k=obj.nextInt();
		int[] K1=new int[k];
		for(int i=0;i<k;i++) {
			K1[i]=obj.nextInt();
		}
		int s=0;
		for(int i=0;i<k;i++) {
			s=s+K1[i];
		}
		
		int[] num= {-3,3};
		for(int j=0;j<2;j++) {
			float s1=s;
		   for(int i=0;i<n-k;i++) {
		   s1=s1+num[j];
			}
		   float avg=s1/n;
		   System.out.println(avg);
		}
		
	}

}
