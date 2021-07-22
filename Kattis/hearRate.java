package Kattis;

import java.util.Scanner;

public class hearRate {

	public static void main(String[] args) {
		Scanner obj=new Scanner(System.in);
		int num=obj.nextInt();
		double[] num1=new double[num*2];
		for(int i=0;i<num*2;i++) {
			num1[i]=obj.nextDouble();
			}
		for(int i=0;i<num*2;i++) {
			double bmp=(60*num1[i])/num1[i+1];
			double abpm=60/num1[i+1];
			System.out.printf("%.4f %.4f %.4f%n",bmp-abpm,bmp,bmp+abpm );
			i++;
			}
		

	}

}


