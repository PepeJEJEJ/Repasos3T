package II;

import java.util.Scanner;
import java.io.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String Nombre = sc.nextLine();
        Double Precio = sc.nextDouble();
        int Stock = sc.nextInt();
        try {
            BufferedWriter bw = new BufferedWriter(new FileWriter("inventario.csv", true));
            bw.write(Nombre + "," + Precio + "," + Stock);
            bw.newLine();
            bw.close();
        } catch (Exception e) {
            System.out.println("ERROR"+e);
        }
    }
}
