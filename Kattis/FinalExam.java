package Kattis;

import java.util.Scanner;

public class FinalExam {

	public static void main(String[] args) {
		Scanner obj=new Scanner(System.in);
		int num=Integer.parseInt(obj.nextLine());
		String[] arr=new String[num];
		for(int i=0;i<num;i++) {
			arr[i]=obj.nextLine();
		}
		int j=0;
		for(int i=0;i<num-1;i++) {
			if(arr[i].equals(arr[i+1])) {
				j++;
			}
		}
		System.out.println(j);

	}

}
