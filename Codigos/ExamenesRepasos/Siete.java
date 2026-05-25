/*Realiza un programa en Java que gestione una **playlist de canciones** utilizando un **ArrayList<String>** 
y un **menú interactivo por consola**. El programa debe permitir al usuario realizar las siguientes operaciones:

1. **Añadir canción**:  
   - Pedir el nombre de la canción.  
   - No permitir añadir nombres vacíos.

2. **Buscar canción**:  
   - Pedir un nombre y mostrar si existe o no en la playlist.

3. **Eliminar canción**:  
   - Pedir el nombre de la canción a borrar.  
   - Informar si la canción no existe.  
   - Si la playlist está vacía, avisar.

4. **Mostrar número de canciones**:  
   - Mostrar cuántas canciones contiene la playlist.

5. **Mostrar todas las canciones**:  
   - Listarlas con su número de orden.  
   - Si está vacía, avisar.

6. **Resumen del estado**:  
   - Mostrar cuántas canciones hay.  
   - Mostrar sus nombres en formato breve.

7. **Borrar playlist completa**:  
   - Vaciar el ArrayList por completo.

8. **Salir del programa**.

El menú debe repetirse hasta que el usuario elija la opción de salir.  
El programa debe manejar errores como entradas no numéricas y excepciones inesperadas sin cerrarse.*/

import java.util.*;

public class Siete {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<String> pleilist = new ArrayList<String>();
        boolean sigue = true;
        try {
            do {
                System.out.println("1 Añadir canción");
                System.out.println("2 Buscar canción");
                System.out.println("3 Eliminar canción");
                System.out.println("4 Mostrar número de canciones");
                System.out.println("5 Mostrar todas las canciones");
                System.out.println("6 Resumen del estado");
                System.out.println("7 Borrar playlist completa");
                System.out.println("8 Salir del programa");
                int opcion = Integer.parseInt(sc.nextLine());
                switch (opcion) {
                    case 1:
                        System.out.println("Cancion a añadir:");
                        String nombre = sc.nextLine();
                        pleilist.add(nombre);
                        break;
                    case 2:
                        System.out.println("Buscar Cancion:");
                        String esta = sc.nextLine();
                        if (pleilist.contains(esta)) {
                            System.out.println("SI ESTA EN LA PLAYLIST");
                        } else {
                            System.out.println("NO ESTA EN LA PLAYLIST");
                        }
                        break;
                    case 3:
                        System.out.println("Cancion para borrar:");
                        String borrar = sc.nextLine();
                        if (pleilist.indexOf(borrar) == -1) {
                            throw new Exception("No esta en la pleylist");
                        }
                        pleilist.remove(borrar);
                        break;
                    case 4:
                        System.out.println("Estado de las Canciones: " + pleilist.size());
                        break;
                    case 5:
                        if (pleilist.isEmpty()) {
                            System.out.println("La playlist está vacía.");
                        } else {
                            System.out.println("Contenido de la playlist:");
                            for (int i = 0; i < pleilist.size(); i++) {
                                System.out.println((i + 1) + ". " + pleilist.get(i));
                            }
                        }
                        break;
                    case 6:
                        for (int i = 0; i < pleilist.size(); i++) {
                            System.out.println(pleilist.get(i));
                        }
                        break;
                    case 7:
                        for (int i = 0; i < pleilist.size(); i++) {
                            System.out.println(pleilist.remove(i));
                        }
                        break;
                    case 8:
                        sigue = false;
                        return;
                    default:
                        System.out.println("Nel");
                        break;
                }
            } while (sigue = true);

        } catch (Exception e) {
            System.out.println("Error " + e);
        }
    }
}