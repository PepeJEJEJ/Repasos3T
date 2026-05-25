import java.sql.*;
import java.util.Scanner;

public class ExamenB10 {
    // Datos de conexión (ajusta usuario/contraseña según tu entorno)
    private static final String URL = "jdbc:mysql://localhost:3306/biblioteca";
    private static final String USER = "root";
    private static final String PASSWORD = "Med@c";

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int opcion = 0;

        do {
            System.out.println("\n--- MENÚ ---");
            System.out.println("1. Listado básico");
            System.out.println("2. Reservar");
            System.out.println("3. Añadir Libro");
            System.out.println("4. Salir");
            System.out.print("Opción: ");

            String linea = sc.nextLine().trim();
            try {
                opcion = Integer.parseInt(linea);
            } catch (NumberFormatException nfe) {
                System.out.println("Introduce un número válido.");
                continue;
            }

            switch (opcion) {
                case 1:
                    MostrarTodo(sc);
                    break;
                case 2:
                    Reservar(sc);
                    break;
                case 3:
                    Añadir(sc);
                    break;
                case 4:
                    System.out.println("Chau");
                    break;
                default:
                    System.out.println("Opción no válida.");
            }

        } while (opcion != 4);

        sc.close();
    }

    // MostrarTodo: pide D para mostrar disponibles y ejecuta SELECT con executeQuery()
    public static void MostrarTodo(Scanner sc) {
        System.out.print("Ver Disponibles (D): ");
        String opcion = sc.nextLine().trim().toUpperCase();

        String sql;
        if ("D".equals(opcion)) {
            sql = "SELECT id, titulo, autor, disponible FROM libros WHERE disponible = 1";
        } else {
            System.out.println("Opción inválida.");
            return;
        }

        // try-with-resources para cerrar automáticamente Connection, PreparedStatement y ResultSet
        try (Connection conn = DriverManager.getConnection(URL, USER, PASSWORD);
             PreparedStatement stmt = conn.prepareStatement(sql);
             ResultSet rs = stmt.executeQuery()) {

            while (rs.next()) {
                int id = rs.getInt("id");
                String titulo = rs.getString("titulo");
                String autor = rs.getString("autor");
                boolean disponible = rs.getBoolean("disponible");
                System.out.println(id + " - " + titulo + " - " + autor + " - Disponible: " + disponible);
            }

        } catch (SQLException e) {
            System.out.println("Error de SQL: " + e.getMessage());
        } catch (Exception e) {
            System.out.println("Error desconocido: " + e.getMessage());
        }
    }

    // Reservar: actualiza el campo disponible usando executeUpdate()
    public static void Reservar(Scanner sc) {
        try {
            System.out.print("Dame el ID (Libro): ");
            int id = Integer.parseInt(sc.nextLine().trim());

            System.out.print("Pon pa reservar (1 para disponible, 0 para no disponible): ");
            int reservar = Integer.parseInt(sc.nextLine().trim());

            String sql = "UPDATE libros SET disponible = ? WHERE id = ?";

            try (Connection conn = DriverManager.getConnection(URL, USER, PASSWORD);
                 PreparedStatement stmt = conn.prepareStatement(sql)) {

                stmt.setInt(1, reservar);
                stmt.setInt(2, id);

                int filasActualizadas = stmt.executeUpdate();
                System.out.println("Filas actualizadas: " + filasActualizadas);
            } catch (SQLException e) {
                System.out.println("Error de SQL: " + e.getMessage());
            }

        } catch (NumberFormatException nfe) {
            System.out.println("ID o valor de reserva no válido.");
        } catch (Exception e) {
            System.out.println("Error desconocido: " + e.getMessage());
        }
    }

    // Añadir: usa INSERT con parámetros (?) y executeUpdate()
    public static void Añadir(Scanner sc) {
        System.out.print("Nombre del libro: ");
        String nombre = sc.nextLine().trim();
        System.out.print("Nombre del autor: ");
        String autor = sc.nextLine().trim();

        String sql = "INSERT INTO libros (titulo, autor, disponible) VALUES (?, ?, ?)";

        try (Connection conn = DriverManager.getConnection(URL, USER, PASSWORD);
             PreparedStatement stmt = conn.prepareStatement(sql)) {

            stmt.setString(1, nombre);
            stmt.setString(2, autor);
            stmt.setBoolean(3, true); // por defecto disponible = true

            int filas = stmt.executeUpdate();
            System.out.println("Libro insertado. Filas afectadas: " + filas);

        } catch (SQLException e) {
            System.out.println("Error de SQL: " + e.getMessage());
        } catch (Exception e) {
            System.out.println("Error desconocido: " + e.getMessage());
        }
    }
}
