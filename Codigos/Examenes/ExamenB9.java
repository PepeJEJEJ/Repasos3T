import javax.swing.*;
import java.awt.*;

public class ExamenB9 {
    public static void main(String[] args) {
        // Ventana principal
        JFrame ventana = new JFrame("EXAMEN - Calculadora de Productos");
        ventana.setSize(520, 320);
        ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        ventana.setLocationRelativeTo(null);

        // Cabecera (JLabel)
        JLabel header = new JLabel("Producto    |    Precio    |    Unidades", SwingConstants.CENTER);
        ventana.add(header, BorderLayout.NORTH);

        // Panel con GridLayout: 5 filas x 3 columnas (4 productos + fila de acción)
        JPanel grid = new JPanel(new GridLayout(5, 3, 6, 6));
        ventana.add(grid, BorderLayout.CENTER);

        // Campos para 4 productos (JTextField vacíos para que el usuario los rellene)
        JTextField[] tfProducto = new JTextField[4];
        JTextField[] tfPrecio = new JTextField[4];
        JTextField[] tfUnidades = new JTextField[4];

        for (int i = 0; i < 4; i++) {
            tfProducto[i] = new JTextField(); // vacío
            tfPrecio[i] = new JTextField();   // vacío
            tfUnidades[i] = new JTextField(); // vacío

            grid.add(tfProducto[i]);
            grid.add(tfPrecio[i]);
            grid.add(tfUnidades[i]);
        }

        // Fila final: botón CALCULAR, campo resultado y placeholder
        JButton botonCalcular = new JButton("BotonCalcular");
        JTextField tfResultado = new JTextField();
        tfResultado.setEditable(false);

        grid.add(botonCalcular);
        grid.add(tfResultado);
        grid.add(new JLabel("")); // placeholder para completar la fila

        // Acción del botón usando ActionListener (lambda)
        botonCalcular.addActionListener(e -> {
            double sumaPrecios = 0.0;
            double sumaUnidades = 0.0;

            for (int i = 0; i < 4; i++) {
                String precioRaw = tfPrecio[i].getText().trim();
                String unidadesRaw = tfUnidades[i].getText().trim();

                // Si ambos campos están vacíos, los tratamos como cero y seguimos
                if (precioRaw.isEmpty() && unidadesRaw.isEmpty()) {
                    continue;
                }

                // Normalizar precio: quitar símbolo euro y espacios, aceptar coma decimal
                precioRaw = precioRaw.replace("€", "").replaceAll("\\s+", "");
                precioRaw = precioRaw.replace(",", ".");

                // Validación: si uno está vacío y el otro no, avisar
                if (precioRaw.isEmpty() || unidadesRaw.isEmpty()) {
                    JOptionPane.showMessageDialog(ventana,
                        "Fila " + (i + 1) + ": rellena Precio y Unidades o deja ambos vacíos.",
                        "Formato inválido", JOptionPane.WARNING_MESSAGE);
                    return;
                }

                try {
                    double p = Double.parseDouble(precioRaw);
                    double u = Double.parseDouble(unidadesRaw);
                    sumaPrecios += p;
                    sumaUnidades += u;
                } catch (NumberFormatException ex) {
                    JOptionPane.showMessageDialog(ventana,
                        "Formato inválido en la fila " + (i + 1) + ". Usa números en Precio y Unidades.",
                        "Error de formato", JOptionPane.WARNING_MESSAGE);
                    return;
                }
            }

            double resultado = sumaPrecios * sumaUnidades; // fórmula solicitada
            String resultadoFormateado = String.format("%.2f €", resultado);
            tfResultado.setText(resultadoFormateado);
            JOptionPane.showMessageDialog(ventana, "Resultado = " + resultadoFormateado);
        });

        // Mostrar ventana
        ventana.setVisible(true);
    }
}
