import javax.swing.*;

public class calcular {
    public static void main(String[] args) {
        JFrame ventana = new JFrame("contaor");
        ventana.setSize(400, 300);
        ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JPanel panelPrincipal = new JPanel();
        ventana.add(panelPrincipal);
        JButton Sumar = new JButton("Sumar");
        JButton Restar = new JButton("Restar");
        JButton Multiplicar = new JButton("Multiplicar");
        JButton Dividir = new JButton("Dividir");
        JTextField numero1 = new JTextField(20);
        JTextField numero2 = new JTextField(20);
        JTextField caja = new JTextField(10);
        panelPrincipal.add(numero1);
        panelPrincipal.add(numero2);
        panelPrincipal.add(caja);
        panelPrincipal.add(Sumar);
        panelPrincipal.add(Restar);
        panelPrincipal.add(Multiplicar);
        panelPrincipal.add(Dividir);

        Sumar.addActionListener(e -> {
            int num1 = Integer.parseInt(numero1.getText());
            int num2 = Integer.parseInt(numero2.getText());
            int resultado = num1 + num2;
            caja.setText("" + resultado);
        });
        Restar.addActionListener(e -> {
            int num1 = Integer.parseInt(numero1.getText());
            int num2 = Integer.parseInt(numero2.getText());
            int resultado = num1 - num2;
            caja.setText("" + resultado);
        });
        Multiplicar.addActionListener(e -> {
            int num1 = Integer.parseInt(numero1.getText());
            int num2 = Integer.parseInt(numero2.getText());
            int resultado = num1 * num2;
            caja.setText("" + resultado);
        });
        Dividir.addActionListener(e -> {
            int num1 = Integer.parseInt(numero1.getText());
            int num2 = Integer.parseInt(numero2.getText());
            int resultado = num1 / num2;
            caja.setText("" + resultado);
        });
        ventana.setVisible(true);
    }
}