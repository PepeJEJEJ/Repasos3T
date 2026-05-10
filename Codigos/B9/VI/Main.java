package VI;

import java.awt.*;
import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        JFrame ventana = new JFrame("Teclado");
        ventana.setSize(300, 150);
        ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JPanel panelPrincipal = new JPanel();
        ventana.add(panelPrincipal);
        panelPrincipal.setLayout(new GridLayout(3, 3));
        JLabel resultado = new JLabel("Resultado");
        ventana.add(resultado);
        for (int i = 0; i <= 9; i++) {
            JButton boton = new JButton(String.valueOf(i));
            panelPrincipal.add(boton);

            boton.addActionListener(e -> {
                resultado.setText(resultado.getText() + boton.getText());
            });
        }
        ventana.setVisible(true);
    }
}
