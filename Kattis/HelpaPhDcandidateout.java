package Kattis;

import java.util.Scanner;

public class HelpaPhDcandidateout {

	public static void main(String[] args) {
		Scanner obj=new Scanner(System.in);
	
		int num=Integer.parseInt(obj.nextLine());
		String[] arr=new String[num];
		for(int i=0;i<num;i++) {
			arr[i]=obj.nextLine();
		}
		
		for(int i=0;i<num;i++) {
			if(arr[i].equals("P=NP")) {
				System.out.println("skipped");
			}
			else {
				String arr2=arr[i].replace('+','-');
				String[] arr3=arr2.split("-");
				int num1=Integer.parseInt(arr3[0]);
    			int num2=Integer.parseInt(arr3[1]);
    			int sum=num1+num2;
    			System.out.println(sum);
			}
			
		}

	}

}
