package V;

import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        double cambio=0.80;
        JFrame ventana = new JFrame("Conversor Euros/Dólares");
        ventana.setSize(300, 150);
        ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel panel = new JPanel();
        ventana.add(panel);

        JTextField campo = new JTextField(10);
        panel.add(campo);

        JLabel resultado = new JLabel("Resultado");
        panel.add(resultado);

        JButton ConEuro = new JButton("Dolares=>Euros");
        panel.add(ConEuro);
        JButton ConDolares = new JButton("Euros=>Dolares");
        panel.add(ConDolares);

        ConEuro.addActionListener(e -> {
            Double valor=Double.parseDouble(campo.getText());
            resultado.setText(""+(valor*cambio));
        });
        ConDolares.addActionListener(e -> {
            Double valor=Double.parseDouble(campo.getText());
            resultado.setText(""+(valor/cambio));
        });
        ventana.setVisible(true);
    }
}