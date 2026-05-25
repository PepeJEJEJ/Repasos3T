import javax.swing.*;
import java.awt.*;

public class EXAMENCORREG {
    public static void main(String[] args) {

        JFrame ventana = new JFrame("EXAMEN");
        ventana.setSize(400, 300);
        ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Panel principal con BorderLayout
        JPanel principal = new JPanel(new BorderLayout());
        ventana.add(principal);

        // Cabecera
        JLabel cabecera = new JLabel("PRODUCTO     PRECIO     UNIDADES", SwingConstants.CENTER);
        principal.add(cabecera, BorderLayout.NORTH);

        // Panel tabla 5x3
        JPanel tabla = new JPanel(new GridLayout(5, 3));
        principal.add(tabla, BorderLayout.CENTER);

        // Arrays para guardar los campos
        JTextField[] productos = new JTextField[5];
        JTextField[] precios = new JTextField[5];
        JTextField[] unidades = new JTextField[5];

        // 5 filas
        for (int i = 0; i < 5; i++) {
            productos[i] = new JTextField();
            precios[i] = new JTextField();
            unidades[i] = new JTextField();

            tabla.add(productos[i]);
            tabla.add(precios[i]);
            tabla.add(unidades[i]);
        }

        // Botón CALCULAR abajo
        JButton calcular = new JButton("CALCULAR");
        principal.add(calcular, BorderLayout.SOUTH);

        calcular.addActionListener(e -> {
            double total = 0;

            for (int i = 0; i < 5; i++) {
                try {
                    double p = Double.parseDouble(precios[i].getText());
                    int u = Integer.parseInt(unidades[i].getText());
                    total += p * u;
                } catch (Exception ex) {
                    // Ignorar errores
                }
            }

            JOptionPane.showMessageDialog(ventana, "TOTAL = " + total);
        });

        ventana.setVisible(true);
    }
}
