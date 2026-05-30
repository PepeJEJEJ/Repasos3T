import java.util.*;

public class inventari {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        HashMap<String, Integer> Productos = new HashMap<>();
        try {
            int i = 0;
            do {
                System.out.println("Dame el nombre del producto");
                String nombre = sc.nextLine();
                System.out.println("Dame su Stock");
                int Stock = sc.nextInt();
                Productos.put(nombre, Stock);
                sc.nextLine();
                i += 1;
                System.out.println("Producto numero: " + i);
            } while (i < 5);
            System.out.println("Dame el nombre del producto al cual actualizaremos su stock");
            String nombre = sc.nextLine();
            System.out.println("Ponle un nuevo stock");
            int NStock = sc.nextInt();
            if (Productos.containsKey(nombre)) {
                Productos.put(nombre, NStock);
                System.out.println(nombre + " Actualizado");
            } else {
                System.out.println("No existe eso");
            }

        } catch (Exception e) {
            System.out.println(e);
        }
    }
}