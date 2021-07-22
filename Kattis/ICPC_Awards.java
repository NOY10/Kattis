package Kattis;

import java.util.Scanner;
import java.util.HashSet;

public class ICPC_Awards {
    public static void main(String[] args) {
     Scanner obj=new Scanner(System.in);
     HashSet<String> set=new HashSet<>();
     
     int num=Integer.parseInt(obj.nextLine());
     int c=0;
     for(int i=0;i<num;i++) {
    	 String[] nam=obj.nextLine().split(" ");
    		if(set.add(nam[0])) {
    			System.out.print(nam[0]+" "+nam[1]+"\n");
    			c++;
    		}
    		if(c==12) {
    			break;
    		}
    	 }
     obj.close();
    }
    
}
