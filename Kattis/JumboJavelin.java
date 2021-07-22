package Kattis;

import java.util.Scanner;

public class JumboJavelin {

	public static void main(String[] args) {
	Scanner obj=new Scanner(System.in);
	int num=obj.nextInt();
	int[] arr=new int[num];
    for(int i=0;i<num;i++) {
    	arr[i]=obj.nextInt();
    }
    int s=0;
    for(int i=0;i<num;i++) {
    	s=s+arr[i];
    	
    } 
    int ans=num-1;
    System.out.println(s-ans);
	}

}
