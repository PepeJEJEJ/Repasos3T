import java.io.*;
import java.util.*;

public class exportinv {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            System.out.println("Nombre del producto");
            String Nombre = sc.nextLine();
            System.out.println("Precio del producto");
            int Precio = sc.nextInt();
            System.out.println("Stock del producto");
            int Stock = sc.nextInt();
            BufferedWriter bw = new BufferedWriter(new FileWriter("inventario.csv.", true));
            bw.write(Nombre + "," + Precio + "," + Stock);
            bw.newLine();
            bw.close();
        } catch (Exception e) {
            System.err.println("Error " + e);
        }
    }
}