import java.util.*;

public class Cinco {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        HashMap<String, ArrayList<String>> carritos = new HashMap<>();
        try {
            carritos.put("111A", new ArrayList<>(Arrays.asList("Ratón Logitech", "Teclado Mecánico", "Monitor 24")));
            carritos.put("222B", new ArrayList<>(Arrays.asList("iPhone 15", "Funda", "Protector pantalla")));
            carritos.put("333C", new ArrayList<>(Arrays.asList("Camiseta Nike", "Pantalón Adidas", "Zapatillas Puma")));
            System.out.println("De qué usuario quieres ver el carrito");
            String DNI = sc.nextLine();
            if (carritos.containsKey(DNI)) {
                System.out.println(carritos.get(DNI));
            } else {
                System.out.println("NO SE ENCUENTRA");
            }
        } catch (Exception e) {
            System.out.println(" Error: " + e);
        }
    }
}