import javax.swing.*;
import java.io.*;

public class Ejercicio9 {
    public static void main(String[] args) {

        JFrame ventana = new JFrame("Login");
        ventana.setSize(300, 180);
        ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel panel = new JPanel();
        ventana.add(panel);

        JTextField Usuario = new JTextField(10);
        JPasswordField Pase = new JPasswordField(10);
        JButton botonLogin = new JButton("Iniciar sesion");

        panel.add(new JLabel("Usuario:"));
        panel.add(Usuario);

        panel.add(new JLabel("Contraseña:"));
        panel.add(Pase);

        panel.add(botonLogin);

        botonLogin.addActionListener(e -> {
            String usuario = Usuario.getText();
            String pass = new String(Pase.getPassword());

            if (comprobarLogin(usuario, pass)) {
                JOptionPane.showMessageDialog(
                        ventana,
                        "inicio de sesión CORRECTO",
                        "Correcto",
                        JOptionPane.INFORMATION_MESSAGE);
            } else {
                JOptionPane.showMessageDialog(
                        ventana,
                        "inicio de sesión INCORRECTO",
                        "Error",
                        JOptionPane.ERROR_MESSAGE);
            }
        });

        ventana.setVisible(true);
    }

    private static boolean comprobarLogin(String usuario, String pass) {
        try (BufferedReader br = new BufferedReader(new FileReader("usuarios.txt"))) {
            String linea;
            while ((linea = br.readLine()) != null) {
                String[] partes = linea.split(";");
                if (partes[0].equals(usuario) && partes[1].equals(pass)) {
                    return true;
                }
            }
        } catch (IOException e) {
            System.out.println("Error leyendo archivo.");
        }
        return false;
    }
}
