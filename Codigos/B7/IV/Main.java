package IV;

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
                System.out.println("1 Producto que vamos a actualizar");
                System.out.println("2 Mostrar el inventario completo");
                System.out.println("Selecciona Opcion");
                int opcion = sc.nextInt();
                sc.nextLine();
                switch (opcion) {

                    case 1:
                        System.out.println("Producto que vamos a actualizar:");
                        String prod = sc.nextLine();

                        if (!productos.containsKey(prod)) {
                            System.out.println("Eso no existe.");
                        } else {
                            System.out.println("Cantidad a sumar o restar (+5 o -8):");
                            int cantidad = sc.nextInt();
                            sc.nextLine();

                            actualizarStock(prod, cantidad);
                        }

                        break;

                    case 2:
                        Iterator<Map.Entry<String, Integer>> it = productos.entrySet().iterator();
                        while (it.hasNext()) {
                            Map.Entry<String, Integer> producto = it.next();
                            System.out.println("Existencias del producto: "+producto.getKey() + ": " + producto.getValue());
                        }
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
