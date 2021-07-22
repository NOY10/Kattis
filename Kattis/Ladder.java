package Kattis;

import java.util.Scanner;

public class Ladder {
    public static void main(String[] args) {
        Scanner obj=new Scanner(System.in);
        int hig=obj.nextInt();
        int deg=obj.nextInt();
        double num=  hig/Math.sin(Math.toRadians(deg));
        System.out.println(Math.round(Math.ceil(num)));

    }
}
