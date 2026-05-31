import java.util.*;

public class Calificaciones {
    public static void main(String[] args) {
        ArrayList<Integer> notas = new ArrayList<Integer>();
        Scanner sc = new Scanner(System.in);
        boolean sigue = true;
        do {
            try {
                System.out.println("1. Introducir una nueva nota.\n" + //
                        "2. Calcular y mostrar la nota media del alumno (con todas las introducidas hasta\n" + //
                        "el momento).\n" + //
                        "3. Salir.");
                int opcion = sc.nextInt();
                sc.nextLine();
                switch (opcion) {
                    case 1:
                        System.out.println("Pon una nota");
                        int nuevaNota = sc.nextInt();
                        if (nuevaNota > 10 || nuevaNota < 0) {
                            System.out.println("Nel");
                        } else {
                            notas.add(nuevaNota);
                        }
                        break;
                    case 2:
                        int suma = 0;
                        int cantidad = 0;
                        for (int i = 0; i < notas.size(); i++) {
                            cantidad += 1;
                            suma += notas.get(i);
                        }
                        int media = suma / cantidad;
                        System.out.println("La media es de:");
                        System.out.println(media);
                        break;
                    case 3:
                        sigue = false;
                        return;
                    default:
                        System.out.println("nel");
                        break;
                }
            } catch (Exception e) {
                System.out.println(e);
            }
        } while (sigue = true);
    }
}
