//package Kattis;
//
//import java.util.Arrays;
//import java.util.Scanner;
//
//public class Twofour {
//    public static int[][] rot(int[][] num){
//        int[][] rot=new int[4][4];
//        for (int i = 0; i < 4; i++)
//            for (int j = 0; j < 4; j++)
//                rot[3 - j][i] = num[i][j];
//            return rot;
//    }
//    public static void main(String[] args) {
//        Scanner obj=new Scanner(System.in);
//        int[][] num=new int[4][4];
//        for(int i=0;i<4;i++){
//            for(int j=0;j<4;j++){
//                num[i][j]=obj.nextInt();
//            }
//        }
//        int move=obj.nextInt();
//        for (int i = 0; i < move; i++){
//            num = rot(num);
//
//        }
////        for (int i = 0; i < 4; i++)
////            move(num[i]);
//
//        int[] sum={1,2,3};
//        for(int i=0;i<4;i++){
//            for(int j=0;j<3;j++) {
//                int L=sum[j];
//                if(num[i][L]==0){
//                    for (int k=sum[j]; k < 4; k++) {
//                        if (num[i][j] == num[i][k]) {
//                            num[i][j] *= 2;
//                            break;
//                        }
//                    }
//                }
//                if(num[i][j]==num[i][L]){
//                    num[i][j] *= 2;
//                    num[i][L]=0;
//
//                }
//
//            }
//        }
//        for(int i=0;i<4;i++){
//            for(int j=0;j<4;j++){
//                System.out.print(num[i][j]+" ");
//            }
//            System.out.println();
//        }
//   }
//
//}
