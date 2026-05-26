import javax.swing.*;

public class Main2 {
    public static void main(String[] args) {
        JFrame ventana = new JFrame("Segundo");
        ventana.setSize(400, 300);
        ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel panelPrincipal = new JPanel();
        ventana.add(panelPrincipal);

        JLabel etiquetaNumero = new JLabel("0");
        panelPrincipal.add(etiquetaNumero);

        JButton botonMas = new JButton("+");
        panelPrincipal.add(botonMas);

        JButton botonReset = new JButton("Reset");
        panelPrincipal.add(botonReset);

        final int[] contador = { 0 };

        botonMas.addActionListener(e -> {
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