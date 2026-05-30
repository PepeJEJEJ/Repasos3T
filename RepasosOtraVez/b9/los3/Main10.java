import javax.swing.*;
import java.util.Random;

public class Main10 {
    public static void main(String[] args) {

        JFrame ventana = new JFrame("Decimo");
        ventana.setSize(300, 150);
        ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel panel = new JPanel();
        ventana.add(panel);

        JButton chistes = new JButton("Chistes");
        JButton adivinanzas = new JButton("Adivinanzas");

        panel.add(chistes);
        panel.add(adivinanzas);

        String[] listaChistes = {
                "Papa, papa, en el colegio me dicen despistado! Ha elegido, Gasoleo C",
                "Que huele a pintura y es verde? La Pintura Verde",
                "Una vez vi un barco de vela, y se apagó",
                "X: Usted tiene la tarjeta Dia? Yo: Y de noche...",
                "Que es rojo y malo para los dientes? Un Ladrillo",
                "Van dos y se cae el de enmedio"
        };

        String[] listaAdivinanzas = {
                "Que tiene el rey en la panza (Su Ombligo)",
                "No Es oro, y plata no es (El Platano)",
                "Que Animal por la mañana va a 4 patas, por la tarde a 2 y por la noche a 3? (El Ser Humano)"
        };

        Random r = new Random();

        chistes.addActionListener(e -> {
            int i = r.nextInt(listaChistes.length);
            JOptionPane.showMessageDialog(ventana, listaChistes[i], "Chiste", JOptionPane.PLAIN_MESSAGE);
        });

        adivinanzas.addActionListener(e -> {
            int i = r.nextInt(listaAdivinanzas.length);
            JOptionPane.showMessageDialog(ventana, listaAdivinanzas[i], "Adivinanza", JOptionPane.PLAIN_MESSAGE);
        });

        ventana.setVisible(true);
    }
}
