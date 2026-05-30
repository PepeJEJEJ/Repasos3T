import javax.swing.*;

public class loginbasic {
    public static void main(String[] args) {
        JFrame ventana = new JFrame("Login_básico");
        ventana.setSize(400, 300);
        ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JPanel panelPrincipal = new JPanel();
        ventana.add(panelPrincipal);
        
        ventana.setVisible(true);
    }
}
