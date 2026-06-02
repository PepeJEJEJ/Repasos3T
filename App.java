import javax.swing.*;
import java.awt.*;
import java.io.*;
import java.util.*;

public class App {

    // Excepción personalizada (Bloque 7)
    static class NombreVacioException extends Exception {
        public NombreVacioException(String msg) {
            super(msg);
        }
    }

    public static void main(String[] args) {

        JFrame ventana = new JFrame("Gestor");
        ventana.setSize(350, 250);
        ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel panel = new JPanel();
        panel.setLayout(new FlowLayout());
        ventana.add(panel);

        JLabel lblNombre = new JLabel("Nombre:");
        JTextField txtNombre = new JTextField(15);

        JButton btnGuardar = new JButton("Guardar en TXT");
        JButton btnLeer = new JButton("Leer TXT");

        JLabel lblResultado = new JLabel("");

        panel.add(lblNombre);
        panel.add(txtNombre);
        panel.add(btnGuardar);
        panel.add(btnLeer);
        panel.add(lblResultado);

        // ARRAY (Bloque 16)
        String[] mensajes = {"Guardado OK", "Error al guardar", "Leído OK"};

        // HASHMAP (Bloque 16)
        HashMap<String, Integer> contador = new HashMap<>();
        contador.put("guardados", 0);

        // BOTÓN GUARDAR
        btnGuardar.addActionListener(e -> {
            try {
                String nombre = txtNombre.getText();

                if (nombre.isEmpty()) {
                    throw new NombreVacioException("El nombre no puede estar vacío");
                }

                BufferedWriter bw = new BufferedWriter(new FileWriter("datos.txt", true));
                bw.write(nombre);
                bw.newLine();
                bw.close();

                contador.put("guardados", contador.get("guardados") + 1);

                lblResultado.setText(mensajes[0] + " (" + contador.get("guardados") + ")");
                lblResultado.setForeground(Color.GREEN);

            } catch (NombreVacioException ex) {
                lblResultado.setText(ex.getMessage());
                lblResultado.setForeground(Color.RED);

            } catch (IOException ex) {
                lblResultado.setText(mensajes[1]);
                lblResultado.setForeground(Color.RED);
            }
        });

        // BOTÓN LEER
        btnLeer.addActionListener(e -> {
            try {
                BufferedReader br = new BufferedReader(new FileReader("datos.txt"));
                String linea;
                System.out.println("Contenido del archivo:");
                while ((linea = br.readLine()) != null) {
                    System.out.println("- " + linea);
                }
                br.close();

                lblResultado.setText(mensajes[2]);
                lblResultado.setForeground(Color.BLUE);

            } catch (IOException ex) {
                lblResultado.setText("Error al leer");
                lblResultado.setForeground(Color.RED);
            }
        });

        ventana.setVisible(true);
    }
}
