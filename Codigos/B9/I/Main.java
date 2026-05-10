package I;

import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        JFrame ventana = new JFrame("La Ventana");
        ventana.setSize(400, 300);
        ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel panelPrincipal = new JPanel();
        ventana.add(panelPrincipal);

        JLabel etiqueta = new JLabel("Nombre:");
        etiqueta.setText("Nombre:");

        JTextField cajaTexto = new JTextField(20);
        panelPrincipal.add(cajaTexto);

        JButton saludar = new JButton("Saludar");
        panelPrincipal.add(saludar);

        saludar.addActionListener(e -> {
            String datoIngresado = cajaTexto.getText();
            System.out.println("HOLA " + datoIngresado);
        });
        ventana.setVisible(true);
    }
}