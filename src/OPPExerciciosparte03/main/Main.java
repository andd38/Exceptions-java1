package OPPExerciciosparte03.main;

import OPPExerciciosparte03.Entidades.Company;
import OPPExerciciosparte03.Entidades.Individual;
import OPPExerciciosparte03.Entidades.Person;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);
        List <Person> personList = new ArrayList<>();
        System.out.print("Enter the number of tax payers ");
        int n= sc.nextInt();
        for (int i = 0; i <n ; i++) {

            System.out.println("Tax payer #"+(i+1)+" data: ");
            System.out.print("Individual or company (c/i): ");
            String typePerson = sc.next();
            System.out.print("Name: ");
            String name = sc.next();
            System.out.print("Anual income:");
            Double AnualIncome = sc.nextDouble();

            if(Objects.equals(typePerson, "i")){
                System.out.print("Health expenditures: ");
                Double HelthExp = sc.nextDouble();
                personList.add(new Individual(name,AnualIncome,HelthExp));
            }
            else if(Objects.equals(typePerson, "c")){
                System.out.println("Number of employees");
                int numEmp = sc.nextInt();
                personList.add(new Company(name,AnualIncome,numEmp));
            }

        }
        double sum =0;
        System.out.println("Taxes paid: ");
        for (Person p :personList ) {
            double tax = p.Calculate();
            System.out.println(p.getName() +" : $ "+p.Calculate() );
            sum+=tax;
        }
        System.out.println();
        System.out.println("Total tax : $" +String.format("%.2f",sum));

        sc.close();

    }
}
