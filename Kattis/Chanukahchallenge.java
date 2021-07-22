package Kattis;

import java.util.Scanner;

public class Chanukahchallenge {
    public static void main(String[] args) {
        Scanner obj=new Scanner(System.in);
        int num=obj.nextInt();
        int[] arr=new int[num*2];
        int[] sto=new int[num];
        for(int i = 0; i<num*2; i++){
            arr[i]=obj.nextInt();
        }
        int j=1;
        for(int i=0;i<num;i++) {
                sto[i] = arr[j];
              j+=2;
            }
        for(int i = 0; i<num; i++){
            int L=0; int l=1,T=0;
            do{
                L=L+l+1;
                l++;
            }while (l<=sto[i]);
            System.out.println((i+1)+" "+L);
        }

    }
}
