package II;

import javax.swing.*;

public class Main {
    public static void main(String[] args) {

        JFrame ventana = new JFrame("Contador");
        ventana.setSize(300, 200);
        ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel panel = new JPanel();
        ventana.add(panel);

        JLabel etiquetaNumero = new JLabel("0");
        panel.add(etiquetaNumero);

        JButton botonAumentar = new JButton("+");
        panel.add(botonAumentar);

        JButton botonReset = new JButton("Reset");
        panel.add(botonReset);

        final int[] contador = { 0 };

        botonAumentar.addActionListener(e -> {
            contador[0]++;
            etiquetaNumero.setText(String.valueOf(contador[0]));
        });

        botonReset.addActionListener(e -> {
            contador[0] = 0;
            etiquetaNumero.setText("0");
        });

        ventana.setVisible(true);
    }
}
