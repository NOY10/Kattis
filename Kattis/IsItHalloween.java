package Kattis;

import java.util.Scanner;

public class IsItHalloween {
    public static void main(String[] args) {
        Scanner obj=new Scanner(System.in);
       String mon=obj.nextLine();
        if(mon.equals("OCT 31")||mon.equals("DEC 25")){
            System.out.println("yup");
        }
        else {
            System.out.println("nope");
        }
    }
}
