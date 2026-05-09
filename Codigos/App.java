import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        String nombre = sc.nextLine();
        int edad = sc.nextInt();
        Persona p = new Persona(nombre, edad);

        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("Persona.txt"))) {
            oos.writeObject(p);
            System.out.println("GUARDADO CORRECTAMENTE");
        } catch (Exception e) {
            throw new Exception("ERROR AL GUARDAR EL OBJETO");
        }

        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream("Persona.txt"))) {

            Persona personaLeida = (Persona) ois.readObject();
            System.out.println("LEÍDO:");
            System.out.println(personaLeida);

        } catch (Exception e) {
            throw new Exception("ERROR AL LEER");
        }
    }
}