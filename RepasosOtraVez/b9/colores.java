import javax.swing.*;
import java.awt.*;

public class colores {
    public static void main(String[] args) {
        JFrame ventana = new JFrame("hola");
        ventana.setSize(400, 300);
        ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JPanel panelPrincipal = new JPanel();
        ventana.add(panelPrincipal);
        JButton BRojo = new JButton("ROJO");
        JButton BVerde = new JButton("VERDE");
        JButton BAzul = new JButton("AZUL");
        JLabel Etiqueta = new JLabel("COLOR");
        panelPrincipal.add(BRojo);
        panelPrincipal.add(BVerde);
        panelPrincipal.add(BAzul);
        panelPrincipal.add(Etiqueta);

        BRojo.addActionListener(e -> {
            Etiqueta.setForeground(Color.RED);
        });
        BVerde.addActionListener(e -> {
            Etiqueta.setForeground(Color.green);
        });
        BAzul.addActionListener(e -> {
            Etiqueta.setForeground(Color.BLUE);
        });
        ventana.setVisible(true);
    }
}