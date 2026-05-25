
import javax.swing.*;

public class Ejercicio3 {
    public static void main(String[] args) {
        JFrame ventana = new JFrame("Contador");
        ventana.setSize(300, 200);
        ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel panel = new JPanel();
        ventana.add(panel);

        JLabel numero1 = new JLabel("0");
        panel.add(numero1);

        JLabel numero2 = new JLabel("0");
        panel.add(numero2);

        JButton sumar = new JButton("Sumar");
        panel.add(sumar);

        JButton restar = new JButton("Reset");
        panel.add(restar);

        JButton multiplicar = new JButton("Multiplicar");
        panel.add(multiplicar);

        JButton dividir = new JButton("Dividir");
        panel.add(dividir);

        sumar.addActionListener(e -> {
            int num1 = Integer.parseInt(numero1.getText());
            int num2 = Integer.parseInt(numero2.getText());
            int resultado = num1 + num2;
            numero1.setText("" + resultado);
        });

        restar.addActionListener(e -> {
            int num1 = Integer.parseInt(numero1.getText());
            int num2 = Integer.parseInt(numero2.getText());
            int resultado = num1 - num2;
            numero1.setText("" + resultado);
        });

        multiplicar.addActionListener(e -> {
            int num1 = Integer.parseInt(numero1.getText());
            int num2 = Integer.parseInt(numero2.getText());
            int resultado = num1 * num2;
            numero1.setText("" + resultado);
        });

        dividir.addActionListener(e -> {
            int num1 = Integer.parseInt(numero1.getText());
            int num2 = Integer.parseInt(numero2.getText());
            int resultado = num1 / num2;
            numero1.setText("" + resultado);
        });
        ventana.setVisible(true);
    }
}
