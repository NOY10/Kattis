package Kattis;

import java.util.Scanner;

public class Apaxiaaaaaaaaaaaans {
	public static int duplicate(char[] nam1,int n) {
		if(n==1||n==0) {
			return n;
		}
	    char[] temp = new char[n];  
	    int j = 0;  
	       for (int i=0; i<n-1; i++){  
	          if (nam1[i] != nam1[i+1]){  
	              temp[j++] = nam1[i];  
	              }  
        }  
	        temp[j++] = nam1[n-1];
	        for (int i=0; i<j; i++){  
	            nam1[i] = temp[i];  
	        }  
	        return j;  
		
	}

	public static void main(String[] args) {
		Scanner obj=new Scanner(System.in);
		String nam=obj.nextLine();
		char[] nam1=nam.toCharArray();
		int length=nam.length();
		length=duplicate(nam1,length);
		  for (int i=0; i<length; i++)  
	           System.out.print(nam1[i]);  
	    
	}

}
