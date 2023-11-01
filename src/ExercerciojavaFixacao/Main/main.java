package ExercerciojavaFixacao.Main;

import ExercerciojavaFixacao.entidades.*;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

public class main {
    public static void main(String[] args) throws ParseException {
        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        SimpleDateFormat sdf1 = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
        System.out.println("Enter client data");
        System.out.print("Name:");
        String name = sc.nextLine();
        System.out.print("email: ");
        String email = sc.next();
        System.out.print("Birth date(DD/MM/YYYY): ");
        Date dateBirth = sdf.parse(sc.next());

        Cliente c1 = new Cliente(name, email, dateBirth);

        System.out.println("Enter order data:");
        System.out.print("Status:");
        String status = sc.next();

        Order order = new Order(new Date() ,OrderStatus.valueOf(status),c1);


        System.out.print("how many items to this order: ");
        int quantity = sc.nextInt();
        Product p1 = null;
        for (int i = 0; i < quantity; i++) {
            System.out.println("Enter #" + (i + 1) + "item data: ");
            System.out.print("Product name: ");
            String nameProduct = sc.next();
            System.out.print("Product price :");
            Double priceProduct = sc.nextDouble();

            Product product = new Product(nameProduct, priceProduct);

            System.out.print("Quantity: ");
            int quantityProduct = sc.nextInt();


            OrderItem orderItem = new OrderItem(quantityProduct,priceProduct,product);
            order.addItem(orderItem);

        }



        System.out.println("Order summary");
        System.out.println("Order moment :" + order.getMoment());
        System.out.println("order status: " + OrderStatus.valueOf(status));
        System.out.println("Client :" + c1.getNome() + " " + dateBirth + " " + c1.getEmail());
        System.out.println("Order items:");

        System.out.println(order.getOrderItemList());

        sc.close();
    }
}
