import javax.swing.*;
import java.awt.*;

public class Ejercicio8 {
    public static void main(String[] args) {

        JFrame ventana = new JFrame("Panel de Control");
        ventana.setSize(400, 300);
        ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        ventana.setLayout(new BorderLayout());

        JLabel titulo = new JLabel("Panel del Admin", SwingConstants.CENTER);
        ventana.add(titulo, BorderLayout.NORTH);

        JLabel estado = new JLabel("Estado: Esta ''Conectado''", SwingConstants.CENTER);
        estado.setForeground(Color.GREEN);
        ventana.add(estado, BorderLayout.SOUTH);

        JPanel Oeste = new JPanel();
        Oeste.setLayout(new BoxLayout(Oeste, BoxLayout.Y_AXIS));

        JButton usuarios = new JButton("Usuarios");
        JButton config = new JButton("Configuración");
        JButton logs = new JButton("Logs");

        Oeste.add(usuarios);
        Oeste.add(config);
        Oeste.add(logs);

        ventana.add(Oeste, BorderLayout.WEST);

        JButton salir = new JButton("Salir");
        ventana.add(salir, BorderLayout.EAST);

        JLabel contenido = new JLabel("JLabel grande", SwingConstants.CENTER);
        ventana.add(contenido, BorderLayout.CENTER);

        ventana.setVisible(true);
    }
}
