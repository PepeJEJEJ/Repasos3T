import java.io.*;
import javax.swing.*;

public class LoginAvanz {
    public static void main(String[] args) {
        JFrame ventana = new JFrame("Login Avanzado");
        ventana.setSize(222, 222);
        ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JPanel panel = new JPanel();
        ventana.add(panel);
        JTextField nombre = new JTextField(10);
        panel.add(nombre);
        JTextField contraseña = new JTextField(10);
        panel.add(contraseña);
        JLabel resultado = new JLabel("");
        panel.add(resultado);
        JButton confirmar = new JButton("Confirmar");
        confirmar.addActionListener(e -> {
            String usuario = nombre.getText();
            String pass = new String(contraseña.getText());

            boolean ok = Confirmar(usuario, pass);

            if (ok) {
                JOptionPane.showMessageDialog(null, "Inicio de sesión Correcto");
            } else {
                JOptionPane.showMessageDialog(null, "Inicio de sesión Incorrecto");
            }
        });
        panel.add(confirmar);
        ventana.setVisible(true);

    }

    private static boolean Confirmar(String usuario, String pass) {
        try (BufferedReader br = new BufferedReader(new FileReader("usuarios.txt"))) {
            String linea;
            while ((linea = br.readLine()) != null) {
                String[] partes = linea.split(":");
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