package Kattis;

import java.util.Scanner;

public class Transit_Woes {
    public static void main(String[] args) {
        Scanner obj=new Scanner(System.in);
        int s=obj.nextInt();
        int t=obj.nextInt();
        int n=obj.nextInt();
        int[] num=new int[n+1];
        int[] bi=new int[n+1];
        int[] ci=new int[n];
        int[] sum=new int[n];
        int sume=0;
        for(int i=0;i<=n;i++){
            num[i]=obj.nextInt();
        }
        for(int i=0;i<n;i++){
            bi[i]=obj.nextInt();
        }
        for(int i=0;i<n;i++){
            ci[i]=obj.nextInt();
        }
        for(int j=0;j<n;j++){
            sum[j] = Math.max(num[j], ci[j]);
        }
        int Tot;
        for(int i=0;i<n;i++){
            sume=sume+sum[i]+bi[i];
        }
        Tot=sume+num[n]+s;
        if(t>=Tot){
         System.out.println("yes");
     }
     else {
         System.out.println("no");
     }

    }
}
