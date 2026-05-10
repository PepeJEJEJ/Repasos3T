package I;
import java.util.Scanner;
import java.io.*;
import java.time.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true) {
            try {
                int a = sc.nextInt();
                int b = sc.nextInt();
                int resultado = a / b;
                System.out.println("RESULTADO: " + resultado);

            } catch (Exception e) {
                registrarError(e.getMessage());
                System.out.println("ERROR GRABAO");
            }
        }
    }

    public static void registrarError(String error) {
        try {
            BufferedWriter bw = new BufferedWriter(new FileWriter("errores.log", true));
            bw.write(LocalDateTime.now() + "-" + error);
            bw.newLine();
            bw.close();
        } catch (IOException ex) {
        }
    }
}
