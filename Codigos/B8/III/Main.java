package III;
import java.io.*;

public class Main {
    public static void main(String[] args) {
        String idioma = "";
        String volumen = "";

        try {
            BufferedReader br = new BufferedReader(new FileReader("config.txt"));
            String linea;

            while ((linea = br.readLine()) != null) {
                String[] partes = linea.split(":");
                String clave = partes[0];
                String valor = partes[1];

                if (clave.equals("idioma"))
                    idioma = valor;
                if (clave.equals("volumen"))
                    volumen = valor;
            }

            br.close();

            System.out.println("El sistema está configurado en idioma " + idioma + "con un volumen de " + volumen);

        } catch (Exception e) {
            System.out.println("ERROR");
        }
    }
}
