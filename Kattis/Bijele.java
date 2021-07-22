package Kattis;

import java.util.Scanner;

public class Bijele {
    public static void main(String[] argus){
        Scanner obj=new Scanner(System.in);
        int[] num=new int[6];
        for(int i=0;i<6;i++){
            num[i]=obj.nextInt();
        }
        for(int i=0;i<2;i++){
        if(num[i]==0) {
            System.out.println("1");
        }
        else if (num[i] > 1) {
                int d = 1 - num[i];
                System.out.println(d);

            } else {
                System.out.println("0");
            }
        }
        for(int i=2;i<5;i++) {
            if (num[i] == 0) {
                System.out.println("2");
            } else if (num[i] > 2) {
                int d = 2 - num[i];
                System.out.println(d);
            } else {
                int d = 2 - num[i];
                System.out.println(d);
            }
        }
        for(int i=5;i<6;i++) {
            if (num[i] == 0) {
                System.out.println("8");
            } else if (num[i] > 8) {
                int d = 8 - num[i];
                System.out.println(d);
            } else {
                int d = 8 - num[i];
                System.out.println(d);
            }
        }
    }
}
