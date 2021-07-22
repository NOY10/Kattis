package Kattis;

import java.util.Scanner;

public class quickEstimates {

	public static void main(String[] args) {
		Scanner obj=new Scanner(System.in);
		int num=obj.nextInt();
		String[] arr=new String[num];
		for(int i=0;i<num;i++) {
			arr[i]=obj.next();
		}
		
		for(int i=0;i<num;i++) {
			System.out.println(arr[i].length());

			}
		obj.close();
		
	}

}
