import java.util.*;

public class Inventario {
    public static void main(String[] args) {
        HashMap<String, Integer> inventario = new HashMap<String, Integer>();
        Scanner sc = new Scanner(System.in);
        try {
            String nombre = "";
            int cantidad = 0;
            for (int i = 0; i < 3; i++) {
                System.out.println("Pon el nombre del Producto");
                nombre = sc.nextLine();
                System.out.println("Pon el stock del Producto");
                cantidad = sc.nextInt();
                sc.nextLine();
                inventario.put(nombre, cantidad);
            }
            System.out.println("");
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    public void actualizarStock() {
        Scanner sc = new Scanner(System.in);
        HashMap<String, Integer> inventario = new HashMap<String, Integer>();
        System.out.println("Pon el nombre del Producto");
        String nombre = sc.nextLine();
        System.out.println("Pon el nuevo stock del Producto");
        int nuevoStock = sc.nextInt();
        if (inventario.containsKey(nombre)) {
            inventario.put(nombre, nuevoStock);
        } else {
            System.out.println("NO EXISTE ESE PRODUCTO");
        }
    }
}
