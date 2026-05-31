import java.util.*;

public class Amazon {
    public static void main(String[] args) {
        HashMap<String, Carrito> carro = new HashMap<String, Carrito>();
        carro.put("911S", new Carrito(Arrays.asList("Microfono", "PC", "Movil")));
        carro.put("286S", new Carrito(Arrays.asList("Silla", "Preservativo", "Aceite de bebes")));
        carro.put("666P", new Carrito(Arrays.asList("Cristal Azul", "Mascota Piedra", "Pantallita")));
        Scanner sc = new Scanner(System.in);

        try {
            System.out.print("DNI: ");
            String dni = sc.nextLine().trim();

            if (!carro.containsKey(dni)) {
                System.out.println("No existe.");
            } else {
                System.out.println(carro.get(dni).toString());
            }

        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
