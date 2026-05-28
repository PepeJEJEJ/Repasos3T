/*Ejercicios repaso bloque 8
Ejercicio 1: El log de errores.
Crea un programa que pida dos números al usuario y realice la división de ambos, infinitamente. Debes controlar las excepciones que puedan darse . Cada vez que ocurra una excepción, 
el programa debe escribir en un archivo llamado errores.log la fecha (busca cómo funciona LocalDateTime) y el mensaje del error, sin borrar los errores anteriores.*/
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDateTime;
import java.util.Scanner;

public class Ej1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (true) {
            try {
                System.out.println("Num1:");
                int a = Integer.parseInt(sc.nextLine());
                System.out.println("Num2:");
                int b = Integer.parseInt(sc.nextLine());

                int r = a / b;
                System.out.println("Resultado: " + r);

            } catch (Exception e) {
                try {
                    BufferedWriter bw = new BufferedWriter(new FileWriter("errores.log", true));
                    bw.write(LocalDateTime.now() + " - " + e.getMessage());
                    bw.newLine();
                    bw.close();
                } catch (IOException ex) {}
            }
        }
    }
}
