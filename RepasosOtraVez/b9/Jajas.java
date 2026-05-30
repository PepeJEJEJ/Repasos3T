import java.util.Random;

import javax.swing.*;

public class Jajas {
    public static void main(String[] args) {
        JFrame ventana = new JFrame("XD");
        ventana.setSize(412, 313);
        ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JPanel panel=new JPanel();
        ventana.add(panel);
        JButton Chiste=new JButton("aa");
        ventana.add(Chiste);
        JButton Adivinanza=new JButton("ee");
        ventana.add(Adivinanza);
        Random r=new Random();
        String[]ListaChistes={
            "A"
        };
        String[]listaAdivinanzas={
            "B"
        };
        Chiste.addActionListener(e->{
            int i = r.nextInt(ListaChistes.length);
            JOptionPane.showInputDialog(ventana, ListaChistes[i], "AA", JOptionPane.PLAIN_MESSAGE);
        });
        Adivinanza.addActionListener(e->{
            int i = r.nextInt(listaAdivinanzas.length);
            JOptionPane.showInputDialog(ventana, listaAdivinanzas[i], "BB", JOptionPane.PLAIN_MESSAGE);
        });
        ventana.setVisible(true);
    }
}
