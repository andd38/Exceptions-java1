package ArraysEListas.Listas;


import java.util.ArrayList;
import java.util.List;

public class main {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(5);
        list.add(8);
        list.add(9);
        list.add(7);
        list.add(2,0);
        list.indexOf(9);
        list.remove(1);
        System.out.println(list.size());

        System.out.println("-----lista de elementos------");
        for (int obj : list) {
            System.out.println(obj);
        }

    }
}
