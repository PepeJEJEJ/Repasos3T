import java.io.*;
import javax.swing.*;

public class loginbasic {
    public static void main(String[] args) {
        JFrame ventana = new JFrame("Login_básico");
        ventana.setSize(400, 300);
        ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JPanel panelPrincipal = new JPanel();
        ventana.add(panelPrincipal);
        JTextField usuario = new JTextField(20);
        JTextField contraseña = new JTextField(20);
        JButton confirmar = new JButton("Iniciar Sesion");
        JLabel etiquetaSalida = new JLabel("");
        panelPrincipal.add(usuario);
        panelPrincipal.add(contraseña);
        panelPrincipal.add(confirmar);
        panelPrincipal.add(etiquetaSalida);
        confirmar.addActionListener(e -> {
            String datoIngresado1 = usuario.getText();
            String datoIngresado2 = contraseña.getText();
            etiquetaSalida.setText("");
        });
        try {
            BufferedReader br = new BufferedReader(new FileReader("users.txt"));
            String Usuario = "";
            String Contras = "";
            String lineas = "";
            while (lineas != null) {
                String[] partes = lineas.split(":");
                if (partes[0].equals(usuario)) {
                    Usuario = partes[1];

                } else if (partes[0].equals(contraseña)) {
                    Contras = partes[1];
                }
                lineas = br.readLine();
            }
        } catch (IOException e) {
            System.out.println("E" + e);
        }

        ventana.setVisible(true);
    }
}
