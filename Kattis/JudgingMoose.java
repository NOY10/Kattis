package Kattis;
import java.util.Scanner;

public class JudgingMoose {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int b = in.nextInt();
        if(a == 0 && b == 0) {
        	System.out.println("Not a moose");
        }
        else if(a == b) {
        	System.out.println("Even " + (2 * a));
        }
        else {
            int max = Math.max(a, b) * 2;
            System.out.println("Odd " + max);
        }
    }
}