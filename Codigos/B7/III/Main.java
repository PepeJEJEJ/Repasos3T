package III;

import java.util.HashMap;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        HashMap<String, String> diccionario = new HashMap<>();
        for (int i = 0; i < 5; i++) {
            System.out.println("Dame la palabra en Español");
            String español = sc.nextLine();
            System.out.println("Dame la traduccion en Ingles");
            String ingles = sc.nextLine();
            diccionario.put(español, ingles);
        }
        System.out.println("Dame la palabra en español que debo buscar");
        String Llave = sc.nextLine();
        if (diccionario.containsKey(Llave)) {
            System.out.println(diccionario.get(Llave));
        } else {
            System.out.println("La palabra no esta en el diccionario");
        }
    }
}