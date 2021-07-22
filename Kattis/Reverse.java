package Kattis;

import java.util.Scanner;

public class Reverse {
    public static void main(String[] args) {
        Scanner obj=new Scanner(System.in);
        int num=obj.nextInt();
        int[] arr=new int[num];
        for(int i=0;i<num;i++){
            arr[i]=obj.nextInt();
        }
        for(int i=num-1;0<=i;i--){
            System.out.println(arr[i]);
        }
    }

}
