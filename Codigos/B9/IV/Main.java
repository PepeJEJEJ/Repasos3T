package IV;

import javax.swing.*;
import java.awt.*;

public class Main {
    public static void main(String[] args) {
        JFrame ventana = new JFrame("Conversor de Color");
        ventana.setSize(300, 200);
        ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JPanel panelPrincipal = new JPanel();
        ventana.add(panelPrincipal);
        panelPrincipal.setLayout(new FlowLayout());
        JLabel etiqueta = new JLabel("COLOR:");
        panelPrincipal.add(etiqueta);
        JButton Rojo = new JButton("Rojo");
        panelPrincipal.add(Rojo);
        JButton Verde = new JButton("Verde");
        panelPrincipal.add(Verde);
        JButton Azul = new JButton("Azul");
        panelPrincipal.add(Azul);
        Rojo.addActionListener(e -> {
            etiqueta.setForeground(Color.RED);
        });
        Verde.addActionListener(e -> {
            etiqueta.setForeground(Color.GREEN);
        });
        Azul.addActionListener(e -> {
            etiqueta.setForeground(Color.BLUE);
        });
        ventana.setVisible(true);
    }
}
