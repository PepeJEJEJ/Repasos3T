package II;

import java.util.Scanner;
import java.io.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean Sigue=true;
        do {
            try {
            System.out.println("Pon Nombre");
            String Nombre = sc.nextLine();
            System.out.println("Pon Precio");
            Double Precio = sc.nextDouble();
            System.out.println("Pon Stock");
            int Stock = sc.nextInt();
            BufferedWriter bw = new BufferedWriter(new FileWriter("inventario.csv", true));
            bw.write(Nombre + "," + Precio + "," + Stock);
            bw.newLine();
            bw.close();
        } catch (Exception e) {
            Sigue=false;
            System.out.println("ERROR" + e);
        }
        } while (Sigue=true);
    }
}
