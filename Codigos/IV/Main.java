import java.util.HashMap;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

    static HashMap<String, Integer> productos = new HashMap<>();

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        try {
            for (int i = 1; i <= 3; i++) {
                System.out.println("Producto " + i + ":");
                String nombre = sc.nextLine();

                System.out.println("Stock Al Inicio:");
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
                        System.out.println("Producto que vamos a actualizar:");
                        String prod = sc.nextLine();

                        if (!productos.containsKey(prod)) {
                            System.out.println("Eso no existe.");
                            break;
                        }

                        System.out.println("Cantidad a sumar o restar (+5 o -8):");
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
            System.out.println("Stock negativo???????.");
        } else {
            productos.put(producto, nuevo);
            System.out.println("El Stock esta Actualizado. El Nuevo stock de " + producto + " es: " + nuevo);
        }
    }
}
