import javax.swing.*;
import java.awt.*;

public class Siete {
    public static void main(String[] args) {

        JFrame ventana = new JFrame("Por el qlo 7 mueve el Teclado");
        ventana.setSize(250, 300);
        ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JLabel resultado = new JLabel("", SwingConstants.CENTER);
        ventana.add(resultado, BorderLayout.NORTH);

        JPanel panel = new JPanel(new GridLayout(3, 3));
        ventana.add(panel, BorderLayout.CENTER);

        for (int i = 1; i <= 9; i++) {
            JButton boton = new JButton(String.valueOf(i));
            panel.add(boton);

            boton.addActionListener(e -> resultado.setText(resultado.getText() + boton.getText())

            );
        }

        ventana.setVisible(true);
    }
}
