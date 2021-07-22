package Kattis;

import java.util.Scanner;

public class JobExpenses {

	public static void main(String[] args) {
		Scanner obj=new Scanner(System.in);
		int num=obj.nextInt();
		int[] arr=new int[num];
		int[] ans=new int[num];
		for(int i=0;i<num;i++) {
			arr[i]=obj.nextInt();
		}
		for(int i=0;i<num;i++) {
			if(arr[i]<0) {
				ans[i]=arr[i]*-1;
			}
		}
		int s=0;
		for(int i=0;i<num;i++) {
			s=s+ans[i];
	   }
		System.out.println(s);
	}

}
