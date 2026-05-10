package IV;
import java.io.*;

public class Main {
    public static void main(String[] args) {

        int total = 0;
        int suma = 0;
        int max = -1;
        int min = 11;
        int aprobados = 0;
        int suspensos = 0;

        try {
            try (BufferedReader br = new BufferedReader(new FileReader("notas.txt"))) {
                String linea;

                while ((linea = br.readLine()) != null) {
                    int nota = Integer.parseInt(linea);

                    suma += nota;
                    total++;

                    if (nota > max)
                        max = nota;
                    if (nota < min)
                        min = nota;

                    if (nota >= 5)
                        aprobados++;
                    else
                        suspensos++;
                }
            }
            double media = (total > 0) ? (double) suma / total : 0;

            System.out.println("MEDIA: " + media);
            System.out.println("MÁXIMA: " + max);
            System.out.println("MÍNIMA: " + min);
            System.out.println("APROBADOS: " + aprobados);
            System.out.println("SUSPENSOS: " + suspensos);
        } catch (Exception e) {
        }
    }
}