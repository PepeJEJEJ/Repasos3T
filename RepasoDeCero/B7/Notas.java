import java.util.*;

public class Notas {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> Notas = new ArrayList<Integer>();
        boolean Sigue = true;
        try {
            String NombreAlumno = sc.nextLine();
            do {
                System.out.println("Opciones: ");
                System.out.println("1. Introducir una nueva nota.\n" + //
                        "2. Calcular y mostrar la nota media del alumno (con todas las introducidas hasta\n" + //
                        "el momento).\n" + //
                        "3. Salir.");
                int opcion = sc.nextInt();
                sc.nextLine();
                switch (opcion) {
                    case 1:
                        int notaNueva = sc.nextInt();
                        Notas.add(notaNueva);
                        break;
                    case 2:
                        for (int i = 0; i < Notas.size(); i++) {
                            System.out.println(i);
                        }
                        System.out.println(NombreAlumno);
                    case 3:
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