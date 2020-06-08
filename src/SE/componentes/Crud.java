package SE.componentes;

import SE.entidades.bloqueo;
import SE.entidades.ca_conducta;
import SE.entidades.ca_materia;
import SE.entidades.em_empresa;
import SE.entidades.em_sucursal;
import SE.entidades.join.JoinCalificacion;
import SE.entidades.join.JoinEmpleados;
import SE.entidades.join.JoinGraduados;
import SE.entidades.join.JoinMaterias;
import SE.entidades.join.JoinMatriculas;
import SE.entidades.ma_mensualidad;
import SE.entidades.ma_paralelo;
import SE.entidades.ma_periodo;
import SE.entidades.mappers.Mappers;
import SE.entidades.gen_precios;
import SE.entidades.us_permiso_curso;
import SE.entidades.us_permiso_empleado;
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

    public ArrayList<JoinEmpleados> listarEmpleadosActivos(JoinEmpleados je) {
        ArrayList<JoinEmpleados> valor = new ArrayList<JoinEmpleados>();
        try {
            con = c.conectar();
            con.setAutoCommit(false);
            CallableStatement pro = con.prepareCall(
                    "{ call us_mostrar_empleados_activos(?,?) }");
            pro.setLong(1, je.getId_empresa());
            pro.setLong(2, je.getId_sucursal());
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

    public ArrayList<JoinEmpleados> listarEmpleadosActivosInicio() {
        ArrayList<JoinEmpleados> valor = new ArrayList<JoinEmpleados>();
        try {
            con = c.conectar();
            con.setAutoCommit(false);
            CallableStatement pro = con.prepareCall(
                    "{ call em_inicio_empre_suc() }");
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
    
    public ArrayList<JoinEmpleados> listarEmpleadosActivosInactivos(JoinEmpleados je) {
        ArrayList<JoinEmpleados> valor = new ArrayList<>();
        try {
            con = c.conectar();
            con.setAutoCommit(false);
            CallableStatement pro = con.prepareCall(
                    "{ call us_permisos_empleados_activos_inactivos(?) }");
            pro.setLong(1, je.getId_sucursal());
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

    public ArrayList<JoinEmpleados> listarEmpleadosInactivos(JoinEmpleados je) {
        ArrayList<JoinEmpleados> valor = new ArrayList<JoinEmpleados>();
        try {
            con = c.conectar();
            con.setAutoCommit(false);
            CallableStatement pro = con.prepareCall(
                    "{ call us_mostrar_empleados_inactivos(?,?) }");
            pro.setLong(1, je.getId_empresa());
            pro.setLong(2, je.getId_sucursal());
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
                        "{ call us_empleados_crear(?,?,?,?,?,?,?,?,?,?,?,?,?,?)}");
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
            pro.setLong(13, us.getId_sucursal());
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
                    "{ call us_empleados_actualizar(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)}");
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
            pro.setLong(15, us.getId_sucursal());
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
                    "{ call us_mostrar_emp_ape_nomb(?,?,?)}");
            pro.setString(1, je.getApellidos_nombres());
            pro.setLong(2, je.getId_empresa());
            pro.setLong(3, je.getId_sucursal());
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
                    "{ call us_mostrar_emp_cedula(?,?,?)}");
            pro.setString(1, je.getCedula());
            pro.setLong(2, je.getId_empresa());
            pro.setLong(3, je.getId_sucursal());
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
                    "{ call seg_usuario_mantenimiento_cuenta(?,?,?,?)}");
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

    public ArrayList<JoinEmpleados> empresaComboDos(JoinEmpleados je) {
        ArrayList<JoinEmpleados> lista = new ArrayList<JoinEmpleados>();
        try {
            con = c.conectar();
            con.setAutoCommit(false);
            CallableStatement pro = con.prepareCall(
                    "{ call em_cargar_combo_empresa_dos(?,?) }");
            pro.setString(1, je.getUsuario());
            pro.setString(2, je.getContrasena());
            pro.execute();
            rs = pro.getResultSet();
            while (rs.next()) {
                JoinEmpleados obj = Mappers.getEmpresaFromResultSet(rs);
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

    public ArrayList<JoinEmpleados> sucursalComboDos(JoinEmpleados je) {
        ArrayList<JoinEmpleados> lista = new ArrayList<JoinEmpleados>();
        try {
            con = c.conectar();
            con.setAutoCommit(false);
            CallableStatement pro = con.prepareCall(
                    "{ call em_cargar_combo_sucursal_dos(?,?) }");
            pro.setString(1, je.getUsuario());
            pro.setString(2, je.getContrasena());
            pro.execute();
            rs = pro.getResultSet();
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

    public String validarUsuario(JoinEmpleados us) {
        String valor = null;
        try {
            con = c.conectar();
            con.setAutoCommit(false);
            CallableStatement pro = con.prepareCall(
                    "{ call us_validar_usuario_combos(?,?,?,?) }");
            pro.setString(1, us.getUsuario());
            pro.setString(2, us.getContrasena());
            pro.setString(3, us.getNombre_comercial_su());
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

    public ArrayList<ca_materia> listarMaterias() {
        ArrayList<ca_materia> valor = new ArrayList<ca_materia>();
        try {
            con = c.conectar();
            con.setAutoCommit(false);
            CallableStatement pro = con.prepareCall(
                    "{ call ca_materia_mostrar() }");
            rs = pro.executeQuery();
            while (rs.next()) {
                ca_materia obj = Mappers.getMateriaFromResultSet(rs);
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

    public String actualizarMateria(ca_materia us) {
        String valor = null;
        try {
            con = c.conectar();
            con.setAutoCommit(false);
            CallableStatement pro = con.prepareCall(
                    "{ call ca_materia_actualizar(?,?,?,?) }");
            pro.setString(1, us.getMateria());
            pro.setLong(2, us.getId_materia());
            pro.setLong(3, us.getId_actualizacion());
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

    public ArrayList<ma_paralelo> listarCursos(ma_paralelo us) {
        ArrayList<ma_paralelo> valor = new ArrayList<ma_paralelo>();
        try {
            con = c.conectar();
            con.setAutoCommit(false);
            CallableStatement pro = con.prepareCall(
                    "{ call ma_paralelo_mostrar(?,?) }");
            pro.setLong(1, us.getId_empresa_pa());
            pro.setLong(2, us.getId_sucursal_pa());
            rs = pro.executeQuery();
            while (rs.next()) {
                ma_paralelo obj = Mappers.getCursosFromResultSet(rs);
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
    
    public ArrayList<us_permiso_curso> permisosCursos(us_permiso_curso us) {
        ArrayList<us_permiso_curso> valor = new ArrayList<>();
        try {
            con = c.conectar();
            con.setAutoCommit(false);
            CallableStatement pro = con.prepareCall(
                    "{ call us_permiso_curso_select(?,?) }");
            pro.setLong(1, us.getId_empresa_per());
            pro.setLong(2, us.getId_sucursal_per());
            rs = pro.executeQuery();
            while (rs.next()) {
                us_permiso_curso obj = Mappers.getPermisosCursosFromResultSet(rs);
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

    public ArrayList<us_permiso_curso> listarCursosPermiso(us_permiso_curso us) {
        ArrayList<us_permiso_curso> valor = new ArrayList<>();
        try {
            con = c.conectar();
            con.setAutoCommit(false);
            CallableStatement pro = con.prepareCall(
                    "{ call us_permisos_mostrar_actualizar(?,?) }");
            pro.setLong(1, us.getId_usuario());
            pro.setLong(2, us.getId_sucursal_per());
            rs = pro.executeQuery();
            while (rs.next()) {
                us_permiso_curso obj = Mappers.getCursosPermisosFromResultSet(rs);
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

    public String actualizarCursos(ma_paralelo us) {
        String valor = null;
        try {
            con = c.conectar();
            con.setAutoCommit(false);
            CallableStatement pro = con.prepareCall(
                    "{ call ma_paralelo_actualizar(?,?,?,?,?,?,?,?,?,?) }");
            pro.setString(1, us.getParalelo());
            pro.setLong(2, us.getId_paralelo());
            pro.setLong(3, us.getId_actualizacion());
            pro.setString(4, us.getParalelo_obs());
            pro.setString(5, us.getEstado_pa());
            pro.setLong(6, us.getId_empresa_pa());
            pro.setLong(7, us.getId_sucursal_pa());
            pro.setLong(8, us.getNivel());
            pro.setLong(9, us.getN_capacidad());
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

    public String crearCursos(ma_paralelo us) {
        String valor = null;
        try {
            con = c.conectar();
            con.setAutoCommit(false);
            CallableStatement pro = con.prepareCall(
                    "{ call ma_paralelo_crear(?,?,?,?,?,?,?) }");
            pro.setString(1, us.getParalelo());
            pro.setLong(2, us.getId_actualizacion());
            pro.setLong(3, us.getNivel());
            pro.setLong(4, us.getId_empresa_pa());
            pro.setLong(5, us.getId_sucursal_pa());
            pro.setLong(6, us.getN_capacidad());
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

    public ArrayList<ma_periodo> listarPeriodos(ma_periodo us) {
        ArrayList<ma_periodo> valor = new ArrayList<ma_periodo>();
        try {
            con = c.conectar();
            con.setAutoCommit(false);
            CallableStatement pro = con.prepareCall(
                    "{ call ma_periodo_mostrar(?,?) }");
            pro.setLong(1, us.getId_empresa_pe());
            pro.setLong(2, us.getId_sucursal_pe());
            rs = pro.executeQuery();
            while (rs.next()) {
                ma_periodo obj = Mappers.getPeriodosFromResultSet(rs);
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

    public String CrearPeriodo(ma_periodo us) {
        String valor = null;
        try {
            con = c.conectar();
            con.setAutoCommit(false);
            CallableStatement pro = con.prepareCall(
                    "{ call ma_periodo_crear(?,?,?,?,?,?,?) }");
            pro.setString(1, us.getPeriodo());
            pro.setLong(2, us.getId_creacion());
            pro.setLong(3, us.getId_empresa_pe());
            pro.setLong(4, us.getId_sucursal_pe());
            pro.setString(5, us.getInicio());
            pro.setString(6, us.getFin());
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

    public String ActualizarPeriodo(ma_periodo us) {
        String valor = null;
        try {
            con = c.conectar();
            con.setAutoCommit(false);
            CallableStatement pro = con.prepareCall(
                    "{ call ma_periodo_actualizar(?,?,?,?,?,?,?) }");
            pro.setString(1, us.getPeriodo());
            pro.setLong(2, us.getId_actualizacion());
            pro.setLong(3, us.getId_periodo());
            pro.setString(4, us.getEstado_pe());
            pro.setLong(5, us.getId_empresa_pe());
            pro.setLong(6, us.getId_sucursal_pe());
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

    public ArrayList<em_empresa> ListarEmpresas() {
        ArrayList<em_empresa> valor = new ArrayList<em_empresa>();
        try {
            con = c.conectar();
            con.setAutoCommit(false);
            CallableStatement pro = con.prepareCall(
                    "{ call em_empresa_mostrar() }");
            rs = pro.executeQuery();
            while (rs.next()) {
                em_empresa obj = Mappers.getMostrarEmpresaFromResultSet(rs);
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

    public String CrearEmpresa(em_empresa us) {
        String valor = null;
        try {
            con = c.conectar();
            con.setAutoCommit(false);
            CallableStatement pro = con.prepareCall(
                    "{ call em_empresa_crear(?,?,?,?,?,?,?,?,?) }");
            pro.setString(1, us.getRuc_em());
            pro.setString(2, us.getNombre_comercial_em());
            pro.setString(3, us.getCorreo_em());
            pro.setString(4, us.getTelefono_em());
            pro.setString(5, us.getDireccion_em());
            pro.setLong(6, us.getUsuario_creacion());
            pro.setString(7, us.getProvincia());
            pro.setString(8, us.getCanton());
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

    public ArrayList<em_empresa> MostrarEmpresaUna(em_empresa je) {
        ArrayList<em_empresa> lista = new ArrayList<em_empresa>();
        try {
            con = c.conectar();
            con.setAutoCommit(false);
            CallableStatement pro = con.prepareCall(
                    "{ call em_empresa_mostrar_una(?) }");
            pro.setLong(1, je.getId_empresa());
            pro.execute();
            rs = pro.getResultSet();
            while (rs.next()) {
                em_empresa obj = Mappers.getMostrarEmpresaFromResultSet(rs);
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

    public String ActualizarEmpresa(em_empresa us) {
        String valor = null;
        try {
            con = c.conectar();
            con.setAutoCommit(false);
            CallableStatement pro = con.prepareCall(
                    "{ call em_empresa_actualizar(?,?,?,?,?,?,?,?,?,?) }");
            pro.setString(1, us.getNombre_comercial_em());
            pro.setString(2, us.getTelefono_em());
            pro.setString(3, us.getDireccion_em());
            pro.setString(4, us.getCorreo_em());
            pro.setLong(5, us.getUsuario_actualizacion());
            pro.setLong(6, us.getId_empresa());
            pro.setString(7, us.getRuc_em());
            pro.setString(8, us.getProvincia());
            pro.setString(9, us.getCanton());
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

    public ArrayList<em_sucursal> ListarSucursales(em_sucursal su) {
        ArrayList<em_sucursal> valor = new ArrayList<em_sucursal>();
        try {
            con = c.conectar();
            con.setAutoCommit(false);
            CallableStatement pro = con.prepareCall(
                    "{ call em_sucursal_mostrar(?) }");
            pro.setLong(1, su.getId_empresa());
            rs = pro.executeQuery();
            while (rs.next()) {
                em_sucursal obj = Mappers.getMostrarSucursalFromResultSet(rs);
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

    public String ActualizarSucursal(em_sucursal us) {
        String valor = null;
        try {
            con = c.conectar();
            con.setAutoCommit(false);
            CallableStatement pro = con.prepareCall(
                    "{ call em_sucursal_actualizar(?,?,?,?,?,?,?,?,?,?,?,?,?,?) }");
            pro.setString(1, us.getNombre_comercial_su());
            pro.setString(2, us.getTelefono_su());
            pro.setString(3, us.getDireccion_su());
            pro.setString(4, us.getCorreo_su());
            pro.setLong(5, us.getUsuario_actualizacion());
            pro.setLong(6, us.getId_sucursal());
            pro.setString(7, us.getEstado_su());
            pro.setString(8, us.getProvincia_suc());
            pro.setString(9, us.getCanton_suc());
            pro.setString(10, us.getJornada());
            pro.setString(11, us.getZona());
            pro.setString(12, us.getDistrito());
            pro.setString(13, us.getCircuito());
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

    public String CrearSucursal(em_sucursal us) {
        String valor = null;
        try {
            con = c.conectar();
            con.setAutoCommit(false);
            CallableStatement pro = con.prepareCall(
                    "{ call em_sucursal_crear(?,?,?,?,?,?,?,?,?,?,?,?,?) }");
            pro.setString(1, us.getNombre_comercial_su());
            pro.setString(2, us.getTelefono_su());
            pro.setString(3, us.getDireccion_su());
            pro.setString(4, us.getCorreo_su());
            pro.setLong(5, us.getUsuario_creacion());
            pro.setLong(6, us.getId_empresa());
            pro.setString(7, us.getProvincia_suc());
            pro.setString(8, us.getCanton_suc());
            pro.setString(9, us.getJornada());
            pro.setString(10, us.getZona());
            pro.setString(11, us.getDistrito());
            pro.setString(12, us.getCircuito());
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

    public String CerrarSucursal(em_sucursal us) {
        String valor = null;
        try {
            con = c.conectar();
            con.setAutoCommit(false);
            CallableStatement pro = con.prepareCall(
                    "{ call em_sucursal_cerrar(?,?,?) }");
            pro.setLong(1, us.getUsuario_actualizacion());
            pro.setLong(2, us.getId_sucursal());
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

    public ArrayList<JoinEmpleados> listarEmpleadosInactivosTodos() {
        ArrayList<JoinEmpleados> valor = new ArrayList<JoinEmpleados>();
        try {
            con = c.conectar();
            con.setAutoCommit(false);
            CallableStatement pro = con.prepareCall(
                    "{ call em_empresa_inactivos_todos() }");
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

    public ArrayList<em_sucursal> sucursalComboParaInactivos(em_sucursal je) {
        ArrayList<em_sucursal> lista = new ArrayList<em_sucursal>();
        try {
            con = c.conectar();
            con.setAutoCommit(false);
            CallableStatement pro = con.prepareCall(
                    "{ call em_empresa_cagar_combo_sucursales_para_inactivos(?) }");
            pro.setLong(1, je.getId_empresa());
            pro.execute();
            rs = pro.getResultSet();
            while (rs.next()) {
                em_sucursal obj = Mappers.getSucursalParaInactivosFromResultSet(rs);
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

    public String ActualizarEmpleadoInactivo(JoinEmpleados us) {
        String valor = null;
        try {
            con = c.conectar();
            con.setAutoCommit(false);
            CallableStatement pro = con.prepareCall(
                    "{ call em_empresa_cambio_sucursal(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)}");
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
            pro.setString(15, us.getNombre_comercial_su());
            pro.setString(16, us.getTipo_i());
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

    public ArrayList<JoinMatriculas> listarAlumnosMatriculas(JoinMatriculas je) {
        ArrayList<JoinMatriculas> valor = new ArrayList<JoinMatriculas>();
        try {
            con = c.conectar();
            con.setAutoCommit(false);
            CallableStatement pro = con.prepareCall(
                    "{ call ma_matricula_mostrar_alumnos(?,?) }");
            pro.setLong(1, je.getId_empresa());
            pro.setLong(2, je.getId_sucursal());
            rs = pro.executeQuery();
            while (rs.next()) {
                JoinMatriculas obj = Mappers.getMatriculasFromResultSet(rs);
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

    public ArrayList<JoinMatriculas> listarMatriculasCedula(JoinMatriculas je) {
        ArrayList<JoinMatriculas> valor = new ArrayList<JoinMatriculas>();
        try {
            con = c.conectar();
            con.setAutoCommit(false);
            CallableStatement pro = con.prepareCall(
                    "{ call ma_matricula_buscar_ced(?,?,?) }");
            pro.setLong(1, je.getId_empresa());
            pro.setLong(2, je.getId_sucursal());
            pro.setString(3, je.getCedula());
            rs = pro.executeQuery();
            while (rs.next()) {
                JoinMatriculas obj = Mappers.getMatriculasFromResultSet(rs);
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

    public ArrayList<JoinMatriculas> listarMatriculasApellidosNombres(JoinMatriculas je) {
        ArrayList<JoinMatriculas> valor = new ArrayList<JoinMatriculas>();
        try {
            con = c.conectar();
            con.setAutoCommit(false);
            CallableStatement pro = con.prepareCall(
                    "{ call ma_matricula_buscar_apellido_nombre(?,?,?) }");
            pro.setLong(1, je.getId_empresa());
            pro.setLong(2, je.getId_sucursal());
            pro.setString(3, je.getApellidos_nombres());
            rs = pro.executeQuery();
            while (rs.next()) {
                JoinMatriculas obj = Mappers.getMatriculasFromResultSet(rs);
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

    public ArrayList<ma_paralelo> ComboParaleloRegistrar(ma_paralelo mp) {
        ArrayList<ma_paralelo> lista = new ArrayList<ma_paralelo>();
        try {
            con = c.conectar();
            con.setAutoCommit(false);
            CallableStatement pro = con.prepareCall(
                    "{ call ma_combo_paralelo(?,?) }");
            pro.setLong(1, mp.getId_empresa_pa());
            pro.setLong(2, mp.getId_sucursal_pa());
            pro.execute();
            rs = pro.getResultSet();
            while (rs.next()) {
                ma_paralelo obj = Mappers.getParaleloFromResultSet(rs);
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

    public ArrayList<JoinMatriculas> ComboParaleloActualizar(JoinMatriculas mp) {
        ArrayList<JoinMatriculas> lista = new ArrayList<JoinMatriculas>();
        try {
            con = c.conectar();
            con.setAutoCommit(false);
            CallableStatement pro = con.prepareCall(
                    "{ call ma_matricula_cargar_combo_paralelo(?,?,?) }");
            pro.setLong(1, mp.getId_matricula());
            pro.setString(2, mp.getEstado_matricula());
            pro.setLong(3, mp.getId_sucursal());
            pro.execute();
            rs = pro.getResultSet();
            while (rs.next()) {
                JoinMatriculas obj = Mappers.getParaleloActualizarFromResultSet(rs);
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

    public String CrearMatricula(JoinMatriculas us) {
        String valor = null;
        try {
            con = c.conectar();
            con.setAutoCommit(false);
            CallableStatement pro = con.prepareCall(
                    "{ call ma_matricula_crear(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)}");
            pro.setString(1, us.getCedula());
            pro.setString(2, us.getApellidos_nombres());
            pro.setString(3, us.getDireccion());
            pro.setString(4, us.getFecha_nacimiento());
            pro.setString(5, us.getConvecional());
            pro.setString(6, us.getTelefono_dos());
            pro.setString(7, us.getCorreo());
            pro.setLong(8, us.getCopia_cedula());
            pro.setLong(9, us.getServicio_basico());
            pro.setString(10, us.getObservacion());
            pro.setLong(11, us.getId_usuario());
            pro.setLong(12, us.getId_sucursal());
            pro.setString(13, us.getParalelo());
            pro.setString(14, us.getCedula_uno());
            pro.setString(15, us.getRepresentante());
            pro.setString(16, us.getParentesco());
            pro.setString(17, us.getCedula_dos());
            pro.setString(18, us.getRepresentante_dos());
            pro.setString(19, us.getCorreo_dos());
            pro.setString(20, us.getParentesco_dos());
            pro.setLong(21, us.getDoc_escuela_ant());
            pro.setString(22, us.getAnt_escuela());
            pro.setLong(23, us.getPartida_nacimiento());
            pro.setDouble(24, us.getValor_mat());
            pro.setDouble(25, us.getValor_ref());
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

    public String CrearMatriculaActualizar(JoinMatriculas us) {
        String valor = null;
        try {
            con = c.conectar();
            con.setAutoCommit(false);
            CallableStatement pro = con.prepareCall(
                    "{ call ma_matricula_crear_actualizar(?,?,?,?,?,?,?,?,?,?,?,?)}");
            pro.setLong(1, us.getId_usuario());
            pro.setString(2, us.getParalelo());
            pro.setLong(3, us.getId_empleado());
            pro.setString(4, us.getMatricula_obs());
            pro.setLong(5, us.getCopia_cedula());
            pro.setLong(6, us.getServicio_basico());
            pro.setString(7, us.getEstado_matricula());
            pro.setLong(8, us.getId_matricula());
            pro.setDouble(9, us.getValor_mat());
            pro.setLong(10, us.getId_sucursal());
            pro.setDouble(11, us.getValor_ref());
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

    public String ActualizarAlumno(JoinMatriculas us) {
        String valor = null;
        try {
            con = c.conectar();
            con.setAutoCommit(false);
            CallableStatement pro = con.prepareCall(
                    "{ call ma_matrcula_actualizar_alumno(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)}");
            pro.setString(1, us.getCedula());
            pro.setString(2, us.getApellidos_nombres());
            pro.setString(3, us.getDireccion());
            pro.setString(4, us.getFecha_nacimiento());
            pro.setString(5, us.getConvecional());
            pro.setString(6, us.getTelefono_dos());
            pro.setString(7, us.getCorreo());
            pro.setLong(8, us.getCopia_cedula());
            pro.setLong(9, us.getServicio_basico());
            pro.setString(10, us.getObservacion());
            pro.setLong(11, us.getId_usuario());
            pro.setString(12, us.getCedula_uno());
            pro.setString(13, us.getRepresentante());
            pro.setString(14, us.getParentesco());
            pro.setString(15, us.getCedula_dos());
            pro.setString(16, us.getRepresentante_dos());
            pro.setString(17, us.getCorreo_dos());
            pro.setString(18, us.getParentesco_dos());
            pro.setLong(19, us.getDoc_escuela_ant());
            pro.setString(20, us.getAnt_escuela());
            pro.setLong(21, us.getPartida_nacimiento());
            pro.setLong(22, us.getId_matricula());
            pro.setLong(23, us.getId_empleado());
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
    public String ValidarCursos(JoinMatriculas us) {
        String valor = null;
        try {
            con = c.conectar();
            con.setAutoCommit(false);
            CallableStatement pro = con.prepareCall(
                    "{ call ma_matriculacion_conteo_de_capacidad_cursos(?,?,?)}");
            pro.setLong(1, us.getId_sucursal());
            pro.setString(2, us.getParalelo());
            pro.setLong(3, us.getId_usuario());
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

    public ArrayList<ca_conducta> MostarConducta() {
        ArrayList<ca_conducta> lista = new ArrayList<ca_conducta>();
        try {
            con = c.conectar();
            con.setAutoCommit(false);
            CallableStatement pro = con.prepareCall(
                    "{ call ca_mostrar_conducta() }");
            pro.execute();
            rs = pro.getResultSet();
            while (rs.next()) {
                ca_conducta obj = Mappers.getMostrarConductaFromResultSet(rs);
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

    public ArrayList<us_permiso_curso> ComboCursoCalificacion(us_permiso_curso mp) {
        ArrayList<us_permiso_curso> lista = new ArrayList<us_permiso_curso>();
        try {
            con = c.conectar();
            con.setAutoCommit(false);
            CallableStatement pro = con.prepareCall(
                    "{ call ca_calificacion_cargar_combo_cursos(?,?) }");
            pro.setLong(1, mp.getId_usuario());
            pro.setLong(2, mp.getId_sucursal_per());
            pro.execute();
            rs = pro.getResultSet();
            while (rs.next()) {
                us_permiso_curso obj = Mappers.getCursoComboFromResultSet(rs);
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

    public ArrayList<JoinMaterias> ComboMateriaCalificacion(JoinMaterias pe) {
        ArrayList<JoinMaterias> lista = new ArrayList<JoinMaterias>();
        try {
            con = c.conectar();
            con.setAutoCommit(false);
            CallableStatement pro = con.prepareCall(
                    "{ call ca_calififcacion_mostrar_materias(?) }");
            pro.setLong(1, pe.getId_usuario());
            pro.execute();
            rs = pro.getResultSet();
            while (rs.next()) {
                JoinMaterias obj = Mappers.getMateriaCalificacionFromResultSet(rs);
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

    public void GuardarPermisosCursos(ArrayList<String> queryA) {

        try {
            con = c.conectar();
            for (int i = 0; i < queryA.size(); i++) {
                java.sql.Statement cst = con.createStatement();
                cst.executeUpdate(queryA.get(i));
            }
            con.close();
        } catch (SQLException ex) {
            Logger.getLogger(Crud.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Crud.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    public String ValidarPermisosCrear(JoinEmpleados us) {
        String valor = null;
        try {
            con = c.conectar();
            con.setAutoCommit(false);
            CallableStatement pro = con.prepareCall(
                    "{ call us_empleado_validar_permiso(?,?)}");
            pro.setLong(1, us.getId_usuario());
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
    
    public Integer BorrarPermisosCursos(JoinEmpleados us) {
        Integer valor = null;
        try {
            con = c.conectar();
            con.setAutoCommit(false);
            CallableStatement pro = con.prepareCall(
                    "{ call us_empleado_borrar_permiso(?,?,?)}");
            pro.setLong(1, us.getId_usuario());
            pro.setLong(2, us.getId_sucursal());
            pro.registerOutParameter("salida", Types.INTEGER);
            pro.executeUpdate();
            valor = pro.getInt("salida");
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
    
    public String ActualizarPermisosCursos(us_permiso_curso us) {
        String valor = null;
        try {
            con = c.conectar();
            con.setAutoCommit(false);
            CallableStatement pro = con.prepareCall(
                    "{ call us_permiso_actualizar(?,?,?,?,?,?)}");
            pro.setLong(1, us.getId_usuario());
            pro.setLong(2, us.getId_curso());
            pro.setString(3, us.getCurso());
            pro.setString(4, us.getPermiso());
            pro.setLong(5, us.getId_sucursal_per());
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
    
    public ArrayList<us_permiso_curso> VerificarEstadoPermisos(us_permiso_curso pe) {
        ArrayList<us_permiso_curso> lista = new ArrayList<>();
        try {
            con = c.conectar();
            con.setAutoCommit(false);
            CallableStatement pro = con.prepareCall(
                    "{ call us_permiso_verificar_estado(?) }");
            pro.setLong(1, pe.getId_usuario());
            pro.execute();
            rs = pro.getResultSet();
            while (rs.next()) {
                us_permiso_curso obj = Mappers.getPermisosCursosFromResultSet(rs);
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

    public String ResetearPermisosemplaeados() {
        String valor = null;
        try {
            con = c.conectar();
            con.setAutoCommit(false);
            CallableStatement pro = con.prepareCall(
                    "{ call us_usuario_permisos_cursos_truncate(?)}");
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
    
    public String MostrarPeriodo(Long id) {
        String periodo = "";
        try {
            con = c.conectar();
            ps = con.prepareStatement("SELECT `periodo` FROM `ma_periodo` \n"
                    + "WHERE `estado_pe` = 'INICIADO' AND `id_sucursal_pe` = " + id + ";");
            rs = ps.executeQuery();
            rs.next();
            periodo = rs.getString("periodo");
            con.close();
        } catch (SQLException e) {
            Logger.getLogger(Crud.class.getName()).log(Level.SEVERE, null, e);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Crud.class.getName()).log(Level.SEVERE, null, ex);
        }
        return periodo;
    }
    public ArrayList<JoinCalificacion> listarAlumnosCalificacionPorCurso(JoinCalificacion pe) {
        ArrayList<JoinCalificacion> lista = new ArrayList<JoinCalificacion>();
        try {
            con = c.conectar();
            con.setAutoCommit(false);
            CallableStatement pro = con.prepareCall(
                    "{ call ca_calificacion_mostrar_alumnos_por_curso(?,?,?,?,?) }");
            pro.setLong(1, pe.getParcial());
            pro.setString(2, pe.getMateria());
            pro.setString(3, pe.getParalelo());
            pro.setString(4, pe.getPeriodo());
            pro.setLong(5, pe.getId_sucursal());
            pro.executeQuery();
            rs = pro.getResultSet();
            while (rs.next()) {
                JoinCalificacion obj = Mappers.getCalificacionFromResultSet(rs);
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
    public void GuardarNotas(ArrayList<String> queryA) {

        try {
            con = c.conectar();
            for (int i = 0; i < queryA.size(); i++) {
                java.sql.Statement cst = con.createStatement();
                cst.executeUpdate(queryA.get(i));
            }
            con.close();
        } catch (SQLException ex) {
            Logger.getLogger(Crud.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Crud.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public ArrayList<JoinMatriculas> listarAlumnosMatriculasReportes(JoinMatriculas je) {
        ArrayList<JoinMatriculas> valor = new ArrayList<JoinMatriculas>();
        try {
            con = c.conectar();
            con.setAutoCommit(false);
            CallableStatement pro = con.prepareCall(
                    "{ call re_reporte_mostrar_matricula_actual(?,?) }");
            pro.setLong(1, je.getId_empresa());
            pro.setLong(2, je.getId_sucursal());
            rs = pro.executeQuery();
            while (rs.next()) {
                JoinMatriculas obj = Mappers.getMatriculasFromResultSet(rs);
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
    public ArrayList<JoinMatriculas> listarAlumnosMatriculasReportesCedula(JoinMatriculas je) {
        ArrayList<JoinMatriculas> valor = new ArrayList<JoinMatriculas>();
        try {
            con = c.conectar();
            con.setAutoCommit(false);
            CallableStatement pro = con.prepareCall(
                    "{ call re_reporte_matricula_actual_ced(?,?,?) }");
            pro.setLong(1, je.getId_empresa());
            pro.setLong(2, je.getId_sucursal());
            pro.setString(3, je.getCedula());
            rs = pro.executeQuery();
            while (rs.next()) {
                JoinMatriculas obj = Mappers.getMatriculasFromResultSet(rs);
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
    
    public ArrayList<JoinMatriculas> listarAlumnosMatriculasReportesCedulaTodoPeriodo(JoinMatriculas je) {
        ArrayList<JoinMatriculas> valor = new ArrayList<JoinMatriculas>();
        try {
            con = c.conectar();
            con.setAutoCommit(false);
            CallableStatement pro = con.prepareCall(
                    "{ call re_reporte_matricula_actual_ced_todos_periodos(?,?,?) }");
            pro.setLong(1, je.getId_empresa());
            pro.setLong(2, je.getId_sucursal());
            pro.setString(3, je.getCedula());
            rs = pro.executeQuery();
            while (rs.next()) {
                JoinMatriculas obj = Mappers.getMatriculasFromResultSet(rs);
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
    
    public ArrayList<JoinMatriculas> listarAlumnosMatriculasReportesAlumno(JoinMatriculas je) {
        ArrayList<JoinMatriculas> valor = new ArrayList<JoinMatriculas>();
        try {
            con = c.conectar();
            con.setAutoCommit(false);
            CallableStatement pro = con.prepareCall(
                    "{ call re_reporte_matricula_actual_nomb_ape(?,?,?) }");
            pro.setLong(1, je.getId_empresa());
            pro.setLong(2, je.getId_sucursal());
            pro.setString(3, je.getApellidos_nombres());
            rs = pro.executeQuery();
            while (rs.next()) {
                JoinMatriculas obj = Mappers.getMatriculasFromResultSet(rs);
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
    public ArrayList<JoinMatriculas> listarAlumnosMatriculasReportesAlumnoTodosPeriodos(JoinMatriculas je) {
        ArrayList<JoinMatriculas> valor = new ArrayList<JoinMatriculas>();
        try {
            con = c.conectar();
            con.setAutoCommit(false);
            CallableStatement pro = con.prepareCall(
                    "{ call re_reporte_matricula_actual_nomb_ape_todos_periodos(?,?,?) }");
            pro.setLong(1, je.getId_empresa());
            pro.setLong(2, je.getId_sucursal());
            pro.setString(3, je.getApellidos_nombres());
            rs = pro.executeQuery();
            while (rs.next()) {
                JoinMatriculas obj = Mappers.getMatriculasFromResultSet(rs);
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
    
    public ArrayList<JoinMatriculas> listarAlumnosMatriculasReportesCurso(JoinMatriculas je) {
        ArrayList<JoinMatriculas> valor = new ArrayList<JoinMatriculas>();
        try {
            con = c.conectar();
            con.setAutoCommit(false);
            CallableStatement pro = con.prepareCall(
                    "{ call re_reporte_matricula_actual_curso(?,?,?) }");
            pro.setLong(1, je.getId_empresa());
            pro.setLong(2, je.getId_sucursal());
            pro.setString(3, je.getParalelo());
            rs = pro.executeQuery();
            while (rs.next()) {
                JoinMatriculas obj = Mappers.getMatriculasFromResultSet(rs);
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
    public ArrayList<JoinMatriculas> listarAlumnosMatriculasReportesCursoPeriodo(JoinMatriculas je) {
        ArrayList<JoinMatriculas> valor = new ArrayList<JoinMatriculas>();
        try {
            con = c.conectar();
            con.setAutoCommit(false);
            CallableStatement pro = con.prepareCall(
                    "{ call re_reporte_matricula_actual_curso_periodo(?,?,?,?) }");
            pro.setLong(1, je.getId_empresa());
            pro.setLong(2, je.getId_sucursal());
            pro.setString(3, je.getParalelo());
            pro.setString(4, je.getPeriodo());
            rs = pro.executeQuery();
            while (rs.next()) {
                JoinMatriculas obj = Mappers.getMatriculasFromResultSet(rs);
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
    
    public ArrayList<ma_paralelo> ReporteCalifcacionComboParalelo(ma_paralelo mp) {
        ArrayList<ma_paralelo> lista = new ArrayList<ma_paralelo>();
        try {
            con = c.conectar();
            con.setAutoCommit(false);
            CallableStatement pro = con.prepareCall(
                    "{ call re_reporte_combo_paralelo(?) }");
            pro.setLong(1, mp.getId_sucursal_pa());
            pro.execute();
            rs = pro.getResultSet();
            while (rs.next()) {
                ma_paralelo obj = Mappers.getParaleloFromResultSet(rs);
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
    public ArrayList<JoinCalificacion> ReportePrimerQuimestre(JoinCalificacion pe) {
        ArrayList<JoinCalificacion> lista = new ArrayList<JoinCalificacion>();
        try {
            con = c.conectar();
            con.setAutoCommit(false);
            CallableStatement pro = con.prepareCall(
                    "{ call re_reporte_calificacion_pq(?,?) }");
            pro.setLong(1, pe.getId_matricula());
            pro.setLong(2, pe.getId_sucursal());
            pro.execute();
            rs = pro.getResultSet();
            while (rs.next()) {
                JoinCalificacion obj = Mappers.getCalificacionFromResultSet(rs);
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
    
    public ArrayList<JoinCalificacion> ReportePQTodosPeriodos(JoinCalificacion pe) {
        ArrayList<JoinCalificacion> lista = new ArrayList<JoinCalificacion>();
        try {
            con = c.conectar();
            con.setAutoCommit(false);
            CallableStatement pro = con.prepareCall(
                    "{ call re_reporte_calificacion_pq_todos_periodos(?,?) }");
            pro.setLong(1, pe.getId_matricula());
            pro.setLong(2, pe.getId_sucursal());
            pro.execute();
            rs = pro.getResultSet();
            while (rs.next()) {
                JoinCalificacion obj = Mappers.getCalificacionFromResultSet(rs);
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
    
    public ArrayList<JoinCalificacion> ReporteSegundoQuimestre(JoinCalificacion pe) {
        ArrayList<JoinCalificacion> lista = new ArrayList<JoinCalificacion>();
        try {
            con = c.conectar();
            con.setAutoCommit(false);
            CallableStatement pro = con.prepareCall(
                    "{ call re_reporte_calificacion_sq(?,?) }");
            pro.setLong(1, pe.getId_matricula());
            pro.setLong(2, pe.getId_sucursal());
            pro.execute();
            rs = pro.getResultSet();
            while (rs.next()) {
                JoinCalificacion obj = Mappers.getCalificacionFromResultSet(rs);
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
    
    public ArrayList<JoinCalificacion> ReporteSQTodosPeriodos(JoinCalificacion pe) {
        ArrayList<JoinCalificacion> lista = new ArrayList<JoinCalificacion>();
        try {
            con = c.conectar();
            con.setAutoCommit(false);
            CallableStatement pro = con.prepareCall(
                    "{ call re_reporte_calificacion_sq_todos_periodos(?,?) }");
            pro.setLong(1, pe.getId_matricula());
            pro.setLong(2, pe.getId_sucursal());
            pro.execute();
            rs = pro.getResultSet();
            while (rs.next()) {
                JoinCalificacion obj = Mappers.getCalificacionFromResultSet(rs);
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
    
    public void matriculaAnualEstado(ArrayList<String> queryA) {

        try {
            con = c.conectar();
            for (int i = 0; i < queryA.size(); i++) {
                java.sql.Statement cst = con.createStatement();
                cst.executeUpdate(queryA.get(i));
            }
            con.close();
        } catch (SQLException ex) {
            Logger.getLogger(Crud.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Crud.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    public void paraleloCapacidadAnual(ArrayList<String> queryB) {

        try {
            con = c.conectar();
            for (int i = 0; i < queryB.size(); i++) {
                java.sql.Statement cst = con.createStatement();
                cst.executeUpdate(queryB.get(i));
            }
            con.close();
        } catch (SQLException ex) {
            Logger.getLogger(Crud.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Crud.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    public ArrayList<ma_periodo> ReporteCalificacionPeriodo(ma_periodo mp) {
        ArrayList<ma_periodo> lista = new ArrayList<ma_periodo>();
        try {
            con = c.conectar();
            con.setAutoCommit(false);
            CallableStatement pro = con.prepareCall(
                    "{ call re_reportes_cargar_combo_periodo(?) }");
            pro.setLong(1, mp.getId_sucursal_pe());
            pro.execute();
            rs = pro.getResultSet();
            while (rs.next()) {
                ma_periodo obj = Mappers.getPeriodoFromResultSet(rs);
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
    public ArrayList<JoinMatriculas> listarAlumnosMatriculasReportesImpresion(JoinMatriculas je) {
        ArrayList<JoinMatriculas> valor = new ArrayList<JoinMatriculas>();
        try {
            con = c.conectar();
            con.setAutoCommit(false);
            CallableStatement pro = con.prepareCall(
                    "{ call re_reportes_mostrar_alumnos_todos(?,?) }");
            pro.setLong(1, je.getId_empresa());
            pro.setLong(2, je.getId_sucursal());
            rs = pro.executeQuery();
            while (rs.next()) {
                JoinMatriculas obj = Mappers.getMatriculasFromResultSet(rs);
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
    public ArrayList<JoinMatriculas> ReporteListarMatriculasCedula(JoinMatriculas je) {
        ArrayList<JoinMatriculas> valor = new ArrayList<JoinMatriculas>();
        try {
            con = c.conectar();
            con.setAutoCommit(false);
            CallableStatement pro = con.prepareCall(
                    "{ call re_reportes_mostrar_alumnos_todos_cedula(?,?,?) }");
            pro.setLong(1, je.getId_empresa());
            pro.setLong(2, je.getId_sucursal());
            pro.setString(3, je.getCedula());
            rs = pro.executeQuery();
            while (rs.next()) {
                JoinMatriculas obj = Mappers.getMatriculasFromResultSet(rs);
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
    public ArrayList<JoinMatriculas> ReporteListarMatriculasApellidosNombres(JoinMatriculas je) {
        ArrayList<JoinMatriculas> valor = new ArrayList<JoinMatriculas>();
        try {
            con = c.conectar();
            con.setAutoCommit(false);
            CallableStatement pro = con.prepareCall(
                    "{ call re_reportes_mostrar_alumnos_todos_alumno(?,?,?) }");
            pro.setLong(1, je.getId_empresa());
            pro.setLong(2, je.getId_sucursal());
            pro.setString(3, je.getApellidos_nombres());
            rs = pro.executeQuery();
            while (rs.next()) {
                JoinMatriculas obj = Mappers.getMatriculasFromResultSet(rs);
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
    
    public String ValidarAlumnosGraduados(JoinMatriculas us) {
        String valor = null;
        try {
            con = c.conectar();
            con.setAutoCommit(false);
            CallableStatement pro = con.prepareCall(
                    "{ call us_usuarios_graduados(?,?,?) }");
            pro.setLong(1, us.getId_sucursal());
            pro.setLong(2, us.getId_usuario());
            pro.setLong(3, us.getId_empleado());
            pro.execute();
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
    
    public ArrayList<JoinGraduados> listarAlumnosGraduadosReportes(JoinGraduados je) {
        ArrayList<JoinGraduados> valor = new ArrayList<JoinGraduados>();
        try {
            con = c.conectar();
            con.setAutoCommit(false);
            CallableStatement pro = con.prepareCall(
                    "{ call ma_matricula_graduados(?,?) }");
            pro.setLong(1, je.getId_sucursal());
            pro.setString(2, je.getPeriodo());
            rs = pro.executeQuery();
            while (rs.next()) {
                JoinGraduados obj = Mappers.getGraduadosFromResultSet(rs);
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
    
    public ArrayList<JoinGraduados> listarAlumnosGraduadosTodosReportes(JoinGraduados je) {
        ArrayList<JoinGraduados> valor = new ArrayList<JoinGraduados>();
        try {
            con = c.conectar();
            con.setAutoCommit(false);
            CallableStatement pro = con.prepareCall(
                    "{ call ma_matricula_graduados_todos(?) }");
            pro.setLong(1, je.getId_sucursal());
            rs = pro.executeQuery();
            while (rs.next()) {
                JoinGraduados obj = Mappers.getGraduadosFromResultSet(rs);
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
    
    public ArrayList<JoinGraduados> listarAlumnosGraduadosCedulaReportes(JoinGraduados je) {
        ArrayList<JoinGraduados> valor = new ArrayList<JoinGraduados>();
        try {
            con = c.conectar();
            con.setAutoCommit(false);
            CallableStatement pro = con.prepareCall(
                    "{ call ma_matricula_graduados_cedula(?,?) }");
            pro.setLong(1, je.getId_sucursal());
            pro.setString(2, je.getCedula());
            rs = pro.executeQuery();
            while (rs.next()) {
                JoinGraduados obj = Mappers.getGraduadosFromResultSet(rs);
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
    
    public ArrayList<JoinGraduados> listarAlumnosGraduadosAlumnoReportes(JoinGraduados je) {
        ArrayList<JoinGraduados> valor = new ArrayList<JoinGraduados>();
        try {
            con = c.conectar();
            con.setAutoCommit(false);
            CallableStatement pro = con.prepareCall(
                    "{ call ma_matricula_graduados_alumno(?,?) }");
            pro.setLong(1, je.getId_sucursal());
            pro.setString(2, je.getApellidos_nombres());
            rs = pro.executeQuery();
            while (rs.next()) {
                JoinGraduados obj = Mappers.getGraduadosFromResultSet(rs);
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
    
    public String HiloStatement() {
        String valor = null;
        try {
            con = c.conectar();
            con.setAutoCommit(false);
            CallableStatement pro = con.prepareCall(
                    "{ call hilo(?)}");
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
    
    public String estadoMatricula(bloqueo bl) {
        String valor = "";
        try {
            con = c.conectar();
            con.setAutoCommit(false);
            CallableStatement pro = con.prepareCall(
                    "{ call select_estado_modulo_matricula(?,?) }");
            pro.setLong(1, bl.getId_sucursal_bloqueo());
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
    
    public String estadoCalificacion(bloqueo bl) {
        String valor = "";
        try {
            con = c.conectar();
            con.setAutoCommit(false);
            CallableStatement pro = con.prepareCall(
                    "{ call select_estado_modulo_calificacion(?,?) }");
            pro.setLong(1, bl.getId_sucursal_bloqueo());
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
    
    public String estadoCalificacionAct(bloqueo bl) {
        String valor = "";
        try {
            con = c.conectar();
            con.setAutoCommit(false);
            CallableStatement pro = con.prepareCall(
                    "{ call estado_modulo_calificacion_activar(?) }");
            pro.setLong(1, bl.getId_sucursal_bloqueo());
            pro.execute();
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
    public String estadoCalificacionDesact(bloqueo bl) {
        String valor = "";
        try {
            con = c.conectar();
            con.setAutoCommit(false);
            CallableStatement pro = con.prepareCall(
                    "{ call estado_modulo_calificacion_desactivar(?) }");
            pro.setLong(1, bl.getId_sucursal_bloqueo());
            pro.execute();
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
    
    public String estadoMatriculaAct(bloqueo bl) {
        String valor = "";
        try {
            con = c.conectar();
            con.setAutoCommit(false);
            CallableStatement pro = con.prepareCall(
                    "{ call estado_modulo_matricula_activar(?) }");
            pro.setLong(1, bl.getId_sucursal_bloqueo());
            pro.execute();
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
    public String estadoMatriculaDesact(bloqueo bl) {
        String valor = "";
        try {
            con = c.conectar();
            con.setAutoCommit(false);
            CallableStatement pro = con.prepareCall(
                    "{ call estado_modulo_matricula_desactivar(?) }");
            pro.setLong(1, bl.getId_sucursal_bloqueo());
            pro.execute();
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
    
    public String CrearPrecio(gen_precios us) {
        String valor = null;
        try {
            con = c.conectar();
            con.setAutoCommit(false);
            CallableStatement pro = con.prepareCall(
                    "{ call crear_precios(?,?,?,?,?,?,?) }");
            pro.setDouble(1, us.getValor());
            pro.setString(2, us.getPromocion());
            pro.setLong(3, us.getId_creacion());
            pro.setString(4, us.getCodigo());
            pro.setString(5, us.getPago());
            pro.setLong(6, us.getId_sucursal());
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
    
    public ArrayList<gen_precios> mostrarPrecios(gen_precios p) {
        ArrayList<gen_precios> valor = new ArrayList<gen_precios>();
        try {
            con = c.conectar();
            con.setAutoCommit(false);
            CallableStatement pro = con.prepareCall(
                    "{ call gen_mostrar_precios(?) }");
            pro.setLong(1, p.getId_sucursal());
            rs = pro.executeQuery();
            while (rs.next()) {
                gen_precios obj = Mappers.getPreciosFromResultSet(rs);
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
    public String ActualizarPrecio(gen_precios us) {
        String valor = null;
        try {
            con = c.conectar();
            con.setAutoCommit(false);
            CallableStatement pro = con.prepareCall(
                    "{ call gen_actualizar_precios(?,?,?,?,?,?,?,?,?) }");
            pro.setDouble(1, us.getValor());
            pro.setString(2, us.getPromocion());
            pro.setLong(3, us.getId_creacion());
            pro.setString(4, us.getCodigo());
            pro.setString(5, us.getPago());
            pro.setLong(6, us.getId_sucursal());
            pro.setString(7, us.getEstado_pre());
            pro.setLong(8, us.getId_precios());
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
    public ArrayList<gen_precios> ComboValor(gen_precios mp) {
        ArrayList<gen_precios> lista = new ArrayList<gen_precios>();
        try {
            con = c.conectar();
            con.setAutoCommit(false);
            CallableStatement pro = con.prepareCall(
                    "{ call ma_matricula_combo_valor(?) }");
            pro.setLong(1, mp.getId_sucursal());
            pro.execute();
            rs = pro.getResultSet();
            while (rs.next()) {
                gen_precios obj = Mappers.getValorFromResultSet(rs);
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
    
    public ArrayList<gen_precios> ComboMensualidad(gen_precios mp) {
        ArrayList<gen_precios> lista = new ArrayList<gen_precios>();
        try {
            con = c.conectar();
            con.setAutoCommit(false);
            CallableStatement pro = con.prepareCall(
                    "{ call ma_matricula_combo_mensualidad(?,?) }");
            pro.setLong(1, mp.getId_sucursal());
            pro.setDouble(2, mp.getValor());
            pro.execute();
            rs = pro.getResultSet();
            while (rs.next()) {
                gen_precios obj = Mappers.getValorFromResultSet(rs);
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
    
    public ArrayList<JoinMatriculas> listarAlumnosMatriculasReportesTodos(JoinMatriculas je) {
        ArrayList<JoinMatriculas> valor = new ArrayList<JoinMatriculas>();
        try {
            con = c.conectar();
            con.setAutoCommit(false);
            CallableStatement pro = con.prepareCall(
                    "{ call re_reporte_mostrar_matricula_todo(?,?) }");
            pro.setLong(1, je.getId_empresa());
            pro.setLong(2, je.getId_sucursal());
            rs = pro.executeQuery();
            while (rs.next()) {
                JoinMatriculas obj = Mappers.getMatriculasFromResultSet(rs);
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
    
    public ArrayList<JoinMatriculas> listarAlumnosMensualidadTodos(JoinMatriculas je) {
        ArrayList<JoinMatriculas> valor = new ArrayList<JoinMatriculas>();
        try {
            con = c.conectar();
            con.setAutoCommit(false);
            CallableStatement pro = con.prepareCall(
                    "{ call ma_mostrar_mensualidad_todos(?) }");
//            pro.setLong(1, je.getId_empresa());
            pro.setLong(1, je.getId_sucursal());
            rs = pro.executeQuery();
            while (rs.next()) {
                JoinMatriculas obj = Mappers.getMatriculasFromResultSet(rs);
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
    public ArrayList<ma_mensualidad> listarAlumnosMensualidadPorAlumno(ma_mensualidad je) {
        ArrayList<ma_mensualidad> valor = new ArrayList<ma_mensualidad>();
        try {
            con = c.conectar();
            con.setAutoCommit(false);
            CallableStatement pro = con.prepareCall(
                    "{ call ma_mostrar_mensualidades(?,?) }");
            pro.setLong(1, je.getId_matricula());
            pro.setLong(2, je.getId_sucursal_men());
            rs = pro.executeQuery();
            while (rs.next()) {
                ma_mensualidad obj = Mappers.getMostrarmensualidadFromResultSet(rs);
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
    
    public ArrayList<JoinMatriculas> listarMensualidadesCedula(JoinMatriculas je) {
        ArrayList<JoinMatriculas> valor = new ArrayList<JoinMatriculas>();
        try {
            con = c.conectar();
            con.setAutoCommit(false);
            CallableStatement pro = con.prepareCall(
                    "{ call ma_mensualidad_buscar_ced(?,?) }");
            pro.setLong(1, je.getId_sucursal());
            pro.setString(2, je.getCedula());
            rs = pro.executeQuery();
            while (rs.next()) {
                JoinMatriculas obj = Mappers.getMatriculasFromResultSet(rs);
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
    
    public ArrayList<JoinMatriculas> listarMensualidadesPersona(JoinMatriculas je) {
        ArrayList<JoinMatriculas> valor = new ArrayList<JoinMatriculas>();
        try {
            con = c.conectar();
            con.setAutoCommit(false);
            CallableStatement pro = con.prepareCall(
                    "{ call ma_mostrar_mensualidad_nom_ape(?,?) }");
            pro.setLong(1, je.getId_sucursal());
            pro.setString(2, je.getCedula());
            rs = pro.executeQuery();
            while (rs.next()) {
                JoinMatriculas obj = Mappers.getMatriculasFromResultSet(rs);
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
    
    public String cobroMensualidad(ma_mensualidad us) {
        String valor = null;
        try {
            con = c.conectar();
            con.setAutoCommit(false);
            CallableStatement pro = con.prepareCall(
                    "{ call ma_mensualidad_cobrar(?,?,?,?,?,?,?,?)}");
            pro.setLong(1, us.getId_mensualidad());
            pro.setLong(2, us.getId_sucursal_men());
            pro.setLong(3, us.getId_matricula());
            pro.setDouble(4, us.getDeuda());
            pro.setDouble(5, us.getTotal());
            pro.setString(6, us.getEstado());
            pro.setLong(7, us.getId_actualizacion());
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
    
    public String valorRecaudado(JoinMatriculas us) {
        String valor = null;
        try {
            con = c.conectar();
            con.setAutoCommit(false);
            CallableStatement pro = con.prepareCall(
                    "{ call ma_valor_recaudado(?,?,?)}");
            pro.setLong(1, us.getId_matricula());
            pro.setLong(2, us.getId_empleado());
            pro.setDouble(3, us.getValor_recaudado());
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
    
    public String HiloStatement2() {
        String valor = null;
        try {
            con = c.conectar();
            con.setAutoCommit(false);
            CallableStatement pro = con.prepareCall(
                    "{ call hilo_dos(?)}");
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
    
    public ArrayList<JoinMatriculas> listarAlumnosMatriculasConducta(JoinMatriculas je) {
        ArrayList<JoinMatriculas> valor = new ArrayList<JoinMatriculas>();
        try {
            con = c.conectar();
            con.setAutoCommit(false);
            CallableStatement pro = con.prepareCall(
                    "{ call mostrar_matriculas_conducta(?) }");
            pro.setLong(1, je.getId_sucursal());
            rs = pro.executeQuery();
            while (rs.next()) {
                JoinMatriculas obj = Mappers.getMatriculasConductaFromResultSet(rs);
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
    public ArrayList<JoinMatriculas> listarMatriculasConductaCedula(JoinMatriculas je) {
        ArrayList<JoinMatriculas> valor = new ArrayList<JoinMatriculas>();
        try {
            con = c.conectar();
            con.setAutoCommit(false);
            CallableStatement pro = con.prepareCall(
                    "{ call mostrar_matriculas_conducta_cedula(?,?) }");
            pro.setLong(1, je.getId_sucursal());
            pro.setString(2, je.getCedula());
            rs = pro.executeQuery();
            while (rs.next()) {
                JoinMatriculas obj = Mappers.getMatriculasConductaFromResultSet(rs);
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
    public ArrayList<JoinMatriculas> listarMatriculasConductaApellidosNombres(JoinMatriculas je) {
        ArrayList<JoinMatriculas> valor = new ArrayList<JoinMatriculas>();
        try {
            con = c.conectar();
            con.setAutoCommit(false);
            CallableStatement pro = con.prepareCall(
                    "{ call mostrar_matriculas_conducta_nom_ape(?,?) }");
            pro.setLong(1, je.getId_sucursal());
            pro.setString(2, je.getApellidos_nombres());
            rs = pro.executeQuery();
            while (rs.next()) {
                JoinMatriculas obj = Mappers.getMatriculasConductaFromResultSet(rs);
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
    
    public String Conducta(JoinMatriculas us) {
        String valor = null;
        try {
            con = c.conectar();
            con.setAutoCommit(false);
            CallableStatement pro = con.prepareCall(
                    "{ call ma_calificar_conducta(?,?,?,?,?,?) }");
            pro.setLong(1, us.getId_matricula());
            pro.setLong(2, us.getId_sucursal());
            pro.setLong(3, us.getId_empleado());
            pro.setString(4, us.getConducta_general());
            pro.setString(5, us.getMatricula_obs());
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
    
    
}
