import javax.swing.*;
import java.awt.*;

public class ExamenB9 {
    public static void main(String[] args) {
        // Ventana principal
        JFrame ventana = new JFrame("EXAMEN - Calculadora de Productos");
        ventana.setSize(480, 300);
        ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        ventana.setLocationRelativeTo(null);

        // Cabecera
        JLabel header = new JLabel("Producto    |    Precio    |    Unidades", SwingConstants.CENTER);
        header.setBorder(BorderFactory.createEmptyBorder(8, 8, 8, 8));
        ventana.add(header, BorderLayout.NORTH);

        // Panel con GridLayout: 5 filas x 3 columnas (4 productos + fila de acción)
        JPanel grid = new JPanel(new GridLayout(5, 3, 6, 6));
        grid.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));
        ventana.add(grid, BorderLayout.CENTER);

        // Campos para 4 productos
        JTextField[] tfProducto = new JTextField[4];
        JTextField[] tfPrecio = new JTextField[4];
        JTextField[] tfUnidades = new JTextField[4];

        for (int i = 0; i < 4; i++) {
            tfProducto[i] = new JTextField("Producto " + (char)('A' + i));
            tfPrecio[i] = new JTextField("26,00 €");
            tfUnidades[i] = new JTextField("3");

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

        // Acción del botón usando lambda tal como aparece en el PDF
        botonCalcular.addActionListener(e -> {
            double sumaPrecios = 0.0;
            double sumaUnidades = 0.0;

            for (int i = 0; i < 4; i++) {
                String precioRaw = tfPrecio[i].getText().trim();
                precioRaw = precioRaw.replace("€", "").replaceAll("\\s+", "");
                precioRaw = precioRaw.replace(",", "."); // aceptar coma decimal

                String unidadesRaw = tfUnidades[i].getText().trim();

                try {
                    double p = Double.parseDouble(precioRaw);
                    double u = Double.parseDouble(unidadesRaw);
                    sumaPrecios += p;
                    sumaUnidades += u;
                } catch (NumberFormatException ex) {
                    // Mostrar aviso con JOptionPane tal como indica el PDF
                    JOptionPane.showMessageDialog(ventana,
                        "Formato inválido en la fila " + (i + 1) + ". Usa números en Precio y Unidades.",
                        "Error de formato", JOptionPane.WARNING_MESSAGE);
                    return;
                }
            }

            double resultado = sumaPrecios * sumaUnidades; // fórmula de la hoja
            String resultadoFormateado = String.format("%.2f", resultado) + " €";
            tfResultado.setText(resultadoFormateado);
            JOptionPane.showMessageDialog(ventana, "Resultado = " + resultadoFormateado);
        });

        ventana.setVisible(true);
    }
}
