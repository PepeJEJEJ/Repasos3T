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
                i += 1;
            } while (i < 5);
            System.out.println("Dame algo en español");
            
            if (Productos.containsKey(Traducir)) {
                System.out.println(Productos.get(Traducir));
            } else {
                System.out.println("No sale");
            }
        } catch (Exception e) {
            System.out.println(e);
        }
    }
    public void name() {
        
    }
}