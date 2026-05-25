import java.util.ArrayList;
import java.util.Scanner;

public class ExamenB7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<String> pleilist = new ArrayList<>(); // usar genéricos tal como indica el PDF
        boolean finprograma = false;

        while (!finprograma) {
            // Mostrar menú para que el usuario sepa las opciones
            System.out.println("\nElige una opcion:");
            System.out.println("1 - Añadir canción");
            System.out.println("2 - Buscar canción");
            System.out.println("3 - Eliminar canción");
            System.out.println("4 - Número de canciones");
            System.out.println("5 - Mostrar todas las canciones");
            System.out.println("6 - Resumen (estado)");
            System.out.println("7 - Borrar playlist");
            System.out.println("8 - Salir");
            System.out.print("Opción: ");

            String linea = sc.nextLine();
            int opcion;
            try {
                opcion = Integer.parseInt(linea.trim());
            } catch (NumberFormatException nfe) {
                System.out.println("Opción no válida. Introduce un número.");
                continue;
            }

            try {
                switch (opcion) {
                    case 1: // Añadir canción
                        System.out.print("Cancion a añadir: ");
                        String nombre = sc.nextLine().trim();
                        if (nombre.isEmpty()) {
                            System.out.println("Nombre vacío. No se añade.");
                        } else {
                            pleilist.add(nombre);
                            System.out.println("Añadida: " + nombre);
                        }
                        break;

                    case 2: // Buscar canción
                        System.out.print("Buscar Cancion: ");
                        String esta = sc.nextLine().trim();
                        if (pleilist.contains(esta)) {
                            System.out.println("SÍ está en la playlist");
                        } else {
                            System.out.println("NO está en la playlist");
                        }
                        break;

                    case 3: // Eliminar canción por valor
                        System.out.print("Cancion para borrar: ");
                        String borrar = sc.nextLine().trim();
                        if (pleilist.isEmpty()) {
                            System.out.println("La playlist está vacía.");
                        } else {
                            boolean removed = pleilist.remove(borrar); // remove(Object)
                            if (removed) {
                                System.out.println("Canción borrada: " + borrar);
                            } else {
                                System.out.println("La canción no existe en la playlist.");
                            }
                        }
                        break;

                    case 4: // Número de canciones
                        System.out.println("Estado de las rolas: " + pleilist.size());
                        break;

                    case 5: // Mostrar todas las canciones
                        if (pleilist.isEmpty()) {
                            System.out.println("La playlist está vacía.");
                        } else {
                            System.out.println("Contenido de la playlist:");
                            for (int i = 0; i < pleilist.size(); i++) {
                                System.out.println((i + 1) + ". " + pleilist.get(i));
                            }
                        }
                        break;

                    case 6: // Resumen: número y listado breve
                        System.out.println("Hay " + pleilist.size() + " canción(es).");
                        if (!pleilist.isEmpty()) {
                            System.out.println("Nombres:");
                            for (String s : pleilist) {
                                System.out.println("- " + s);
                            }
                        }
                        break;

                    case 7: // Borrar playlist
                        pleilist.clear(); // forma correcta y eficiente de vaciar la lista
                        System.out.println("Playlist borrada.");
                        break;

                    case 8: // Salir
                        System.out.println("Saliendo...");
                        finprograma = true;
                        break;

                    default:
                        System.out.println("No Se.");
                        break;
                }
            } catch (Exception e) {
                // Manejar excepciones inesperadas sin cerrar el programa
                System.out.println("Error inesperado: " + e.getMessage());
            }
        }

        sc.close();
    }
}
