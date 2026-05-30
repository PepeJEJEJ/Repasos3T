import java.io.*;
import java.time.LocalDateTime;
import java.util.*;

public class logerrores {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean yrmum = true;
        do {
            try {
                int n1 = sc.nextInt();
                int n2 = sc.nextInt();
                int resultado = n1 /= n2;
                System.out.println("Resultado de " + n1 + n2 + " es " + resultado);

            } catch (Exception e) {
                try {
                    BufferedWriter bw = new BufferedWriter(new FileWriter("errores.log", true));
                    bw.write(LocalDateTime.now() + " - " + e.getMessage());
                    bw.newLine();
                    bw.close();
                } catch (IOException ex) {
                    System.err.println("Error " + ex);
                    yrmum = false;
                }
            }
        } while (yrmum = true);
    }
}