import java.awt.*;
import javax.swing.*;

public class Teclado {
    public static void main(String[] args) {
        JFrame ventana = new JFrame("Teclado");
        ventana.setSize(222, 222);
        ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JPanel panel = new JPanel(new GridLayout(3, 3));
        ventana.add(panel);
        JLabel numeros = new JLabel("", SwingConstants.CENTER);
        panel.add(numeros, BorderLayout.NORTH);
        for (int i = 1; i < 10; i++) {
            JButton boton = new JButton("" + i);
            panel.add(boton);
            boton.addActionListener(e -> {
            numeros.setText(numeros.getText() + boton.getText());
            });
        }
        ventana.setVisible(true);
    }
}
