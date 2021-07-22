package Kattis;

import java.util.Scanner;

public class Homework {
    public static void main(String[] args) {
    	Scanner obj=new Scanner(System.in);
    	String[] nam=obj.nextLine().split(";");
    	int c=0;
    	for(int i=0;i<nam.length;i++) {
    		String[] name=nam[i].split("-");
    		if(name.length==2) {
    			int num1=Integer.parseInt(name[0]);
    			int num2=Integer.parseInt(name[1]);
    		    do {
        			c++;
        			num1++;
        		}while(num1<=num2);
    		}
    		else {
    			c++;
    		}
    		
    		
    	}
    	System.out.println(c);
    	
       

    
    }
}


