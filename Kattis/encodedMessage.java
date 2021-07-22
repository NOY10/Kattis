package Kattis;
import java.util.Scanner;

public class encodedMessage {

	public static void main(String[] args) {
		Scanner obj=new Scanner(System.in);
		int num=Integer.parseInt(obj.nextLine());
		
		for(int t=0;t<num;t++) {
			String nam=obj.nextLine();
			int L=(int) Math.sqrt(nam.length());

			char[][] arr=new char[L][L];
			int offset = 0;
			
			for(int i=0;i<L;i++) {
				for(int j=0;j<L;j++) {
					arr[i][j]=nam.charAt(offset++);
				}
			}
			for(int i=L-1;0<=i;i--) {
				for(int j=0;j<L;j++) {
					System.out.print(arr[j][i]);
					
				}
			}
			System.out.print("\n");
			
			
		}
		

	}

}
