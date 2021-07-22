package Kattis;

import java.util.Scanner;

public class Reversed_binary_Numbers {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        int n = 0, i, decimal = 0;
        int num = obj.nextInt();
        int num1 = num;
        while (num > 0) {
            num = num / 2;
            n++;
        }
        int[] arr = new int[n];
        while (num1 != 0) {
            for (i = 0; i < n; i++) {
                int y = num1 % 2;
                arr[i] = y;
                num1 = num1 / 2;
            }

        }
        int l = n - 1;
        for (i = 0; i < n; i++) {
            decimal += arr[i] * Math.pow(2, l);
            l--;
        }
        System.out.println(decimal);

    }
}
