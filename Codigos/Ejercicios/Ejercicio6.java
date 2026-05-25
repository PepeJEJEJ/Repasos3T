import javax.swing.*;
import java.awt.*;
import java.io.*;

public class Ejercicio6 {
    public static void main(String[] args) {

        JFrame ventana = new JFrame("Login basico");
        ventana.setSize(300, 180);
        ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel panel = new JPanel();
        ventana.add(panel);

        JTextField lineaUsuario = new JTextField(10);
        JPasswordField Pase = new JPasswordField(10);
        JButton IniciarSes = new JButton("Iniciar sesión");
        JLabel Ver = new JLabel("");

        panel.add(new JLabel("Usuario:"));
        panel.add(lineaUsuario);

        panel.add(new JLabel("Contraseña:"));
        panel.add(Pase);

        panel.add(IniciarSes);
        panel.add(Ver);

        IniciarSes.addActionListener(e -> {
            String usuario = lineaUsuario.getText();
            String pass = new String(Pase.getPassword());

            boolean correcto = Registro(usuario, pass);

            if (correcto) {
                Ver.setText("CORRECTO");
                Ver.setForeground(Color.green);
            } else {
                Ver.setText("INCORRECTO");
                Ver.setForeground(Color.red);
            }
        });

        ventana.setVisible(true);
    }

    private static boolean Registro(String usuario, String contrasenia) {
        try (BufferedReader br = new BufferedReader(new FileReader("usuarios.txt"))) {
            String linea;
            while ((linea = br.readLine()) != null) {
                String[] partes = linea.split(";");
                if (partes[0].equals(usuario) && partes[1].equals(contrasenia)) {
                    return true;
                }
            }
        } catch (IOException e) {
            System.out.println("Error con el archivo.");
        }
        return false;
    }
}
