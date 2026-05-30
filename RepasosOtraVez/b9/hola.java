import javax.swing.*;

public class hola {
    public static void main(String[] args) {
        JFrame ventana = new JFrame("hola");
        ventana.setSize(400, 300);
        ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JPanel panelPrincipal = new JPanel();
        ventana.add(panelPrincipal);
        JTextField cajaTexto = new JTextField(20);
        JButton botonGuardar = new JButton("Saludar");
        JLabel etiquetaSalida = new JLabel("");
        panelPrincipal.add(cajaTexto);
        panelPrincipal.add(botonGuardar);
        panelPrincipal.add(etiquetaSalida);
        botonGuardar.addActionListener(e -> {
            String datoIngresado = cajaTexto.getText();
            etiquetaSalida.setText("Hola " + datoIngresado);
        });

        ventana.setVisible(true);
    }
}