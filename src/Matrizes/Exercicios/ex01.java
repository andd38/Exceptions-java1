package Matrizes.Exercicios;

import java.util.Scanner;

public class ex01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Qual vai ser o tamanho da array?");
        int n = sc.nextInt();
        int[][] array = new int[n][n];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j <n ; j++) {
                array[i][j] = sc.nextInt();
            }
        }

        sc.close();
        System.out.printf("Main diagonal: "+ array[0][0]+" "+array[1][1]+" "+array[2][2]);

        int count = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if(array[i][j]<0){
                    count++;
                }
            }
        }
        System.out.println("\n Negative numbers"+ count);


    }
}
