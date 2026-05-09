import java.util.HashMap;
import java.util.InputMismatchException;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;

public class Main {

    static HashMap<String, Integer> productos = new HashMap<>();

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        try {
            for (int i = 1; i <= 3; i++) {
                System.out.println("Nombre del producto " + i + ":");
                String nombre = sc.nextLine();

                System.out.println("Stock inicial:");
                int stock = sc.nextInt();
                sc.nextLine();
                productos.put(nombre, stock);
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        boolean sigue = true;

        while (sigue) {
            try {
                int opcion = sc.nextInt();
                sc.nextLine();

                switch (opcion) {

                    case 1:
                        System.out.println("Producto a actualizar:");
                        String prod = sc.nextLine();

                        if (!productos.containsKey(prod)) {
                            System.out.println("Ese producto no existe.");
                            break;
                        }

                        System.out.println("Cantidad a sumar/restar (ej: +5 o -3):");
                        int cantidad = sc.nextInt();
                        sc.nextLine();

                        actualizarStock(prod, cantidad);
                        break;

                    case 2:
                        for (int i = 0; i <= 3; i++) {

                        }
                        ;
                        break;

                    case 3:
                        sigue = false;
                        break;

                    default:
                        System.out.println("NEL");
                }

            } catch (InputMismatchException e) {
                System.out.println("Error");
                sc.nextLine();
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }
    }

    public static void actualizarStock(String producto, int cantidad) {
        int actual = productos.get(producto);
        int nuevo = actual + cantidad;

        if (nuevo < 0) {
            System.out.println("No se puede dejar stock negativo.");
        } else {
            productos.put(producto, nuevo);
            System.out.println("Stock actualizado. Nuevo stock de " + producto + ": " + nuevo);
        }
    }
}
