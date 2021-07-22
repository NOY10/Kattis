package Kattis;

import java.util.Scanner;

public class laptopsticker {

	public static void main(String[] args) {
	Scanner obj=new Scanner(System.in);
	int Wc=obj.nextInt();
	int Hc=obj.nextInt();
	int Ws=obj.nextInt();
	int Hs=obj.nextInt();

	if(Wc-1>Ws&&Hc-1>Hs) {
		System.out.print("1");
	}
	else {
		System.out.print("0");
	}

	}

}
