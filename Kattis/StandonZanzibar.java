package Kattis;

import java.util.Scanner;

public class StandonZanzibar {
    public static void main(String[] args) {
    Scanner obj=new Scanner(System.in);
    int num=Integer.parseInt(obj.nextLine());
    int[] app=new int[1000];
    for(int i=0;i<num;i++) {
    	int j=0;
    	do {
    		app[j]=obj.nextInt();
    		j++;
    	}while(app[j-1]!=0);
    	int[] ans=new int[j-1];
    	for(int t=0;t<j-2;t++) {
    		ans[t]=app[t]-1;
    	}
    	int ans1=app[j-2]-j+1;
    	for(int t=0;t<j-1;t++) {
    		ans1=ans1-ans[t];
    		}
    	if(ans1<0) {
    		System.out.println("0");
    	}else {
    		System.out.println(ans1);
    	}
    	    	
    	
    }
    
   }
}
