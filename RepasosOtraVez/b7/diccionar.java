import java.util.*;

public class diccionar {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        HashMap<String, String> palabras = new HashMap<>();
        try {
            int i = 0;
            do {
                System.out.println("Dame algo en Español");
                String Español = sc.nextLine();
                System.out.println("Dame algo en Ingles");
                String Ingles = sc.nextLine();
                palabras.put(Español, Ingles);
                i += 1;
            } while (i < 5);
            System.out.println("Dame algo en español");
            String Traducir = sc.nextLine();
            if (palabras.containsKey(Traducir)) {
                System.out.println(palabras.get(Traducir));
            } else {
                System.out.println("No sale");
            }
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}