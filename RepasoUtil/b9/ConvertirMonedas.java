import javax.swing.*;

public class ConvertirMonedas {
    public static void main(String[] args) {
        JFrame ventana = new JFrame("Convertir Monedas");
        ventana.setSize(222, 222);
        ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JPanel panel = new JPanel();
        ventana.add(panel);
        JTextField euros = new JTextField("euros");
        panel.add(euros);
        JTextField dolares = new JTextField("dolares");
        panel.add(dolares);
        JTextField cajaRes = new JTextField(10);
        panel.add(cajaRes);
        JButton pasarADolares = new JButton("Convertir a Dolares");
        pasarADolares.addActionListener(e -> {
            int duros = Integer.parseInt(euros.getText());
            double resultado = duros * 0.86;
            cajaRes.setText("" + resultado +" Dolares");
        });
        panel.add(pasarADolares);
        JButton pasarAEuros = new JButton("Convertir a Euros");
        pasarAEuros.addActionListener(e -> {
            int pavos = Integer.parseInt(dolares.getText());
            double resultado = pavos * 1.16;
            cajaRes.setText("" + resultado+" Euros");
        });
        panel.add(pasarAEuros);
        ventana.setVisible(true);
    }
}