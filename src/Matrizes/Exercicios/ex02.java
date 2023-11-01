package Matrizes.Exercicios;

import java.util.Scanner;

public class ex02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Quantidade de lihas:");
        int m = sc.nextInt();
        System.out.println("quantidade de colunas:");
        int n = sc.nextInt();
        int [][]array = new int[m][n];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {

                   array[j][i]=sc.nextInt();

            }
        }

        int x = sc.nextInt();


        for (int i = 0; i < array.length ; i++) {
            for (int j = 0; j <array[i].length ; j++) {
               if(array[i][j] == x){
                   System.out.println("Position : "+ i + "," + j +":");
                   if(j>0){
                       System.out.println("Left "+ array[i][j-1]);
                   }
                   if(i>0 ){
                       System.out.println("up" + array[i-1][j]);
                   }
                   if(j< array[i].length-1){
                       System.out.println("right :" + array[i][j+1]);
                   }
                   if(i< array.length -1){
                       System.out.println("Down"+ array[i+1][j] );
                   }
               }
            }
        }




        sc.close();
    }
}
