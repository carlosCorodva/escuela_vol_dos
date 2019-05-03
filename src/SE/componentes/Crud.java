
package SE.componentes;

import SE.entidades.join.JoinEmpleados;
import SE.entidades.mappers.Mappers;
import SE.entidades.us_usuario;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Types;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author carlos
 */
public class Crud {
    
    Connection con = null;
    java.sql.Statement st = null;
    ResultSet rs = null;
    PreparedStatement ps;
    Conexion c = new Conexion();
    
    public String Iniciar_sesion(us_usuario us) {
        String valor = null;
        try {
            con = c.conectar();
            con.setAutoCommit(false);
            CallableStatement pro = con.prepareCall(
                    "{ call login(?,?,?) }");
            pro.setString(1, us.getUsuario());
            pro.setString(2, us.getContrasena());
            pro.registerOutParameter("salida", Types.VARCHAR);
            pro.execute();
            valor = pro.getString("salida");
            con.commit();
        } catch (Exception e) {
            try {
                con.rollback();
                e.printStackTrace();
            } catch (SQLException ex) {
                Logger.getLogger(Crud.class.getName()).log(Level.SEVERE, null, ex);
            }
        } finally {
            try {
                con.close();
            } catch (SQLException ex) {
                Logger.getLogger(Crud.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        return valor;
    }
        
    public ArrayList<JoinEmpleados> listarEmpleados() {
        ArrayList<JoinEmpleados> valor = new ArrayList<JoinEmpleados>();
        try {
            con = c.conectar();
            con.setAutoCommit(false);
            CallableStatement pro = con.prepareCall(
                    "{ call empleados() }");
            rs = pro.executeQuery();
            while (rs.next()) {
                JoinEmpleados obj = Mappers.getEmpleadosFromResultSet(rs);
                valor.add(obj);
            }
            con.commit();
        } catch (Exception e) {
            try {
                con.rollback();
                e.printStackTrace();
            } catch (SQLException ex) {
                Logger.getLogger(Crud.class.getName()).log(Level.SEVERE, null, ex);
            }
        } finally {
            try {
                con.close();
            } catch (SQLException ex) {
                Logger.getLogger(Crud.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        return valor;
    }
}
