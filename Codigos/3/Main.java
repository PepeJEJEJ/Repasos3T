import java.util.HashMap;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        HashMap<String, String> diccionario = new HashMap<>();
        for (int i = 0; i < 5; i++) {
            String español = sc.nextLine();
            String ingles = sc.nextLine();
            System.out.println(i);
            diccionario.put(español, ingles + (i));
        }
        String Llave = sc.nextLine();
        System.out.println(diccionario.containsKey(Llave));
    }
}