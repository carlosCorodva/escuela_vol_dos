
package SE.componentes;

import SE.entidades.em_empresa;
import SE.entidades.em_sucursal;
import SE.entidades.join.JoinEmpleados;
import SE.entidades.join.JoinEmpresaSucursal;
import SE.entidades.mappers.Mappers;
import SE.entidades.us_permiso_empleado;
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
    
    public String Iniciar_sesion(JoinEmpleados us) {
        String valor = null;
        try {
            con = c.conectar();
            con.setAutoCommit(false);
            CallableStatement pro = con.prepareCall(
                    "{ call login(?,?,?,?) }");
            pro.setString(1, us.getUsuario());
            pro.setString(2, us.getContrasena());
            pro.setLong(3, us.getId_sucursal());
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
        
    public ArrayList<JoinEmpleados> listarEmpleadosActivos() {
        ArrayList<JoinEmpleados> valor = new ArrayList<JoinEmpleados>();
        try {
            con = c.conectar();
            con.setAutoCommit(false);
            CallableStatement pro = con.prepareCall(
                    "{ call us_mostrar_empleados_activos() }");
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
    
    public ArrayList<JoinEmpleados> listarEmpleadosInactivos() {
        ArrayList<JoinEmpleados> valor = new ArrayList<JoinEmpleados>();
        try {
            con = c.conectar();
            con.setAutoCommit(false);
            CallableStatement pro = con.prepareCall(
                    "{ call us_mostrar_empleados_inactivos() }");
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
    
    public String CrearEmpleado(JoinEmpleados us) {
        String valor = null;
        try {
            con = c.conectar();
            con.setAutoCommit(false);
            CallableStatement pro = con.prepareCall(
                    "{ call us_crear_empleados(?,?,?,?,?,?,?,?,?,?,?,?,?)}");
            pro.setString(1, us.getCedula());
            pro.setString(2, us.getApellidos_nombres());
            pro.setString(3, us.getDireccion());
            pro.setString(4, us.getFecha_nacimiento());
            pro.setString(5, us.getConvecional());
            pro.setString(6, us.getTelefono_dos());
            pro.setString(7, us.getCorreo());
            pro.setString(8, us.getRol());
            pro.setLong(9, us.getCopia_cedula());
            pro.setLong(10, us.getCopia_titulo());
            pro.setString(11, us.getObservacion());
            pro.setLong(12, us.getId_usuario());
            pro.registerOutParameter("salida", Types.VARCHAR);
            pro.executeUpdate();
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
    public String ActualizarEmpleado(JoinEmpleados us) {
        String valor = null;
        try {
            con = c.conectar();
            con.setAutoCommit(false);
            CallableStatement pro = con.prepareCall(
                    "{ call us_actualizar_empleados(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)}");
            pro.setString(1, us.getCedula());
            pro.setString(2, us.getApellidos_nombres());
            pro.setString(3, us.getDireccion());
            pro.setString(4, us.getFecha_nacimiento());
            pro.setString(5, us.getConvecional());
            pro.setString(6, us.getTelefono_dos());
            pro.setString(7, us.getCorreo());
            pro.setString(8, us.getRol());
            pro.setLong(9, us.getCopia_cedula());
            pro.setLong(10, us.getCopia_titulo());
            pro.setString(11, us.getObservacion());
            pro.setString(12, us.getEstado());
            pro.setLong(13, us.getId_usuario());
            pro.setLong(14, us.getId_usuarioDos());
            pro.registerOutParameter("salida", Types.VARCHAR);
            pro.executeUpdate();
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
    
    public ArrayList<JoinEmpleados> filtroEmpleadoId(JoinEmpleados je) {
        ArrayList<JoinEmpleados> valor = new ArrayList<JoinEmpleados>();
        try {
            con = c.conectar();
            con.setAutoCommit(false);
            CallableStatement pro = con.prepareCall(
                    "{ call us_mostrar_emp_id(?)}");
            pro.setLong(1, je.getId_usuario());
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
    public ArrayList<JoinEmpleados> filtroEmpleadoApeNomb(JoinEmpleados je) {
        ArrayList<JoinEmpleados> valor = new ArrayList<JoinEmpleados>();
        try {
            con = c.conectar();
            con.setAutoCommit(false);
            CallableStatement pro = con.prepareCall(
                    "{ call us_mostrar_emp_ape_nomb(?)}");
            pro.setString(1, je.getApellidos_nombres());
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
    public ArrayList<JoinEmpleados> filtroEmpleadoCedula(JoinEmpleados je) {
        ArrayList<JoinEmpleados> valor = new ArrayList<JoinEmpleados>();
        try {
            con = c.conectar();
            con.setAutoCommit(false);
            CallableStatement pro = con.prepareCall(
                    "{ call us_mostrar_emp_cedula(?)}");
            pro.setString(1, je.getCedula());
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
    public String CrearPermisosMaterias(us_permiso_empleado us) {
        String valor = null;
        try {
            con = c.conectar();
            con.setAutoCommit(false);
            CallableStatement pro = con.prepareCall(
                    "{ call us_permisos_materias_crear(?,?,?,?,?,?,?,?,?,?)}");
            pro.setString(1, us.getEstado_pe());
            pro.setString(2, us.getEstado_pe2());
            pro.setString(3, us.getEstado_pe3());
            pro.setString(4, us.getEstado_pe4());
            pro.setString(5, us.getEstado_pe5());
            pro.setString(6, us.getEstado_pe6());
            pro.setString(7, us.getEstado_pe7());
            pro.setString(8, us.getEstado_pe8());
            pro.setString(9, us.getEstado_pe9());
            pro.setString(10, us.getEstado_pe10());
            pro.executeUpdate();
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
    public String ActualizarPermisosMaterias(us_permiso_empleado us) {
        String valor = null;
        try {
            con = c.conectar();
            con.setAutoCommit(false);
            CallableStatement pro = con.prepareCall(
                    "{ call us_permisos_materias_actualizar(?,?,?,?,?,?,?,?,?,?,?)}");
            pro.setString(1, us.getEstado_pe());
            pro.setString(2, us.getEstado_pe2());
            pro.setString(3, us.getEstado_pe3());
            pro.setString(4, us.getEstado_pe4());
            pro.setString(5, us.getEstado_pe5());
            pro.setString(6, us.getEstado_pe6());
            pro.setString(7, us.getEstado_pe7());
            pro.setString(8, us.getEstado_pe8());
            pro.setString(9, us.getEstado_pe9());
            pro.setString(10, us.getEstado_pe10());
            pro.setLong(11, us.getId_usuario());
            pro.executeUpdate();
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
    
    public ArrayList<us_permiso_empleado> TablaEstadoChbx(us_permiso_empleado ca) {
       ArrayList<us_permiso_empleado> valor = new ArrayList<us_permiso_empleado>();
        try {
            con = c.conectar();
            con.setAutoCommit(false);
            CallableStatement pro = con.prepareCall(
                    "{ call us_tabla_chbx(?)}");
            pro.setLong(1, ca.getId_usuario());
              rs = pro.executeQuery();
              while (rs.next()) {
                us_permiso_empleado obj = Mappers.getEmpleadosPermisosFromResultSet(rs);
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
    
    public String ConfirmarClave(JoinEmpleados us) {
        String valor = null;
        try {
            con = c.conectar();
            con.setAutoCommit(false);
            CallableStatement pro = con.prepareCall(
                    "{ call us_clave_confirmar(?,?,?)}");
            pro.setLong(1, us.getId_usuario());
            pro.setString(2, us.getContrasena());
            pro.registerOutParameter("salida", Types.VARCHAR);
            pro.executeUpdate();
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
    
    public String ActualizarUsuario(JoinEmpleados us) {
        String valor = null;
        try {
            con = c.conectar();
            con.setAutoCommit(false);
            CallableStatement pro = con.prepareCall(
                    "{ call us_clave_mantenimiento(?,?,?,?)}");
            pro.setLong(1, us.getId_usuario());
            pro.setString(2, us.getUsuario());
            pro.setString(3, us.getContrasena());
            pro.registerOutParameter("salida", Types.VARCHAR);
            pro.executeUpdate();
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
    
    public ArrayList<em_empresa> empresaCombo() {
        ArrayList<em_empresa> lista = new ArrayList<em_empresa>();
        try {
            con = c.conectar();
            con.setAutoCommit(false);
            CallableStatement prcProcedimientoAlmacenado = con.prepareCall(
                    "{ call em_cargar_combo_empresa() }");
            prcProcedimientoAlmacenado.execute();
            rs = prcProcedimientoAlmacenado.getResultSet();
            while (rs.next()) {
                em_empresa obj = Mappers.getEmpresaFromResultSet(rs);
                lista.add(obj);
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
        return lista;
    }
    public ArrayList<JoinEmpleados> sucursalCombo(JoinEmpleados es) {
        ArrayList<JoinEmpleados> lista = new ArrayList<JoinEmpleados>();
        try {
            con = c.conectar();
            con.setAutoCommit(false);
            CallableStatement prcProcedimientoAlmacenado = con.prepareCall(
                    "{ call em_cargar_combo_sucursal(?) }");
               prcProcedimientoAlmacenado.setString(1, es.getNombre_comercial_su());
            prcProcedimientoAlmacenado.execute();
            rs = prcProcedimientoAlmacenado.getResultSet();
            while (rs.next()) {
                JoinEmpleados obj = Mappers.getSucursalFromResultSet(rs);
                lista.add(obj);
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
        return lista;
    }

    
}
