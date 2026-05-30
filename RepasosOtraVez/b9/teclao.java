import java.awt.*;
import javax.swing.*;

public class teclao {
    public static void main(String[] args) {
        JFrame ventana = new JFrame("Teclao");
        ventana.setSize(400, 300);
        ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JPanel panelPrincipal = new JPanel();
        panelPrincipal.setLayout(new GridLayout(3, 3));
        ventana.add(panelPrincipal);
        JLabel etiquetaNumero = new JLabel("", SwingConstants.CENTER);
        ventana.add(etiquetaNumero, BorderLayout.NORTH);
        final int[] contador = { 0 };
        for (int i = 1; i <= 9; i++) {
            JButton boton = new JButton(String.valueOf(i));
            panelPrincipal.add(boton);

            boton.addActionListener(e -> {
                etiquetaNumero.setText(etiquetaNumero.getText() + boton.getText());
            });
        }
        ventana.setVisible(true);
    }
}
