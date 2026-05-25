import javax.swing.*;
import java.awt.*;

public class ExamenB9 {
    public static void main(String[] args) {
        // Ventana principal
        JFrame ventana = new JFrame("Calculadora de Productos");
        ventana.setSize(520, 320);
        ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Cabecera (JLabel)
        JLabel header = new JLabel("Producto    |    Precio    |    Unidades", SwingConstants.CENTER);
        ventana.add(header, BorderLayout.NORTH);

        // Panel principal (JPanel) con FlowLayout (por defecto)
        JPanel panelPrincipal = new JPanel();
        panelPrincipal.setLayout(new FlowLayout()); // FlowLayout tal como aparece en el material
        ventana.add(panelPrincipal, BorderLayout.CENTER);

        // Campos para 4 productos (JTextField vacíos para que el usuario los rellene)
        JTextField[] tfProducto = new JTextField[4];
        JTextField[] tfPrecio = new JTextField[4];
        JTextField[] tfUnidades = new JTextField[4];

        for (int i = 0; i < 4; i++) {
            tfProducto[i] = new JTextField(12); // Producto (vacío)
            tfPrecio[i] = new JTextField(8); // Precio (el usuario debe introducir número puro)
            tfUnidades[i] = new JTextField(6); // Unidades

            panelPrincipal.add(tfProducto[i]);
            panelPrincipal.add(tfPrecio[i]);
            panelPrincipal.add(tfUnidades[i]);
        }

        // Panel inferior con botón y campo resultado
        JPanel panelInferior = new JPanel();
        panelInferior.setLayout(new FlowLayout()); // FlowLayout según el PDF

        JButton botonCalcular = new JButton("BotonCalcular");
        JTextField EResul = new JTextField(15);
        EResul.setEditable(false);

        panelInferior.add(botonCalcular);
        panelInferior.add(EResul);

        ventana.add(panelInferior, BorderLayout.SOUTH);

        // Acción del botón usando lambda (ActionListener) tal como aparece en el PDF
        botonCalcular.addActionListener(e -> {
            double sumaPrecios = 0.0;
            double sumaUnidades = 0.0;

            for (int i = 0; i < 4; i++) {
                String precioText = tfPrecio[i].getText().trim();
                String unidadesText = tfUnidades[i].getText().trim();

                // Si ambos campos están vacíos, ignorar la fila
                if (precioText.isEmpty() && unidadesText.isEmpty()) {
                    continue;
                }

                // Si uno está vacío y el otro no, avisar al usuario con JOptionPane
                // (documentado en el PDF)
                if (precioText.isEmpty() || unidadesText.isEmpty()) {
                    JOptionPane.showMessageDialog(ventana,
                            "Fila " + (i + 1) + ": rellena Precio y Unidades o deja ambos vacíos.",
                            "Formato inválido", JOptionPane.WARNING_MESSAGE);
                    return;
                }

                try {
                    // Se espera que el usuario introduzca números puros (ej.: 26.00)
                    double p = Double.parseDouble(precioText);
                    double u = Double.parseDouble(unidadesText);
                    sumaPrecios += p;
                    sumaUnidades += u;
                } catch (NumberFormatException ex) {
                    // Avisar al usuario con JOptionPane (uso permitido por el PDF)
                    JOptionPane.showMessageDialog(ventana,
                            "Formato inválido en la fila " + (i + 1) + ". Introduce números en Precio y Unidades.",
                            "Error de formato", JOptionPane.WARNING_MESSAGE);
                    return;
                }
            }

            // Fórmula solicitada: Resultado = SumaPrecios * SumaUnidades
            double resultado = sumaPrecios * sumaUnidades;
            // No se usa format; se muestra el número tal cual y se añade el símbolo euro
            String resultadoFormateado = Double.toString(resultado) + " €";
            EResul.setText(resultadoFormateado);
            JOptionPane.showMessageDialog(ventana, "Resultado = " + resultadoFormateado);
        });

        // Mostrar ventana
        ventana.setVisible(true);
    }
}
