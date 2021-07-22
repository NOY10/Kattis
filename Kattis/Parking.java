package Kattis;

import java.util.Scanner;

public class Parking {

	public static void main(String[] args) {
		Scanner obj=new Scanner(System.in);
		int temp;
		int num=obj.nextInt();
		for	(int i=0;i<num;i++) {
			int num1=obj.nextInt();
			int[] arr=new int[num1];
			int[] ans=new int[num1];
			for(int j=0;j<num1;j++) {
				arr[j]=obj.nextInt();
			}
			
			for(int j=0;j<num1;j++) {
				for(int k=j+1;k<num1;k++) {
					
					if(arr[j]>arr[k]) {
						temp=arr[j];
						arr[j]=arr[k];
						arr[k]=temp;
						}
					}
				}
			for(int j=num1-1;j>0;j--) {
				ans[j]=arr[j]-arr[j-1];																																																																																																																																																																																																																																																																																																																																																																																																		     														  	 															
				
			}
			int sum=0;
			for(int j=num1-1;j>0;j--) {
				sum=sum+ans[j];
				
			}
			System.out.println(sum*2);
		}

	}

}
