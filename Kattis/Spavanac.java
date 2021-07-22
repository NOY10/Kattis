package Kattis;

import java.util.Scanner;

public class Spavanac {
    public static void main(String[] args) {
        Scanner obj=new Scanner(System.in);
        int num=obj.nextInt();
        int num1=obj.nextInt();
        if(num==0){
            num=24;
        }
        if(num1>=45){
            int sub=num1-45;
            System.out.println(num+" "+sub);
        }
        else {
            int min=num1+15;
            System.out.println(num-1+" "+min);
        }
    }
}
