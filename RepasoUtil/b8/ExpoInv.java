import java.io.*;
import java.util.*;

public class ExpoInv {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            String Nombre = sc.nextLine();
            int Precio = sc.nextInt();
            int Stock = sc.nextInt();
            BufferedWriter bw = new BufferedWriter(new FileWriter("inventario.csv", true));
            bw.write(Nombre + "," + Precio + "," + Stock);
            bw.newLine();
            bw.close();
        } catch (Exception e) {
            e.getMessage();
        }
    }
}