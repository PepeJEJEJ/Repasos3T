import javax.swing.*;

public class eurdol {
    public static void main(String[] args) {
        JFrame ventana = new JFrame("contaor");
        ventana.setSize(400, 300);
        ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JPanel panelPrincipal = new JPanel();
        ventana.add(panelPrincipal);
        JButton ConvertiraEuro = new JButton("Euro");
        JButton ConvertiraDolar = new JButton("Dolar");

        JTextField euros = new JTextField("Euros");
        JTextField dolares = new JTextField("Dolares");
        JTextField caja = new JTextField(10);
        panelPrincipal.add(euros);
        panelPrincipal.add(dolares);
        panelPrincipal.add(caja);
        panelPrincipal.add(ConvertiraEuro);
        panelPrincipal.add(ConvertiraDolar);

        ConvertiraEuro.addActionListener(e -> {
            int dolar = Integer.parseInt(dolares.getText());
            double resultado = dolar * 1.1663;
            caja.setText("" + resultado);
        });
        ConvertiraDolar.addActionListener(e -> {
            int euro = Integer.parseInt(euros.getText());
            double resultado = euro * 0.8577;
            caja.setText("" + resultado);
        });
        ventana.setVisible(true);
    }
}
