import java.awt.*;
import javax.swing.*;
import java.io.*;
//EXAMEN RECUP. CASI :'(
public class Main {

    public static void main(String[] args) {
        JFrame ventana = new JFrame("Recuperar3T");
        ventana.setSize(800, 600);
        ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel panel = new JPanel();
        panel.setLayout(new FlowLayout());
        ventana.add(panel);

        JTextField nombre = new JTextField(10);
        JTextField telefono = new JTextField(10);
        JTextArea area = new JTextArea(20, 40);

        panel.add(new JLabel("Nombre"));
        panel.add(nombre);
        panel.add(new JLabel("Nº Telefónico"));
        panel.add(telefono);

        JButton añadir = new JButton("Añadir");
        JButton guardar = new JButton("Guardar");
        JButton ver = new JButton("Ver");

        panel.add(añadir);
        panel.add(guardar);
        panel.add(ver);
        panel.add(new JScrollPane(area));

        // Añadir al área (solo visual)
        añadir.addActionListener(e -> {
            String n = nombre.getText();
            String t = telefono.getText();

            if (n.isEmpty() || t.isEmpty()) {
                JOptionPane.showMessageDialog(null, "Rellena ambos campos");
                return;
            }

            area.append(n + " : " + t + "\n");
            nombre.setText("");
            telefono.setText("");
        });

        // Guardar en TXT
        guardar.addActionListener(e -> {
            String n = nombre.getText();
            String t = telefono.getText();

            if (n.isEmpty() || t.isEmpty()) {
                JOptionPane.showMessageDialog(null, "Rellena ambos campos");
                return;
            }

            guardarContacto(n, t);
            nombre.setText("");
            telefono.setText("");
        });

        // Leer TXT
        ver.addActionListener(e -> {
            area.setText(leerContactos());
        });

        ventana.setVisible(true);
    }

    // Guarda un contacto en el TXT
    public static void guardarContacto(String nombreC, String telefonoC) {
        try {
            BufferedWriter bw = new BufferedWriter(new FileWriter("contactos.txt", true));
            bw.write(nombreC + ":" + telefonoC);
            bw.newLine();
            bw.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    // Lee todos los contactos del TXT
    public static String leerContactos() {
        StringBuilder sb = new StringBuilder();
        try {
            File f = new File("contactos.txt");
            if (!f.exists()) return "No hay contactos guardados.";

            BufferedReader br = new BufferedReader(new FileReader(f));
            String linea;
            while ((linea = br.readLine()) != null) {
                sb.append(linea).append("\n");
            }
            br.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return sb.toString();
    }
}
