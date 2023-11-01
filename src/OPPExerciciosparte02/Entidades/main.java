package OPPExerciciosparte02.Entidades;

import OPPExerciciosparte02.Main.ImportedProduct;
import OPPExerciciosparte02.Main.Product;
import OPPExerciciosparte02.Main.UsedProduct;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

public class main {
    public static void main(String[] args) throws ParseException {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        List<Product> list= new ArrayList<>();
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");


        System.out.println("Enter the number of product: ");
        int n = sc.nextInt();
        for (int i = 0; i <n ; i++) {
            System.out.println("Product # "+(1+i)+"data");
            System.out.print("Common ,used or imported (c/u/i)? ");
            String typeProduct = sc.next();
            System.out.print("Name: ");
            String name = sc.next();
            System.out.println("Price");
            Double price = sc.nextDouble();
            if(Objects.equals(typeProduct, "c")){
                list.add(new Product(name,price) );

            } else if(Objects.equals(typeProduct, "u")){
                System.out.print("Manufacture date(DD/MM/YYYY): ");
                Date data = sdf.parse(sc.next());
                list.add(new UsedProduct(name,price,data));
            } else if(Objects.equals(typeProduct,"i")){
                System.out.print("Customs fee:");
                Double customsFee = sc.nextDouble();
                list.add(new ImportedProduct(name,price,customsFee));
            }
            System.out.println();
            System.out.println("Price Tags: ");
            for (Product product: list) {
                System.out.println(product.getName() +" "+ product.getPrice()+" " +product.priceTag());
            }

        }
    }
}
