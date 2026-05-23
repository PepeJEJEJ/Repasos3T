import java.util.*;

public class Dos {
    public static void main(String[] args) {
        ArrayList<Integer> notas = new ArrayList<>();
        try {
            Scanner sc = new Scanner(System.in);
            boolean funciona = true;
            do {
                System.out.println("1. Introducir una nueva nota. \r\n" + //
                        "2. Calcular y mostrar la nota media del alumno (con todas las introducidas hasta el momento \r\n"
                        + //
                        "3. Salir. ");
                int opcion = sc.nextInt();
                switch (opcion) {
                    case 1:
                        System.out.println("Pon una nota");
                        int nuevaNota = sc.nextInt();
                        if (nuevaNota >= 0 && nuevaNota <= 10) {
                            notas.add(nuevaNota);
                        } else {
                            System.out.println("NEL");
                        }
                        break;
                    case 2:
                        int suma = 0;
                        for (int n : notas)
                            suma += n;
                        int media = (int) suma / notas.size();
                        System.out.println(media);
                        break;
                    case 3:
                        funciona = false;
                        return;

                }
            } while (funciona = true);
        } catch (Exception e) {
            System.out.println("Error " + e);
        }
    }
}