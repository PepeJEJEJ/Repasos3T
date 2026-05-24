import javax.swing.*;

public class Cinco {
    public static void main(String[] args) {
        JFrame ventana = new JFrame("Por el Qlo te la Hinco");
        ventana.setSize(300, 200);
        ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JPanel panel = new JPanel();
        ventana.add(panel);
        JTextField numero1 = new JTextField(10);
        panel.add(numero1);

        JTextField numero2 = new JTextField(10);
        panel.add(numero2);

        JTextField caja1 = new JTextField(10);
        panel.add(caja1);

        JButton sumar = new JButton("Sumar");
        panel.add(sumar);

        JButton restar = new JButton("Restar");
        panel.add(restar);

        JButton multiplicar = new JButton("Multiplicar");
        panel.add(multiplicar);

        JButton dividir = new JButton("Dividir");
        panel.add(dividir);

        sumar.addActionListener(e -> {
            int num1 = Integer.parseInt(numero1.getText());
            int num2 = Integer.parseInt(numero2.getText());
            int resultado = num1 + num2;
            caja1.setText("" + resultado);
        });

        restar.addActionListener(e -> {
            int num1 = Integer.parseInt(numero1.getText());
            int num2 = Integer.parseInt(numero2.getText());
            int resultado = num1 - num2;
            caja1.setText("" + resultado);
        });
        JLabel etiqueta = new JLabel("COLOR:");
        JButton Rojo = new JButton("Rojo");
        panel.add(Rojo);
        JButton Verde = new JButton("Verde");
        panel.add(Verde);
        JButton Azul = new JButton("Azul");
        panel.add(Azul);
        Rojo.addActionListener(e -> {
            etiqueta.getForeground();
        });
        Verde.addActionListener(e -> {
            etiqueta.getForeground();
        });
    }
}
