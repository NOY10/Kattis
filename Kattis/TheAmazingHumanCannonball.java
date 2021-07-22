package Kattis;

import java.util.Scanner;

public class TheAmazingHumanCannonball {
    public static void main(String[] args) {
        Scanner obj=new Scanner(System.in);
       double g=9.81;
        int num=obj.nextInt();
//        double[] arr=new double[num*5];
//        for(int i=0;i<num;i++){
//            for(int j=0;j<5;j++){
//                arr[j]=obj.nextDouble();
//
//            }
//        }
    for(int i=0;i<num;i++) {
        double v = obj.nextDouble();
        double D = obj.nextDouble();
        double x = obj.nextDouble();
        double h1 = obj.nextDouble();
        double h2 = obj.nextDouble();

        double L=x*Math.tan(Math.toRadians((D)))-(g*Math.pow(x,2)/(2*(Math.pow(v,2))*Math.pow(Math.cos(Math.toRadians(D)),2)));
        if(h2 - L>= 1&& L - h1 >= 1 ){
            System.out.println("Safe");
                }
            else {
                System.out.println("Not safe");
              }
        }

       }
    }

//        double D=45,h1=9,h2=12,x=20;
//        double g=9.81,y;

//        double[] ans= new double[num];
//        int x=2,D=1,v=0,h1=3,h2=4;
//            for(int j=0;j<num;j++){
//               ans[j]=arr[x]*Math.tan(Math.toRadians(arr[D]))-(g*Math.pow(arr[x],2)/(2*(Math.pow(arr[v],2))*Math.pow(Math.cos(Math.toRadians(arr[D])),2)));
//          System.out.println(ans[j]);
//            if(arr[h2] - ans[j] >= 1&& ans[j] - arr[h1] >= 1 ){
//                 System.out.println("Safe");
//
//                }
//            else {
//                System.out.println("Not safe");
//              }
//             v+=5;
//            D+=5;
//            x+=5;
//            h1+=5;
//            h2+=5;
//            }
//        //}
    //int v=19;
//        double D=45,h1=9,h2=12,x=20;
//        double g=9.81,y;
//        double L=x*Math.tan(Math.toRadians((D)))-(g*Math.pow(x,2)/(2*(Math.pow(v,2))*Math.pow(Math.cos(Math.toRadians(D)),2)));
//        System.out.println(L);
