/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SE.entidades.mappers;

import SE.entidades.join.JoinEmpleados;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author carlos
 */
public class Mappers {
    public static JoinEmpleados getEmpleadosFromResultSet(ResultSet rs) {
        JoinEmpleados obj = new JoinEmpleados();
        try {
            obj.setId_usuario(rs.getLong("Id_usuario"));
            obj.setApellidos_nombres(rs.getString("Apellidos_nombres"));
            obj.setCedula(rs.getString("Cedula"));
            obj.setContrasena(rs.getString("Contrasena"));
            obj.setConvecional(rs.getString("Convecional"));
            obj.setCopia_cedula(rs.getLong("Copia_cedula"));
            obj.setCorreo(rs.getString("Correo"));
            obj.setDireccion(rs.getString("Direccion"));
            obj.setEstado(rs.getString("Estado"));
            obj.setFecha_nacimiento(rs.getString("Fecha_nacimiento"));
            obj.setId_rol(rs.getLong("Id_rol"));
            obj.setRol(rs.getString("Rol"));
            obj.setServicio_basico(rs.getLong("Servicio_basico"));
            obj.setTelefono_dos(rs.getString("Telefono_dos"));
            obj.setCopia_titulo(rs.getLong("Copia_titulo"));

        } catch (SQLException ex) {
            Logger.getLogger(Mappers.class.getName()).log(Level.SEVERE, null, ex);
        }
        return obj;
    }
}
