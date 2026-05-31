import java.util.*;

public class Invitados {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<String> invitados = new ArrayList<String>();
        try {
            Boolean sigue = true;
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
                        System.out.println(invitados.size());
                        break;
                    case 2:
                        String nuevoInvitado = sc.nextLine();
                        if (invitados.contains(nuevoInvitado)) {
                            System.out.println("YA EXISTE");
                        } else {
                            invitados.add(nuevoInvitado);
                        }
                        break;
                    case 3:
                        String buscarInvitado = sc.nextLine();
                        if (invitados.contains(buscarInvitado)) {
                            System.out.println(buscarInvitado + " ESTA EN LA LISTA");
                        } else {
                            System.out.println(buscarInvitado + " NO ESTA EN LA LISTA");
                        }
                        break;
                    case 4:
                        String borrarInvitado = sc.nextLine();
                        if (invitados.contains(borrarInvitado)) {
                            invitados.remove(borrarInvitado);
                        } else {
                            System.out.println(borrarInvitado + " NO EXISTE");
                        }
                        break;
                    case 5:
                        for (int i = 0; i < invitados.size(); i++) {
                            System.out.println(invitados.get(i));
                        }
                        break;
                    default:
                        sigue=false;
                        return;
                }
            } while (sigue = true);
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}