import javax.swing.*;

public class Ejercicio5 {
    public static void main(String[] args) {

        JFrame ventana = new JFrame("Conversor Euros/Dolares");
        ventana.setSize(300, 150);
        ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel panel = new JPanel();
        ventana.add(panel);

        JTextField campo = new JTextField(10);
        panel.add(campo);

        JButton aDolares = new JButton("Duros → Dolares");
        JButton aEuros = new JButton("Dolares → Duros");

        panel.add(aDolares);
        panel.add(aEuros);

        JLabel resultado = new JLabel("");
        panel.add(resultado);

        aDolares.addActionListener(e -> {
            int euros = Integer.parseInt(campo.getText());
            int dolares = euros * 2;
            resultado.setText(euros + " Duros son " + dolares + " Dolares");
        });

        aEuros.addActionListener(e -> {
            int dolares = Integer.parseInt(campo.getText());
            int euros = dolares / 2;
            resultado.setText(dolares + " Dolares son " + euros + " duros");
        });

        ventana.setVisible(true);
    }
}