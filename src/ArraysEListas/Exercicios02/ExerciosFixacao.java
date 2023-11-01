package ArraysEListas.Exercicios02;

import java.util.Locale;
import java.util.Scanner;

public class ExerciosFixacao {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Locale.setDefault(Locale.US);
        System.out.println("Quantas pessoas serao adicionadas");
        int n = sc.nextInt();

        String[] nome = new String[n];
        String[]email = new String[n];
        int []room = new int[n];

        for (int i = 0; i < n; i++) {
            System.out.println("Rent#"+ (i+1));
            System.out.println("Nome:");
            nome[i]= sc.next();
            System.out.println("email");
            email[i]= sc.next();
            System.out.println("room");
            room[i] = sc.nextInt();

        }

        System.out.println("Busy room:");
        for (int i = 0; i <n ; i++) {
            System.out.println(room[i] + ": "+ nome[i] +" ,"+ email[i]);

        }
    }
}
