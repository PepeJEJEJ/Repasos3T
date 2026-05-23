import java.util.*;

public class Tres {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        HashMap<String, String> diccionario = new HashMap<>();
        try {
            String Español = sc.nextLine();
            String Ingles = sc.nextLine();
            int i = 0;
            do {
                diccionario.put(Español, Ingles);
                sc.nextLine();
                i++;
            } while (i <= 5);
            System.out.println("Una palabra en español");
            String buscarPalabra = sc.nextLine();
            if (diccionario.containsKey(buscarPalabra)) {
                System.out.println(Ingles);
            } else {
                System.out.println("NO SE ENCUENTRA");
            }
        } catch (Exception e) {
            System.out.println(" Error: " + e);
        }
    }
}