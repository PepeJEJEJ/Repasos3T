import java.awt.*;
import javax.swing.*;

public class Colorear {
    public static void main(String[] args) {
        JFrame ventana = new JFrame("Colores");
        ventana.setSize(222, 222);
        ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JPanel panel = new JPanel();
        ventana.add(panel);
        JLabel color = new JLabel("COLOR");
        panel.add(color);
        JButton rojo = new JButton("ROJO");
        panel.add(rojo);
        rojo.addActionListener(e -> {
            color.setForeground(Color.RED);
        });
        JButton verde = new JButton("VERDE");
        panel.add(verde);
        verde.addActionListener(e -> {
            color.setForeground(Color.GREEN);
        });
        JButton azul = new JButton("AZUL");
        panel.add(azul);
        azul.addActionListener(e -> {
            color.setForeground(Color.BLUE);
        });
        ventana.setVisible(true);
    }
}
