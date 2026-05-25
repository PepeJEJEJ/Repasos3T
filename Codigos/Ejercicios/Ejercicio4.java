import javax.swing.*;
import java.awt.*;

public class Ejercicio4 {
    public static void main(String[] args) {
        JFrame ventana = new JFrame("Color");
        ventana.setSize(300, 200);
        ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel panel = new JPanel();
        ventana.add(panel);

        JLabel texto = new JLabel("COLOR");
        texto.setFont(new Font("Arial", Font.BOLD, 12));
        panel.add(texto);

        JButton rojo = new JButton("rojo ");
        panel.add(rojo);
        JButton azul = new JButton("azul ");
        panel.add(azul);
        JButton verde = new JButton("verde ");
        panel.add(verde);

        rojo.addActionListener(e -> texto.setForeground(Color.red));
        azul.addActionListener(e -> texto.setForeground(Color.blue));
        verde.addActionListener(e -> texto.setForeground(Color.green));

        ventana.setVisible(true);
    }
}