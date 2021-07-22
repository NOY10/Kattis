package Kattis;

import java.util.Scanner;

public class Number_Fun {
    public static void main(String[] args) {
        Scanner obj=new Scanner(System.in);
        StringBuilder K=new StringBuilder();
        int num=Integer.parseInt(obj.nextLine());

        for(int i=0;i<num;i++){
            float num1=obj.nextInt();
            float num2=obj.nextInt();
            float ans=obj.nextInt();
            int q=0;
            if(num2+num1==ans){
                q++;
            }
            if(num2-num1==ans){
                q++;
            }
            if(num2*num1==ans){
                q++;
            }
             if(num1/num2==ans){
                q++;
            }
             if(num2/num1==ans){
                q++;
            }
             if(num1-num2==ans){
                 q++;
             }
            K.append(q>0?"Possible\n":"Impossible\n");
        }
        System.out.println(K);

    }
}
