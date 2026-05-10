import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        HashMap<String, Carrito> mapa = new HashMap<>();
        mapa.put("911S", new Carrito(Arrays.asList("Cristal Azul", "Teclao", "Pantallita")));
        mapa.put("666D", new Carrito(Arrays.asList("Nokia", "Funda Nueva", "Cagador")));
        mapa.put("476R", new Carrito(Arrays.asList("Camiseta Pirata de Fulbo", "Pitos", "Zapas Piratas")));

        Scanner sc = new Scanner(System.in);

        try {
            System.out.print("DNI: ");
            String dni = sc.nextLine().trim();

            if (!mapa.containsKey(dni))
                throw new Exception("No existe.");

            System.out.println(mapa.get(dni));

        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        } finally {
            sc.close();
        }
    }
}
