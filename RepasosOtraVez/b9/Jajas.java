import java.util.Random;

import javax.swing.*;

public class Jajas {
    public static void main(String[] args) {
        JFrame ventana = new JFrame("XD");
        ventana.setSize(333, 444);
        ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JPanel panel = new JPanel();
        ventana.add(panel);
        JButton Chistes = new JButton("Chistes");
        panel.add(Chistes);
        JButton Adivinar = new JButton("Acertijos");
        panel.add(Adivinar);
        String[] ListaChistes = {
                "E",
                "EA"
        };
        String[] ListaAdivinanzas = {
                "A",
                "B"
        };
        Random r = new Random();
        Chistes.addActionListener(e -> {
            int i = r.nextInt(ListaChistes.length);
            JOptionPane.showMessageDialog(ventana, ListaChistes[i], "Chiste", JOptionPane.PLAIN_MESSAGE);
        });
        Adivinar.addActionListener(e -> {
            int i = r.nextInt(ListaChistes.length);
            JOptionPane.showMessageDialog(ventana, ListaChistes[i], "Adivinar", JOptionPane.PLAIN_MESSAGE);
        });
        ventana.setVisible(true);
    }
}
