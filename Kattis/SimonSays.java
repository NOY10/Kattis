package Kattis;

import java.util.Scanner;

public class SimonSays {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num=Integer.parseInt(sc.nextLine());
        for(int i=0;i<num;i++){
            String nam=sc.nextLine();
            if(nam.startsWith("Simon says")){
                System.out.println(nam.substring(10));
            }
        }
    }
}