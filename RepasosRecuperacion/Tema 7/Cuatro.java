import java.util.*;

public class Cuatro {

    static HashMap<String, Integer> inventario = new HashMap<>();

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        try {
            for (int i = 1; i <= 3; i++) {
                System.out.println("Nombre del producto " + i + ":");
                String nombre = sc.nextLine();

                System.out.println("Stock inicial:");
                int stock = sc.nextInt();
                sc.nextLine();

                inventario.put(nombre, stock);
            }

            boolean seguir = true;

            while (seguir) {
                System.out.println("MENÚ");
                System.out.println("1. Actualizar stock");
                System.out.println("2. Mostrar inventario");
                System.out.println("3. Salir");
                System.out.print("Opción: ");

                int opcion = sc.nextInt();
                sc.nextLine();

                switch (opcion) {

                    case 1:
                        System.out.println("Producto a actualizar:");
                        String prod = sc.nextLine();

                        if (!inventario.containsKey(prod)) {
                            System.out.println("Ese producto no existe.");
                            break;
                        }

                        System.out.println("Cantidad a sumar/restar (ej: +5 o -3):");
                        int cantidad = sc.nextInt();
                        sc.nextLine();

                        actualizarStock(prod, cantidad);
                        break;

                    case 2:
                        mostrarInventario();
                        break;

                    case 3:
                        seguir = false;
                        System.out.println("Saliendo...");
                        break;

                    default:
                        System.out.println("Opción no válida.");
                }
            }

        } catch (InputMismatchException e) {
            System.out.println("Error: introduce un número válido.");
        } catch (Exception e) {
            System.out.println("Error inesperado: " + e.getMessage());
        }
    }

    public static void actualizarStock(String producto, int cantidad) {
        int actual = inventario.get(producto);
        int nuevo = actual + cantidad;

        if (nuevo < 0) {
            System.out.println("No se puede dejar stock negativo.");
        } else {
            inventario.put(producto, nuevo);
            System.out.println("Stock actualizado. Nuevo stock de " + producto + ": " + nuevo);
        }
    }

    public static void mostrarInventario() {
        System.out.println("INVENTARIO COMPLETO:");

        Iterator<Map.Entry<String, Integer>> it = inventario.entrySet().iterator();

        while (it.hasNext()) {
            Map.Entry<String, Integer> entrada = it.next();
            System.out.println("Producto: " + entrada.getKey() + " | Stock: " + entrada.getValue());
        }
    }
}
