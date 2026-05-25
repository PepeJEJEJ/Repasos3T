import javax.swing.*;
import java.awt.*;

public class Main {
    public static void main(String[] args) {
        JFrame ventana = new JFrame("EXAMEN");//EL NOMBRE VENTANA
        ventana.setSize(300, 300);//EL ANCHO Y ALTO
        ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//CERRAR FACIL

        JPanel panel = new JPanel(new GridLayout(5, 3));//ALTURA Y ANCHO
        ventana.add(panel, BorderLayout.CENTER);
        JLabel L1 = new JLabel(" PRODUCTOS " + " PRECIO " + " UNIDADES ", SwingConstants.CENTER);//LA ETIQUETA DE POSICION
        ventana.add(L1, BorderLayout.NORTH);//LA POSICION DE LA VENTANA
        for (int i = 1; i <= 13; i++) {//BUCLE QUE NOS FACILITA ESTO
            if (i==13) {//PA QUE SALGA CALCULAR (NO CALCULA PERO ES TODO LO QUE PUDE)
            JLabel c1 = new JLabel("CALCULAR");
            JButton boton = new JButton(String.valueOf(" CALCULA"));
            panel.add(boton);
            } else {
            JButton boton = new JButton(String.valueOf(""));
            panel.add(boton);//SON BOTONES PQ NO PUDE HACER CUADROS DE TEXTO
            boton.addActionListener(e -> {
                L1.setText(L1.getText() + boton.getText());
            });
            }
        }
        ventana.setVisible(true);//ver la ventana
    }
}