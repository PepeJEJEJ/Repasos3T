import java.util.*;

public class notitas {
    public static void main(String[] args) {
        ArrayList<Integer> notas = new ArrayList<Integer>();
        Scanner sc = new Scanner(System.in);
        boolean Sigue = true;
        try {
            int cantidad = 0;
            do {
                System.out.println("1. Introducir una nueva nota.\n" + //
                        "2. Calcular y mostrar la nota media del alumno (con todas las introducidas hasta el momento)\n"
                        + // .
                        "3. Salir.");
                int opcion = sc.nextInt();
                sc.nextLine();
                switch (opcion) {
                    case 1:
                        int NuevaNota = sc.nextInt();
                        notas.add(NuevaNota);
                        cantidad++;
                        break;
                    case 2:
                        for (int i = 1; i < notas.size(); i++) {
                            int media = cantidad / notas.get(i);
                            System.out.println(media);
                        }
                        break;
                    case 3:
                        Sigue = false;
                        return;
                }
            } while (Sigue = true);

        } catch (Exception e) {
            System.out.println("Error " + e);
        }
    }
}