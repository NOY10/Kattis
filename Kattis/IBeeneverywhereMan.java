package Kattis;

import java.util.Scanner;

public class IBeeneverywhereMan {

	public static void main(String[] args) {
		Scanner obj=new Scanner(System.in);
		int i,j,m;
		int num=Integer.parseInt(obj.nextLine());
		int[] ans=new int[num];
		
		for(m=0;m<num;m++) {
			
			int c=0;
			
			int num1=Integer.parseInt(obj.nextLine());
			String[] arr=new String[num1];
			
			for(j=0;j<num1;j++) {
			 arr[j]=obj.nextLine();
			}
			
			for( i=0;i<num1;i++) {
				int k=i+1;
				for(j=k;j<num1;j++) {
					if(arr[i].equals(arr[j])) {
						c++;
						break;
					}
				}
			}
			
			ans[m]=num1-c;
			
		
		}
		for(m=0;m<num;m++) {
			System.out.println(ans[m]);
		}

		
		

	}

}
