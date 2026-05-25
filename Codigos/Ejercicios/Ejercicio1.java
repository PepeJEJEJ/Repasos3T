import javax.swing.*;

public class Ejercicio1 {
    public static void main(String[] args) {
        JFrame ventana = new JFrame("Saludo");
        ventana.setSize(300, 150);
        ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel panel = new JPanel();
        ventana.add(panel);

        JTextField caja = new JTextField(15);
        JButton boton = new JButton("Guardar");
        JLabel salida = new JLabel("");

        panel.add(caja);
        panel.add(boton);
        panel.add(salida);

        boton.addActionListener(e -> {
            String nombre = caja.getText();
            salida.setText("Hola " + nombre);
        });
        ventana.setVisible(true);
    }
}
