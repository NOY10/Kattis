package Kattis;

import java.util.Scanner;

public class sibice {

	public static void main(String[] args) {
		Scanner obj=new Scanner(System.in);
		int num=obj.nextInt();
		int[] arr=new int[num];
		int wid=obj.nextInt();
		int hig=obj.nextInt();
		int root=(int) Math.sqrt(Math.pow(wid, 2)+Math.pow(hig,2));
		for(int i=0;i<num;i++) {
			arr[i]=obj.nextInt();
		}
		for(int i=0;i<num;i++) {
			if(arr[i]>wid&&arr[i]>hig&&arr[i]>root) {
				System.out.println("NE");
			}
			else {
				System.out.println("DA");
			}
		}

	}

}
