package Kattis;

import java.util.Scanner;

public class Bela {
    public static void main(String[] args) {
        Scanner obj=new Scanner(System.in);
        int num=obj.nextInt();
        String[] dom=obj.nextLine().split(" ");
        String dom1=dom[1];
        int tot=0;
        for(int i=0;i<num*4;i++){
            String name=obj.nextLine();
            String arr[]=name.split("");
            
            if(arr[0].equals("A")) {
            	tot+=11;
            }
        	 else if(arr[0].equals("9")&&arr[1].equals(dom1)){
        		tot+=14;
             	continue;
             }
        	 else if(arr[1].equals(dom1)&&arr[0].equals("J")) {
            		tot+=20;
            		continue;
            	}
            else if(arr[0].equals("K")){
            	tot+=4;
            }
            else if(arr[0].equals("Q")){
            	tot+=3;
            }
            else if(arr[0].equals("J")){
            	tot+=2;
            }
            else if(arr[0].equals("T")){
            	tot+=10;
            }
            else if(arr[0].equals("9")){
            	tot+=0;
            }
             
        }
        System.out.println(tot);
     
    }
}
