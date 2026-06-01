import javax.swing.*;

public class Saludar {
    public static void main(String[] args) {
        JFrame ventana = new JFrame("Saludar");
        ventana.setSize(222, 222);
        ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JPanel panel = new JPanel();
        ventana.add(panel);
        JTextField nombre = new JTextField("A");
        panel.add(nombre);
        JLabel Mensaje = new JLabel("");
        panel.add(Mensaje);
        JButton saludar = new JButton("Saludar");
        panel.add(saludar);
        saludar.addActionListener(e -> {
            Mensaje.setText("Hola " + nombre.getText());
        });
        ventana.setVisible(true);
    }
}