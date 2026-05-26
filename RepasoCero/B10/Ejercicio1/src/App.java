import java.sql.*;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int opcion = 0;
        do {
            System.out.println("1. Listado basico");
            System.out.println("2. Buscar por curso");
            System.out.println("3. Media por curso");
            System.out.println("4. Aprobados/Suspensos");
            System.out.println("5. Mejor estudiante");
            System.out.println("6. Nueva matrícula");
            System.out.println("7. Actualizar nota tras la recuperación o subida de nota");
            System.out.println("8. Baja de un alumno");
            System.out.println("0. Chau");

            opcion = sc.nextInt();
            sc.nextLine();

            switch (opcion) {
                case 1:
                    mostrarListadoBasico();
                    break;
                case 2:
                    BuscarporCurso();
                    break;
                case 3:
                    CalcularMediaCurso();
                    break;
                case 4:
                    AprobadosSuspensos();
                    break;
                case 5:
                    TopEstudiante();
                    break;
                case 6:
                    Matricular();
                    break;
                case 7:
                    actualizarNota();
                    break;
                case 8:
                    Baja();
                    break;
                default:
                    break;
            }

        } while (opcion != 0);
    }

    public static void mostrarListadoBasico() {
        String url = "jdbc:mysql://localhost:3306/instituto";
        String user = "root";
        String password = "12345";

        String sql = "SELECT nombre, curso FROM alumnos";

        try {
            Connection conn = DriverManager.getConnection(url, user, password);
            PreparedStatement stmt = conn.prepareStatement(sql);
            ResultSet rs = stmt.executeQuery();

            while (rs.next()) {
                String nombre = rs.getString("nombre");
                String curso = rs.getString("curso");
                System.out.println(nombre + " - " + curso);
            }

            rs.close();
            stmt.close();
            conn.close();

        } catch (SQLException e) {
            System.out.println("Error de SQL " + e.getMessage());
        } catch (Exception e) {
            System.out.println("Error desconocido" + e.getMessage());
        }
    }

    public static void BuscarporCurso() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Mete el curso que vamos a buscar: ");
        String cursoBuscado = sc.nextLine();

        String url = "jdbc:mysql://localhost:3306/instituto";
        String user = "root";
        String password = "12345";

        String sql = "SELECT nombre, curso FROM alumnos where curso=?";

        try {
            Connection conn = DriverManager.getConnection(url, user, password);
            PreparedStatement stmt = conn.prepareStatement(sql);
            stmt.setString(1, cursoBuscado);

            ResultSet rs = stmt.executeQuery();

            while (rs.next()) {
                String nombre = rs.getString("nombre");
                String curso = rs.getString("curso");
                System.out.println(nombre + " - " + curso);
            }

            rs.close();
            stmt.close();
            conn.close();

        } catch (SQLException e) {
            System.out.println("Erorr de SQL " + e.getMessage());
        } catch (Exception e) {
            System.out.println("Error desconocido" + e.getMessage());
        }
    }

    public static void CalcularMediaCurso() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Mete el curso que vamos a buscar: ");
        String cursoBuscado = sc.nextLine();

        String url = "jdbc:mysql://localhost:3306/instituto";
        String user = "root";
        String password = "12345";

        String sql = "SELECT avg(nota_media) as Media FROM alumnos where curso=?";

        try {
            Connection conn = DriverManager.getConnection(url, user, password);
            PreparedStatement stmt = conn.prepareStatement(sql);
            ResultSet rs = stmt.executeQuery();
            stmt.setString(1, cursoBuscado);

            while (rs.next()) {
                String nombre = rs.getString("nombre");
                String curso = rs.getString("curso");
                System.out.println(nombre + " - " + curso);

            }

            rs.close();
            stmt.close();
            conn.close();

        } catch (SQLException e) {
            System.out.println("Error de SQL " + e.getMessage());
        } catch (Exception e) {
            System.out.println("Error desconocido" + e.getMessage());
        }
    }

    public static void AprobadosSuspensos() {
        Scanner sc = new Scanner(System.in);
        System.out.print("A aprobados o S suspensos: ");
        String opcion = sc.nextLine().toUpperCase();

        String url = "jdbc:mysql://localhost:3306/instituto";
        String user = "root";
        String password = "12345";

        String sql = "";

        if (opcion.equals("A")) {
            sql = "SELECT nombre, curso, nota_media FROM alumnos WHERE nota_media >= 5";
        } else if (opcion.equals("S")) {
            sql = "SELECT nombre, curso, nota_media FROM alumnos WHERE nota_media < 5";
        } else {
            System.out.println("Opcion invalida");
            return;
        }

        try {
            Connection conn = DriverManager.getConnection(url, user, password);
            PreparedStatement stmt = conn.prepareStatement(sql);
            ResultSet rs = stmt.executeQuery();

            while (rs.next()) {
                String nombre = rs.getString("nombre");
                String curso = rs.getString("curso");
                double nota_media = rs.getDouble("nota_media");
                System.out.println(nombre + " - " + curso + " - Nota Media: " + nota_media);
            }

            rs.close();
            stmt.close();
            conn.close();

        } catch (SQLException e) {
            System.out.println("Error de SQL " + e.getMessage());
        } catch (Exception e) {
            System.out.println("Error desconocido " + e.getMessage());
        }
    }

    public static void TopEstudiante() {
        String url = "jdbc:mysql://localhost:3306/instituto";
        String user = "root";
        String password = "12345";

        String sql = "Select nombre, curso, nota_media FROM alumnos order by nota_media desc limit 1";

        try {
            Connection conn = DriverManager.getConnection(url, user, password);
            PreparedStatement stmt = conn.prepareStatement(sql);
            ResultSet rs = stmt.executeQuery();

            while (rs.next()) {
                String nombre = rs.getString("nombre");
                String curso = rs.getString("curso");
                double nota_media = rs.getDouble("nota_media");
                System.out.println(nombre + " - " + curso + " - Nota: " + nota_media);
            }

            rs.close();
            stmt.close();
            conn.close();

        } catch (SQLException e) {
            System.out.println("Error de SQL " + e.getMessage());
        } catch (Exception e) {
            System.out.println("Error desconocido" + e.getMessage());
        }
    }

    public static void Matricular() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nombre del alumno: ");
        String nombre = sc.nextLine();
        System.out.print("Curso del alumno: ");
        String curso = sc.nextLine();
        System.out.print("Nota del alumno: ");
        double nota = sc.nextDouble();

        String url = "jdbc:mysql://localhost:3306/instituto";
        String user = "root";
        String password = "12345";

        String sql = "INSERT INTO alumnos (nombre, curso, nota) VALUES (?, ?, ?)";
        try {
            Connection conn = DriverManager.getConnection(url, user, password);
            PreparedStatement stmt = conn.prepareStatement(sql);
            ResultSet rs = stmt.executeQuery();

            stmt.setString(1, nombre);
            stmt.setString(2, curso);
            stmt.setDouble(3, nota);

            int filas = stmt.executeUpdate();
            System.out.println("Alumno matriculado correctamente. Filas insertadas: " + filas);

            rs.close();
            stmt.close();
            conn.close();

        } catch (SQLException e) {
            System.out.println("Error de SQL " + e.getMessage());
        } catch (Exception e) {
            System.out.println("Error desconocido " + e.getMessage());
        }
    }

    public static void actualizarNota() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Dame el ID (del alumno): ");
        int id = sc.nextInt();

        System.out.print("Pon la nueva nota (del alumno): ");
        double nuevaNota = sc.nextDouble();

        String url = "jdbc:mysql://localhost:3306/instituto";
        String user = "root";
        String password = "12345";

        String sql = "UPDATE alumnos SET nota = ? WHERE id = ?";

        try {
            Connection conn = DriverManager.getConnection(url, user, password);
            PreparedStatement stmt = conn.prepareStatement(sql);

            stmt.setDouble(1, nuevaNota);
            stmt.setInt(2, id);

            int filas = stmt.executeUpdate();
            System.out.println("Filas actualizadas: " + filas);

            stmt.close();
            conn.close();
        } catch (SQLException e) {
            System.out.println("Error de SQL " + e.getMessage());
        } catch (Exception e) {
            System.out.println("Error desconocido " + e.getMessage());
        }
    }

    public static void Baja() {
        Scanner sc = new Scanner(System.in);
        System.out.print("ID del alumno: ");
        int id = sc.nextInt();

        String url = "jdbc:mysql://localhost:3306/instituto";
        String user = "root";
        String password = "12345";

        String sql = "DELETE FROM alumnos WHERE id = ?";

        try {
            Connection conn = DriverManager.getConnection(url, user, password);
            PreparedStatement stmt = conn.prepareStatement(sql);

            stmt.setInt(1, id);

            int filas = stmt.executeUpdate();
            System.out.println("Filas borradas: " + filas);

            stmt.close();
            conn.close();
        } catch (SQLException e) {
            System.out.println("Error de SQL " + e.getMessage());
        } catch (Exception e) {
            System.out.println("Error desconocido " + e.getMessage());
        }
    }

}