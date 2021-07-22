package Kattis;

import java.util.Scanner;

public class forcedChoice {

	public static void main(String[] args) {
		Scanner obj=new Scanner(System.in);
		int C=obj.nextInt();
		int G=obj.nextInt();
		int T=obj.nextInt();
        for(int i=0;i<T;i++) {
        	int num=obj.nextInt();
        	int[] arr=new int[num];
        	for(int j=0;j<num;j++) {
        		arr[j]=obj.nextInt();
        	}
        	int c=0;
        	for(int t=0;t<num;t++) {
        		if(arr[t]==G) {
        		c++;
        		}
             }
        	if(c>0) {
        		System.out.println("KEEP");
        	}
        	else {
        		System.out.println("REMOVE");
        	}
        	
        	
        }
	}

}
