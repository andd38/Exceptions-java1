package OOPExercicios;


import OOPExercicios.Entidades.Employee;
import OOPExercicios.Entidades.OutsourceEmployee;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);
        List <Employee> list = new ArrayList<>();
        System.out.println("Enter the number of employees");
        int n = sc.nextInt();


        for (int i = 0; i < n; i++) {
            System.out.println("Employee #" + (i + 1) + " data: ");

            System.out.print("Outsourced (y/n)");
            String outoured = sc.next();
            System.out.print("Name: ");
            String name = sc.next();
            System.out.print("Hours: ");
            int hours = sc.nextInt();
            System.out.print("Value per hour: ");
            Double valueperhour = sc.nextDouble();
            if (Objects.equals(outoured, "y")) {
                System.out.print("Additional charge :");
                Double addCharge = sc.nextDouble();

                list.add(new OutsourceEmployee(name, hours,valueperhour,addCharge));

            } else{

                list.add(new Employee(name, hours, valueperhour));

            }

        }

        System.out.println("Payments:");
        for (Employee emp:list) {
            System.out.println(emp.getName()+" - " +emp.payment());
        }
        sc.close();
    }


}
