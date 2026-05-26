import javax.swing.*;
import java.awt.*;

public class Main8 {
    public static void main(String[] args) {

        JFrame ventana = new JFrame("A la Burra le πk el Ch8 Panel de Control");
        ventana.setSize(400, 300);
        ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        ventana.setLayout(new BorderLayout());

        JLabel titulo = new JLabel("Panel de Admin", SwingConstants.CENTER);
        ventana.add(titulo, BorderLayout.NORTH);

        JLabel estado = new JLabel("Estado: ON", SwingConstants.CENTER);
        estado.setForeground(Color.GREEN);
        ventana.add(estado, BorderLayout.SOUTH);

        JPanel oeste = new JPanel();
        oeste.setLayout(new BoxLayout(oeste, BoxLayout.Y_AXIS));

        JButton usuarios = new JButton("Usuarios");
        JButton config = new JButton("Configuración");
        JButton logs = new JButton("Logs");

        oeste.add(usuarios);
        oeste.add(config);
        oeste.add(logs);

        ventana.add(oeste, BorderLayout.WEST);

        JButton salir = new JButton("Salir");
        ventana.add(salir, BorderLayout.EAST);

        JLabel contenido = new JLabel("Contenido principal", SwingConstants.CENTER);
        ventana.add(contenido, BorderLayout.CENTER);

        ventana.setVisible(true);
    }
}
