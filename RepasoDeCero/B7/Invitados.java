import java.util.*;

public class Invitados {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<String> Invitados = new ArrayList<String>();
        boolean Sigue = true;
        try {
            do {
                System.out.println("Opciones: ");
                System.out.println("1. Mostrar total invitados");
                System.out.println("2. Añadir invitado");
                System.out.println("3. Comprobar si un nombre está en la lista");
                System.out.println("4. Eliminar invitado por nombre");
                System.out.println("5. Mostrar lista completa");
                System.out.println("6. Salir");
                int opcion = sc.nextInt();
                sc.nextLine();
                switch (opcion) {
                    case 1:
                        for (int i = 0; i < Invitados.size(); i++) {
                            System.out.println(i);
                        }
                        break;
                    case 2:
                        String nombre = sc.nextLine();
                        Invitados.add(nombre);
                        break;
                    case 3:
                        String nombreBuscar = sc.nextLine();
                        if (Invitados.contains(nombreBuscar)) {
                            System.out.println(nombreBuscar + " Existe");
                        } else {
                            System.out.println(nombreBuscar + " No Existe");
                        }
                        break;
                    case 4:
                        String nombreBorrar = sc.nextLine();
                        if (Invitados.contains(nombreBorrar)) {
                            Invitados.remove(nombreBorrar);
                        } else {
                            System.out.println(nombreBorrar + " No Existe");
                        }
                        break;
                    case 5:
                        for (int i = 0; i < Invitados.size(); i++) {
                            System.out.println(Invitados.get(i));
                        }
                        break;
                    case 6:
                        Sigue = false;
                        return;
                    default:
                        System.out.println("Nel");
                        break;
                }
            } while (Sigue = true);
        } catch (Exception e) {
            System.err.println("Error " + e);
        }
    }
}