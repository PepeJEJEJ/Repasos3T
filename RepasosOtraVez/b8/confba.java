import java.io.*;

public class confba {
    public static void main(String[] args) {
        try {
            BufferedReader br = new BufferedReader(new FileReader("config.txt"));
            String lineaArchivo = "";
            String idioma = "";
            String vol = "";
            lineaArchivo = br.readLine();
            while (lineaArchivo != null) {
                String[] partes = lineaArchivo.split(":");
                if (partes[0].equals("idioma")) {
                    idioma = partes[1];
                } else if (partes[0].equals("volumen")) {
                    vol = partes[1];
                }
                lineaArchivo = br.readLine();
            }
            System.out.println("El sistema está configurado en idioma " + idioma + " con un volumen de " + vol);
        } catch (Exception e) {
            System.out.println("Error " + e);
        }
    }
}