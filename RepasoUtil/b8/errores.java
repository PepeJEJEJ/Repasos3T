import java.io.*;
import java.time.*;
import java.util.*;

public class errores {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            boolean sigue = true;
            do {
                int n1 = sc.nextInt();
                int n2 = sc.nextInt();
                int resultado = n1 / n2;
                System.out.println(resultado);
            } while (sigue = true);
        } catch (Exception e) {
            registrarError(e.getMessage());
            System.out.println("ERROR GRABADO");
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