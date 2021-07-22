package Kattis;

import java.util.Scanner;

public class Trik {
    public static void main(String[] args) {
        Scanner obj=new Scanner(System.in);
        String nam=obj.nextLine();
        char[] name=nam.toCharArray();
        int t=1;
        for(int i=0;i<nam.length();i++) {
            if (name[i] == 'A') {
                if (t == 1) {
                    t = 2;
                } else if (t == 2) {
                    t = 1;
                } else {
                    t = 3;
                }
            } else if (name[i] == 'B') {
                if (t == 2) {
                    t = 3;
                } else if (t == 3) {
                    t = 2;
                } else {
                    t = 1;
                }
            }
            else {
                if (t == 1) {
                    t = 3;
                } else if (t == 3) {
                    t = 1;
                } else {
                    t = 2;
                }
            }
        }

            System.out.println(t);
    }
}
