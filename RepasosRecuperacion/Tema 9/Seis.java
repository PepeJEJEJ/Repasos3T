import javax.swing.*;
import java.awt.*;
import java.io.*;

public class Seis {
    public static void main(String[] args) {

        JFrame ventana = new JFrame("Sesenta y Nueve");
        ventana.setSize(300, 180);
        ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel panel = new JPanel();
        ventana.add(panel);

        JTextField campoUsuario = new JTextField(10);
        JPasswordField campoPass = new JPasswordField(10);
        JButton botonLogin = new JButton("Iniciar sesión");
        JLabel resultado = new JLabel("");

        panel.add(new JLabel("Usuario:"));
        panel.add(campoUsuario);

        panel.add(new JLabel("Contraseña:"));
        panel.add(campoPass);

        panel.add(botonLogin);
        panel.add(resultado);

        botonLogin.addActionListener(e -> {
            String usuario = campoUsuario.getText();
            String pass = new String(campoPass.getPassword());

            boolean ok = comprobarLogin(usuario, pass);

            if (ok) {
                resultado.setText("Inicio de sesión correcto");
                resultado.setForeground(Color.GREEN);
            } else {
                resultado.setText("Inicio de sesión incorrecto");
                resultado.setForeground(Color.RED);
            }
        });

        ventana.setVisible(true);
    }

    private static boolean comprobarLogin(String usuario, String pass) {
        try (BufferedReader br = new BufferedReader(new FileReader("usuarios.txt"))) {
            String linea;
            while ((linea = br.readLine()) != null) {
                String[] partes = linea.split(";");
                if (partes.length == 2) {
                    if (partes[0].equals(usuario) && partes[1].equals(pass)) {
                        return true;
                    }
                }
            }
        } catch (IOException e) {
            System.out.println("Error leyendo el archivo.");
        }
        return false;
    }
}
