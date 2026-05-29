import java.util.*;

public class Invis {
    public static void main(String[] args) {
        ArrayList<String> invitados = new ArrayList<String>();
        Scanner sc = new Scanner(System.in);
        boolean Sigue = true;
        try {
            do {
                System.out.println("1. Mostrar el número total de invitados usando el método.\n" + //
                        "2. Añadir un invitado nuevo (se pide su nombre por consola).\n" + //
                        "3. Comprobar si un nombre específico (introducido por teclado) está en la lista.\n" + //
                        "4. Eliminar a un invitado de la lista por su nombre.\n" + //
                        "5. Mostrar la lista completa.");
                int opcion = sc.nextInt();
                sc.nextLine();
                switch (opcion) {
                    case 1:
                        invitados.size();
                        break;
                    case 2:
                        String NuevoInvitado = sc.nextLine();
                        if (!invitados.contains(NuevoInvitado)) {
                            invitados.add(NuevoInvitado);
                        } else {
                            System.out.println("Ya existe");
                        }
                        break;
                    case 3:
                        String BuscarInvitado = sc.nextLine();
                        if (invitados.contains(BuscarInvitado)) {
                            System.out.println(BuscarInvitado + " existe");
                        } else {
                            System.out.println("No existe");
                        }
                        break;
                    case 4:
                        String BorrarInvitado = sc.nextLine();
                        if (invitados.contains(BorrarInvitado)) {
                            invitados.remove(BorrarInvitado);
                        } else {
                            System.out.println("NO existe");
                        }
                        break;
                    case 5:
                        for (int i = 0; i < invitados.size(); i++) {
                            System.out.println(i);
                        }
                        break;
                    default:
                        Sigue = false;
                        return;
                }
            } while (Sigue = true);

        } catch (Exception e) {
            System.out.println("Error " + e);
        }
    }
}