import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    static ArrayList<String> nombres = new ArrayList<>();

    public static void main(String[] args) {
        try {
            Scanner sc = new Scanner(System.in);
            boolean sigue = true;
            do {
                int opcion = sc.nextInt();
                sc.nextLine();
                switch (opcion) {
                    case 1:
                        System.out.println("Total invitados: " + CantInv());
                        break;
                    case 2:
                        System.out.println("Pon un nombre");
                        String nombre = sc.nextLine();
                        nombres.add(nombre);
                        System.out.println("Añadio: " + nombre);
                        break;
                    case 3:
                        int posicion = sc.nextInt();
                        System.out.println(nombres.get(posicion));
                        break;
                    case 4:
                        String borrar = sc.nextLine();
                        nombres.remove(borrar);
                        break;
                    case 5:
                        for (int i = 0; i < CantInv(); i++) {
                            System.out.println(nombres.contains(nombres));
                        }
                        break;
                    case 6:
                        sigue = false;
                        return;
                }
            } while (sigue = true);

        } catch (Exception e) {
            System.out.println(e);
        }
    }

    public static int CantInv() {
        return nombres.size();
    }
}