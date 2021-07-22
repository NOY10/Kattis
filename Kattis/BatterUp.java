package Kattis;

import java.util.Scanner;

public class BatterUp {
    public static void main(String[] args) {
        Scanner obj=new Scanner(System.in);
        int num=obj.nextInt();
        int sum=0,L=0;
        int[] arr=new int[num];
        for(int i=0;i<num;i++){
            arr[i]=obj.nextInt();
        }
        for(int i=0;i<num;i++){
            if(arr[i]<0){
                continue;
            }
            L++;
            sum=sum+arr[i];
        }
        double Ans=sum/(double)L;
        System.out.print(Ans);


    }
}

