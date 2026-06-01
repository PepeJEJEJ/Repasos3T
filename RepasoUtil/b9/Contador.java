import javax.swing.*;

public class Contador {
    public static void main(String[] args) {
        JFrame ventana = new JFrame("Contador");
        ventana.setSize(222, 222);
        ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JPanel panel = new JPanel();
        ventana.add(panel);
        JLabel numero = new JLabel("0");
        final int[] contador = { 0 };
        panel.add(numero);
        JButton sumar = new JButton("sumar");
        panel.add(sumar);
        sumar.addActionListener(e -> {
            contador[0]++;
            numero.setText(String.valueOf(contador[0]));
        });
        JButton restar = new JButton("reset");
        panel.add(restar);
        restar.addActionListener(e -> {
            contador[0]--;
            numero.setText(String.valueOf(contador[0]));
        });
        ventana.setVisible(true);
    }
}
