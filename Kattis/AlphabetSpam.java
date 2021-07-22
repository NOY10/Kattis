package Kattis;

import java.util.Scanner;

public class AlphabetSpam {
    public static void main(String[] args) {
        Scanner obj=new Scanner(System.in);
        String nam=obj.nextLine();
        int cap=0,sam=0,spa=0,spe=0;
        char[] arr=nam.toCharArray();
        int[] arr1=new int[nam.length()];
        for(int i=0;i<nam.length();i++){
            arr1[i]=arr[i];
        }
        for(int i=0;i<nam.length();i++){
           if(65<=arr1[i]&&90>=arr1[i]){
               cap++;
           }
           else if(97<=arr1[i]&&122>=arr1[i]){
               sam++;
           }
           else if(arr[i]==95){
               spa++;
           }
           else{
               spe++;
           }

        }
        double C=(double)cap/nam.length();
        double S=(double)sam/nam.length();
        double Sp=(double)spa/nam.length();
        double Spec=(double)spe/nam.length();
        System.out.println(Sp);
        System.out.println(S);
        System.out.println(C);
        System.out.println(Spec);
    }
}
