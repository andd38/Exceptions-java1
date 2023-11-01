package ArraysEListas.Exercicios;

import java.util.Scanner;

public class Ex02java {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("quantas pessoas serao digitas");
        int n = sc.nextInt();

        String[] nomes = new String[n];
        int [] idades = new int[n];
        double [] alturas = new double[n];

        for (int i = 0; i < n; i++) {
            System.out.println("Dados da "+(i+1)+"a pessoa");
            System.out.println("Nome : ");
            nomes[i] = sc.next();
            System.out.println("Idades");
            idades[i] = sc.nextInt();
            System.out.println("altura");
            alturas[i] = sc.nextDouble();
        }
        double soma = 0.0;
        for (int i = 0; i <n ; i++) {
            soma = soma+ alturas[i];

        }
        double mediaAltura= soma /n;

        System.out.printf("ALtura media %.2f%n", mediaAltura);

        int cont = 0 ;
        for (int i = 0; i < n; i++) {
            if(idades[i] < 16){
                cont ++;
            }
        }
        double percent = cont * 100.0/n;
        System.out.printf("Pessoas com menos de 16 anos: %.1f%%%n",percent);
        for (int i = 0; i < n; i++) {
           if(idades[n]<16){
               System.out.println(nomes[i]);
           }
        }
        sc.close();



















































    }
}



























































