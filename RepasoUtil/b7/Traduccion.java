import java.util.*;

public class Traduccion {
    public static void main(String[] args) {
        HashMap<String, String> diccionario = new HashMap<String, String>();
        Scanner sc = new Scanner(System.in);
        try {
            for (int i = 0; i <= 5;) {
                System.out.println("Escribe algo en Español");
                String Español = sc.nextLine();
                System.out.println("Pon su traduccion en Ingles");
                String Ingles = sc.nextLine();
                diccionario.put(Español, Ingles);
                i++;
            }
            System.out.println("Pon una palabra en Español");
            String BuscarPal = sc.nextLine();
            if (diccionario.containsKey(BuscarPal)) {
                System.out.println(diccionario.get(BuscarPal));
            }
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
