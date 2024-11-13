package proyectoaula.model;

import java.util.*;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.LocalDate;
import java.util.ArrayList;

public class trabajadoresDAO {

     public List<trabajadores> obtenerTrabajadores() {
        List<trabajadores> trabajadores1 = new ArrayList<>();
        String sql = "SELECT identificacion, nombre, apellidos, edad, cargo, telefono, usuario, contraseña FROM worker";


        try (Connection con = ConexionDB.conectar();
             PreparedStatement pstmt = con.prepareStatement(sql);
             ResultSet rs = pstmt.executeQuery()) {

            while (rs.next()) {
                String identificacion = rs.getString("identificacion");
                String nombre = rs.getString("nombre");
                String apellidos = rs.getString("apellidos");
                String edad = rs.getString("edad");
                String cargo = rs.getString("cargo");
                String telefono = rs.getString("telefono");
                String usuario = rs.getString("usuario");
                String contraseña = rs.getString("contraseña");

                trabajadores empleado = new trabajadores(identificacion, nombre, apellidos, edad, cargo, telefono, usuario, contraseña);
                trabajadores1.add(empleado);
            }

        } catch (SQLException e) {
            System.err.println("Error al obtener trabajadores: " + e.getMessage());
        }

        return trabajadores1;
    }
    
    public void contratarTrabajador(String identificacion, String nombre, String apellidos, String edad, String cargo, String telefono, String usuario, String contraseña /* LocalDate fechaContratacion*/) {
    //String codigo = generarCodigoTrabajador();

    String sql = "INSERT INTO worker (identificacion, nombre, apellidos, edad, cargo, telefono, usuario, contraseña) VALUES (?, ?, ?, ?, ?, ?, ?, ?)";

    try (Connection con = ConexionDB.conectar();
         PreparedStatement pstmt = con.prepareStatement(sql)) {

        pstmt.setString(1, identificacion);
        pstmt.setString(2, nombre);
        pstmt.setString(3, apellidos);
        pstmt.setString(4, edad);
        pstmt.setString(5, cargo);
        pstmt.setString(6, telefono);
        pstmt.setString(7, usuario);
        pstmt.setString(8, contraseña);
        //pstmt.setDate(10, java.sql.Date.valueOf(fechaContratacion));
       

        pstmt.executeUpdate();
        System.out.println("trabajador insertado con exito.");
        
    } catch (SQLException e) {
        System.err.println("Error al insertar el trabajador: " + e.getMessage());
    }
}
    
    
    public void eliminarTrabajador(String identificacion) {
        String sql = "DELETE FROM worker WHERE identificacion = ?";

        try (Connection con = ConexionDB.conectar();
             PreparedStatement pstmt = con.prepareStatement(sql)) {

            pstmt.setString(1, identificacion);
            int affectedRows = pstmt.executeUpdate();

            if (affectedRows > 0) {
                System.out.println("Trabajador eliminado con exito.");
            } else {
                System.out.println("No se encontró el trabajador con identificacion: " + identificacion);
            }

        } catch (SQLException e) {
            System.err.println("Error al eliminar trabajador: " + e.getMessage());
        }
    }
    
}
