package Kattis;

import java.util.Scanner;

public class modulo {

	public static void main(String[] args) {
		Scanner obj=new Scanner(System.in);
		int[] num=new int[10];
		int[] ans=new int[10];
	    int c=0;
		for(int i=0;i<10;i++) {
			num[i]=obj.nextInt();
		}
      for(int i=0;i<10;i++) {
    	  ans[i]=num[i]%42;
      }
      for(int k=0;k<10;k++) {
    	  for(int j=k+1;j<10;j++) {
    		  if(ans[k]==ans[j]) {
    			  c++; 
    			  break;
    		  } 
    	 }
    	  
      }
      System.out.println(10-c);
	}

}
