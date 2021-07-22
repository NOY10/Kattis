package Kattis;

import java.util.Scanner;

public class Hissing_Microphone {
    public static void main(String[] args) {
        Scanner obj=new Scanner(System.in);
        String nam=obj.nextLine();
        char[] nam1=nam.toCharArray();
        int s=0;
        for(int i=0;i<nam.length()-1;i++){
            if(nam1[i]=='s'){
                if(nam1[i+1]=='s'){
                   s++;
                }
            }
        }
        if(s>0){
            System.out.println("hiss");
        }
        else {
            System.out.println("no hiss");
        }
    }
}
