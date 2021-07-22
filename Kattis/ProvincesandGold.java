package Kattis;

import java.util.Scanner;

public class ProvincesandGold {

	public static void main(String[] args) {
		Scanner obj=new Scanner(System.in);
		int gold=obj.nextInt();
		int silver=obj.nextInt();
		int copper=obj.nextInt();
		
		int a=gold*3;
		int b=silver*2;
		int c=copper*1;
        int sum=a+b+c;
        if(sum >= 8) System.out.println("Province or Gold");
        else if(sum >= 6) System.out.println("Duchy or Gold");
        else if(sum >= 5) System.out.println("Duchy or Silver");
        else if(sum >= 3)System. out.println("Estate or Silver");
        else if(sum >= 2) System.out.println("Estate or Copper");
        else System.out.println("Copper");
	}

}
