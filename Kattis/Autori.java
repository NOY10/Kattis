package Kattis;

import java.util.Scanner;

public class Autori {
    public static void main(String[] args) {
        Scanner obj=new Scanner(System.in);
        char[] L= {'-'};



        String nam=obj.nextLine();
        char[] cr=nam.toCharArray();
        System.out.print(cr[0]);
        for(int i=0;i<nam.length();i++){

            if(cr[i]==L[0]){
              System.out.print(cr[i+1]);
            }
        }
    }

}
