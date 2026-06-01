import javax.swing.*;

public class Calculadora {
    public static void main(String[] args) {
        JFrame ventana = new JFrame("Calculadora");
        ventana.setSize(222, 222);
        ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JPanel panel = new JPanel();
        ventana.add(panel);
        JTextField numero1 = new JTextField(10);
        panel.add(numero1);
        JTextField numero2 = new JTextField(10);
        panel.add(numero2);
        JTextField cajaRes = new JTextField(10);
        panel.add(cajaRes);
        JButton sumar = new JButton("sumar");
        panel.add(sumar);
        sumar.addActionListener(e -> {
            int n1 = Integer.parseInt(numero1.getText());
            int n2 = Integer.parseInt(numero2.getText());
            int resultado = n1 + n2;
            cajaRes.setText("" + resultado);
        });
        JButton restar = new JButton("restar");
        panel.add(restar);
        restar.addActionListener(e -> {
            int n1 = Integer.parseInt(numero1.getText());
            int n2 = Integer.parseInt(numero2.getText());
            int resultado = n1 - n2;
            cajaRes.setText("" + resultado);
        });
        JButton multiplicar = new JButton("multiplicar");
        panel.add(multiplicar);
        restar.addActionListener(e -> {
            int n1 = Integer.parseInt(numero1.getText());
            int n2 = Integer.parseInt(numero2.getText());
            int resultado = n1 * n2;
            cajaRes.setText("" + resultado);
        });
        JButton dividir = new JButton("dividir");
        panel.add(dividir);
        restar.addActionListener(e -> {
            int n1 = Integer.parseInt(numero1.getText());
            int n2 = Integer.parseInt(numero2.getText());
            int resultado = n1 / n2;
            cajaRes.setText("" + resultado);
        });
        ventana.setVisible(true);
    }
}
