
import javax.swing.*;

public class Ejercicio2 {
    public static void main(String[] args) {
        JFrame ventana = new JFrame("Contador");
        ventana.setSize(300, 200);
        ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel panel = new JPanel();
        ventana.add(panel);
        //ETIQUETA CON EL NUMERO
        JLabel numero = new JLabel("0");
        panel.add(numero);
        //ETIQUETA CON EL BOTON DE SUBIR
        JButton aumentar = new JButton("Aumentar");
        panel.add(aumentar);
        //ETIQUETA QUE resta
        JButton restar = new JButton("Reset");
        panel.add(restar);
        //ARRAID CON EL CONTAOR
        //EL add.ActionListener es un bucle que mantiene en funcionamiento el boton cada que este, se haga un click
        //EN ESTE CASO, SUBE EL CONTADOR
        aumentar.addActionListener(e -> {
            int num = Integer.parseInt(numero.getText());
            num++;
            numero.setText("" + num);
        });
        
        //ESTE ES LO QUE resta, DAMOS AL CONTADOR, UN 0
        restar.addActionListener(e -> {
            int num = Integer.parseInt(numero.getText());
            if (num>0) {
                num--;
            }
            numero.setText("" + num);
        });
        

        ventana.setVisible(true);
    }
}
