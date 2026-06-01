import java.io.*;

public class estadists {
    public static void main(String[] args) {
        int total = 0;
        int suma = 0;
        int max = -1;
        int min = 11;
        int aprobados = 0;
        int suspensos = 0;

        try {
            BufferedReader br = new BufferedReader(new FileReader("notas.txt"));
            String linea;

            while ((linea = br.readLine()) != null) {
                int nota = Integer.parseInt(linea);
                suma += nota;
                total++;
                if (nota < max) {
                    max = nota;
                } else if (nota > min) {
                    min = nota;
                } else if (nota >= 5) {
                    aprobados++;
                } else {
                    suspensos++;
                }
            }
            double media = (double) suma / total;
            
            System.out.println("Media: " + media);
            System.out.println("Máxima: " + max);
            System.out.println("Mínima: " + min);
            System.out.println("Aprobados: " + aprobados);
            System.out.println("Suspensos: " + suspensos);
        } catch (Exception e) {
            System.out.println("error" + e);
        }
    }
}