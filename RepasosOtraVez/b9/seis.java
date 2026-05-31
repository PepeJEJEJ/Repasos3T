import java.awt.Color;
import java.io.*;
import javax.swing.*;

public class seis {
    public static void main(String[] args) {
        JFrame ventana = new JFrame("SEIS");
        ventana.setSize(222, 222);
        ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JPanel panel = new JPanel();
        ventana.add(panel);
        JTextField lineaUsuario = new JTextField("Nombre");
        panel.add(lineaUsuario);
        JTextField lineaContraseña = new JTextField("Contraseña");
        panel.add(lineaContraseña);
        JButton comprobar = new JButton("Comprobar");
        panel.add(comprobar);
        JLabel resultado = new JLabel("Inicio");
        panel.add(resultado);
        comprobar.addActionListener(e -> {
            String nombre = lineaUsuario.getText();
            String contraseña = lineaContraseña.getText();
            boolean ok = metodo(nombre, contraseña);
            if (ok) {
                resultado.setText("Bien");
                resultado.setForeground(Color.GREEN);
            } else {
                resultado.setText("Mal");
                resultado.setForeground(Color.RED);
            }
        });
        ventana.setVisible(true);
    }

    public static boolean metodo(String nombre, String contraseña) {
        try (BufferedReader br = new BufferedReader(new FileReader("usuarios.txt"))) {
            String Linea;
            while ((Linea = br.readLine()) != null) {
                String partes[] = Linea.split(":");
                if (partes.length == 2) {
                    if (partes[0].equals(nombre) && partes[1].equals(contraseña)) {
                        return true;
                    }
                }
            }
        } catch (Exception e) {
            System.out.println("error " + e);
        }
        return false;
    }
}