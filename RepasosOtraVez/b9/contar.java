import javax.swing.*;

public class contar {
    public static void main(String[] args) {
        JFrame ventana = new JFrame("contaor");
        ventana.setSize(400, 300);
        ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JPanel panelPrincipal = new JPanel();
        ventana.add(panelPrincipal);
        JButton Aumentar = new JButton("Aumentar");
        JButton Reset = new JButton("Reset");
        JLabel etiquetaNumero = new JLabel("0");
        panelPrincipal.add(Aumentar);
        panelPrincipal.add(Reset);
        panelPrincipal.add(etiquetaNumero);
        final int[] contador = { 0 };
        Aumentar.addActionListener(e -> {
            contador[0]++;
            etiquetaNumero.setText(String.valueOf(contador[0]));
        });
        Reset.addActionListener(e -> {
            contador[0]=0;
            etiquetaNumero.setText(String.valueOf(contador[0]));
        });
        ventana.setVisible(true);
    }
}