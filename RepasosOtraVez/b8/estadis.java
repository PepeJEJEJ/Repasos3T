import java.io.*;
import java.util.Scanner;

public class estadis {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            BufferedReader br = new BufferedReader(new FileReader("notas.txt"));
            br.readLine();
            br.close();
        } catch (Exception e) {
            System.err.println("Error " + e);
        }
    }
}
