package II;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    static ArrayList<Integer> notas = new ArrayList<>();

    public static void main(String[] args) {
        try {
            Scanner sc = new Scanner(System.in);
            boolean sigue = true;
            String nombre = sc.nextLine();
            do {
                int opcion = sc.nextInt();
                sc.nextLine();
                switch (opcion) {
                    case 1:
                        System.out.println("Pon una nota");
                        Integer nota = sc.nextInt();
                        notas.add(nota);
                        System.out.println("Añadio: " + notas);
                        break;
                    case 2:
                        if (notas.isEmpty()) {
                            System.out.println("No hay notas registradas.");
                        } else {
                            double suma = 0;
                            for (double n : notas) {
                                suma += n;
                            }
                            double media = suma / notas.size();
                            System.out.println("Nota media de " + nombre + ": " + media);
                        }
                        break;
                    case 3:
                        sigue = false;
                        return;
                }
            } while (sigue = true);

        } catch (Exception e) {
            System.out.println(e);
        }
    }

    public static int CantInv() {
        return notas.size();
    }
}