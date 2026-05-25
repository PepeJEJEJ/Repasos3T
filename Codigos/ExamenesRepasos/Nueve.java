import javax.swing.*;
import java.awt.*;

public class Nueve {
    public static void main(String[] args) {
        JFrame ventana = new JFrame("EXAMEN");
        ventana.setSize(300, 300);
        ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JPanel panel = new JPanel(new GridLayout(5, 3));
        ventana.add(panel, BorderLayout.CENTER);
        JLabel L1 = new JLabel(" PRODUCTOS " + " PRECIO " + " UNIDADES ", SwingConstants.CENTER);
        ventana.add(L1, BorderLayout.NORTH);
        for (int i = 1; i <= 14; i++) {
            if (i == 13) {
                JLabel c1 = new JLabel("CALCULAR");
                JButton boton = new JButton(String.valueOf(" CALCULAR"));
                panel.add(boton);
            } else if (i == 14) {
                JTextField campo = new JTextField("Resultado");
                panel.add(campo);
                campo.addActionListener(e -> {
                    L1.setText(L1.getText() + campo.getText());
                });
            } else {
                JTextField campo = new JTextField();
                panel.add(campo);
                campo.addActionListener(e -> {
                    L1.setText(L1.getText() + campo.getText());
                });
            }
        }
        ventana.setVisible(true);
    }
}
