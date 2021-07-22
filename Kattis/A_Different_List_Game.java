//package Kattis;
//
//import java.util.Scanner;
//
//public class A_Different_List_Game {
//    public static int number(long X){
//        int c=0;
//        int factor = 2;
//        while(factor *factor<=X){
//            if(X%factor==0){
//                System.out.println(factor);
//                X/=factor;
////                if(X%factor==0){
////                    factor=same(factor);
////                    c++;
////                    continue;
////                }
//                c++;
//            }
//            else {
//                  factor++;
//            }
//        }
//        return c+1;
//    }
//    public static int same(int y){
//        return y*y;
//    }
//    public static void main(String[] args) {
//        Scanner obj=new Scanner(System.in);
//        long num=obj.nextLong();
//        System.out.println(number(num));
//    }
//}
