import javax.swing.*;
import java.util.Random;

public class Ejercicio10 {
    public static void main(String[] args) {

        JFrame ventana = new JFrame("Chistes y Adivinanzas");
        ventana.setSize(300, 150);
        ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel panel = new JPanel();
        ventana.add(panel);

        JButton chistes = new JButton("Chistes");
        JButton adivinanzas = new JButton("Adivinanzas");

        panel.add(chistes);
        panel.add(adivinanzas);

        String[] listaChistes = {
                "Van 2 en una moto y se caen, te ha hecho gracia? No, porque la moto es tuya",
                "Que huele a pintura y es verde? La Pintura Verde",
                "Una vez vi un barco de vela, y se apagó"
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
