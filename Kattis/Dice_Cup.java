package Kattis;

import java.util.Scanner;

public class Dice_Cup {
    public static void main(String[] args) {
        Scanner obj= new Scanner(System.in);
        int M=obj.nextInt();
        int N=obj.nextInt();
        if(M>N){
            do{
                N++;
                System.out.println(N);
            }while (N<=M);
        }
        else {
            do{
                M++;
                System.out.println(M);
            }while (N>=M);
        }

    }
}
