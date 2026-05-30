import java.awt.*;
import javax.swing.*;

public class panelcontro {
    public static void main(String[] args) {
        JFrame ventana = new JFrame("Login_básico");
        ventana.setSize(400, 300);
        ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel panelPrincipal = new JPanel();
        panelPrincipal.setLayout(new BorderLayout());
        ventana.add(panelPrincipal);

        JLabel titulo = new JLabel("Panel de Admin", SwingConstants.CENTER);
        ventana.add(titulo, BorderLayout.NORTH);

        JLabel estado = new JLabel("Estado: Conectado", SwingConstants.CENTER);
        ventana.add(estado, BorderLayout.SOUTH);
        estado.setForeground(Color.GREEN);

        JPanel oeste = new JPanel();
        ventana.add(oeste, BorderLayout.WEST);
        oeste.setLayout(new BoxLayout(oeste, BoxLayout.Y_AXIS));

        JButton b1 = new JButton("Usuarios");
        JButton b2 = new JButton("Configuración");
        JButton b3 = new JButton("Logs");

        oeste.add(b1);
        oeste.add(b2);
        oeste.add(b3);

        JButton fuera = new JButton("Salir");
        ventana.add(fuera, BorderLayout.EAST);

        JLabel principal = new JLabel("contenido principal");
        ventana.add(principal, BorderLayout.CENTER);

        ventana.setVisible(true);
    }
}
