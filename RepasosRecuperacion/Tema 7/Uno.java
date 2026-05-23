import java.util.*;

public class Uno {
    public static void main(String[] args) {
        ArrayList<String> lista = new ArrayList<>();
        try {
            Scanner sc = new Scanner(System.in);
            boolean funciona = true;
            do {
                System.out.println("1. Mostrar el número total de invitados. \r\n" + //
                        "2. Añadir un invitado nuevo (se pide su nombre por consola). \r\n" + //
                        "3. Comprobar si un nombre específico (introducido por teclado) está en la lista. \r\n" + //
                        "4. Eliminar a un invitado de la lista por su nombre. \r\n" + //
                        "5. Mostrar la lista completa. ");
                int opcion = sc.nextInt();
                sc.nextLine();
                switch (opcion) {
                    case 1:
                        System.out.println(lista.size());
                        break;
                    case 2:
                        String nombre = sc.nextLine();
                        lista.add(nombre);
                        break;
                    case 3:
                        String VerNombre = sc.nextLine();
                        if (lista.contains(VerNombre) == true) {
                            System.out.println(VerNombre + " Existe");
                        } else {
                            System.out.println(VerNombre + " No Existe");
                        }
                        break;
                    case 4:
                        String BorrarNombre = sc.nextLine();
                        lista.remove(BorrarNombre);
                        break;
                    case 5:
                        for (int i = 0; i < lista.size(); i++) {
                            System.out.println(lista.get(i));
                        }
                        break;
                    default:
                        funciona = false;
                        return;
                }
            } while (funciona = true);
        } catch (Exception e) {
            System.out.println("Error " + e);
        }
    }
}