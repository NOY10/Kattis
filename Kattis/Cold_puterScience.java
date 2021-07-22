package Kattis;

import java.util.Scanner;

public class Cold_puterScience {
    public static void main(String[] args) {
        Scanner obj=new Scanner(System.in);
        int s=0;
        int num= obj.nextInt();
        int[] arr=new int[num];
        for(int i=0;i<num;i++){
            arr[i]=obj.nextInt();
        }
        for(int i=0;i<num;i++){
           if(arr[i]<0){
               s++;
           }
        }
        System.out.println(s);
    }
}
