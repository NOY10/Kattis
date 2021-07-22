package Kattis;

import java.util.Scanner;

public class Oddities {
    public static void main(String[] argus){
        Scanner obj=new Scanner(System.in);
        int num=obj.nextInt();
        int[] arr=new int[num];
        for(int i=0;i<num;i++){
            arr[i]=obj.nextInt();
        }
        for(int i=0;i<num;i++){
            if(arr[i]%2==0){
                System.out.println(arr[i]+" is even");
            }
            else {
                System.out.println(arr[i]+" is odd");
            }
        }
        obj.close();

    }
}
