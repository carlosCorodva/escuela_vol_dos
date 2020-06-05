/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SE.entidades.mappers;

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
import SE.entidades.precios;
import SE.entidades.us_permiso_curso;
import SE.entidades.us_permiso_empleado;
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
            obj.setObservacion(rs.getString("Observacion"));
            obj.setUsuario(rs.getString("Usuario"));
            obj.setId_empresa(rs.getLong("Id_empresa"));
            obj.setNombre_comercial_em(rs.getString("Nombre_comercial_em"));
            obj.setRuc_em(rs.getString("ruc_em"));
            obj.setTelefono_em(rs.getString("telefono_em"));
            obj.setDireccion_em(rs.getString("direccion_em"));
            obj.setCorreo_em(rs.getString("correo_em"));
            obj.setEstado_em(rs.getString("estado_em"));
            obj.setId_sucursal(rs.getLong("id_sucursal"));
            obj.setNombre_comercial_su(rs.getString("nombre_comercial_su"));
            obj.setTelefono_su(rs.getString("telefono_su"));
            obj.setDireccion_su(rs.getString("direccion_su"));
            obj.setCorreo_su(rs.getString("correo_su"));
            obj.setEstado_su(rs.getString("estado_su"));
            obj.setCanton(rs.getString("Canton"));
            obj.setProvincia(rs.getString("Provincia"));
            obj.setProvincia_suc(rs.getString("Provincia_suc"));
            obj.setCanton_suc(rs.getString("Canton_suc"));
            obj.setJornada(rs.getString("Jornada"));
            obj.setDistrito(rs.getString("Distrito"));
            obj.setCircuito(rs.getString("Circuito"));
            obj.setZona(rs.getString("Zona"));
            
        } catch (SQLException ex) {
            Logger.getLogger(Mappers.class.getName()).log(Level.SEVERE, null, ex);
        }
        return obj;
    }
    
    public static us_permiso_empleado getEmpleadosPermisosFromResultSet(ResultSet rs) {
        us_permiso_empleado obj = new us_permiso_empleado();
        try {
//            obj.setId_usuario(rs.getLong("Id_usuario"));
//            obj.setId_permiso(rs.getLong("Id_permiso"));
            obj.setEstado_pe(rs.getString("Estado_pe"));
//            obj.setId_materia(rs.getLong("Id_materia"));

        } catch (SQLException ex) {
            Logger.getLogger(Mappers.class.getName()).log(Level.SEVERE, null, ex);
        }
        return obj;
    }
//    public static em_empresa getEmpresaFromResultSet(ResultSet rs) {
//        em_empresa obj = new em_empresa();
//        try {
//            obj.setNombre_comercial_em(rs.getString("Nombre_comercial_em"));
//
//        } catch (SQLException ex) {
//            Logger.getLogger(Mappers.class.getName()).log(Level.SEVERE, null, ex);
//        }
//        return obj;
//    }
//    public static JoinEmpleados getSucursalFromResultSet(ResultSet rs) {
//        JoinEmpleados obj = new JoinEmpleados();
//        try {
//            obj.setNombre_comercial_su(rs.getString("Nombre_comercial_su"));
//
//        } catch (SQLException ex) {
//            Logger.getLogger(Mappers.class.getName()).log(Level.SEVERE, null, ex);
//        }
//        return obj;
//    }
    public static JoinEmpleados getEmpresaFromResultSet(ResultSet rs) {
        JoinEmpleados obj = new JoinEmpleados();
        try {
            obj.setNombre_comercial_em(rs.getString("Nombre_comercial_em"));

        } catch (SQLException ex) {
            Logger.getLogger(Mappers.class.getName()).log(Level.SEVERE, null, ex);
        }
        return obj;
    }
    public static JoinEmpleados getSucursalFromResultSet(ResultSet rs) {
        JoinEmpleados obj = new JoinEmpleados();
        try {
            obj.setNombre_comercial_su(rs.getString("Nombre_comercial_su"));

        } catch (SQLException ex) {
            Logger.getLogger(Mappers.class.getName()).log(Level.SEVERE, null, ex);
        }
        return obj;
    }
    public static ca_materia getMateriaFromResultSet(ResultSet rs) {
        ca_materia obj = new ca_materia();
        try {
            obj.setId_materia(rs.getLong("Id_materia"));
            obj.setMateria(rs.getString("Materia"));

        } catch (SQLException ex) {
            Logger.getLogger(Mappers.class.getName()).log(Level.SEVERE, null, ex);
        }
        return obj;
    }
    public static ma_paralelo getCursosFromResultSet(ResultSet rs) {
        ma_paralelo obj = new ma_paralelo();
        try {
            obj.setId_paralelo(rs.getLong("Id_paralelo"));
            obj.setParalelo(rs.getString("Paralelo"));
            obj.setParalelo_obs(rs.getString("Paralelo_obs"));
            obj.setEstado_pa(rs.getString("Estado_pa"));
            obj.setNivel(rs.getLong("Nivel"));
            obj.setN_capacidad(rs.getLong("N_capacidad"));
        } catch (SQLException ex) {
            Logger.getLogger(Mappers.class.getName()).log(Level.SEVERE, null, ex);
        }
        return obj;
    }
    
    public static us_permiso_curso getPermisosCursosFromResultSet(ResultSet rs) {
        us_permiso_curso obj = new us_permiso_curso();
        try {
            obj.setId_curso(rs.getLong("Id_curso"));
            obj.setCurso(rs.getString("Curso"));
            obj.setPermiso(rs.getString("Permiso"));
            obj.setId_empresa_per(rs.getLong("id_empresa_per"));
            obj.setId_usuario(rs.getLong("id_usuario"));
            obj.setId_sucursal_per(rs.getLong("id_sucursal_per"));

        } catch (SQLException ex) {
            Logger.getLogger(Mappers.class.getName()).log(Level.SEVERE, null, ex);
        }
        return obj;
    }
    
    public static us_permiso_curso getCursosPermisosFromResultSet(ResultSet rs) {
        us_permiso_curso obj = new us_permiso_curso();
        try {
            obj.setId_curso(rs.getLong("Id_curso"));
            obj.setCurso(rs.getString("Curso"));
            obj.setPermiso(rs.getString("Permiso"));

        } catch (SQLException ex) {
            Logger.getLogger(Mappers.class.getName()).log(Level.SEVERE, null, ex);
        }
        return obj;
    }
    
    public static ma_periodo getPeriodosFromResultSet(ResultSet rs) {
        ma_periodo obj = new ma_periodo();
        try {
            obj.setId_periodo(rs.getLong("Id_periodo"));
            obj.setPeriodo(rs.getString("Periodo"));
            obj.setEstado_pe(rs.getString("Estado_pe"));

        } catch (SQLException ex) {
            Logger.getLogger(Mappers.class.getName()).log(Level.SEVERE, null, ex);
        }
        return obj;
    }
    public static em_empresa getMostrarEmpresaFromResultSet(ResultSet rs) {
        em_empresa obj = new em_empresa();
        try {
            obj.setId_empresa(rs.getLong("Id_empresa"));
            obj.setCorreo_em(rs.getString("Correo_em"));
            obj.setDireccion_em(rs.getString("Direccion_em"));
//            obj.setEstado_em(rs.getString("Estado_em"));
            obj.setNombre_comercial_em(rs.getString("Nombre_comercial_em"));
            obj.setRuc_em(rs.getString("Ruc_em"));
            obj.setTelefono_em(rs.getString("Telefono_em"));
            obj.setProvincia(rs.getString("Provincia"));
            obj.setCanton(rs.getString("Canton"));

        } catch (SQLException ex) {
            Logger.getLogger(Mappers.class.getName()).log(Level.SEVERE, null, ex);
        }
        return obj;
    }
    public static em_sucursal getMostrarSucursalFromResultSet(ResultSet rs) {
        em_sucursal obj = new em_sucursal();
        try {
            obj.setId_sucursal(rs.getLong("Id_sucursal"));
            obj.setCorreo_su(rs.getString("Correo_su"));
            obj.setDireccion_su(rs.getString("Direccion_su"));
            obj.setEstado_su(rs.getString("Estado_su"));
            obj.setNombre_comercial_su(rs.getString("Nombre_comercial_su"));
            obj.setTelefono_su(rs.getString("Telefono_su"));
            obj.setEstado_su(rs.getString("Estado_su"));
            obj.setProvincia_suc(rs.getString("Provincia_suc"));
            obj.setCanton_suc(rs.getString("Canton_suc"));
            obj.setJornada(rs.getString("Jornada"));
            obj.setDistrito(rs.getString("Distrito"));
            obj.setCircuito(rs.getString("Circuito"));
            obj.setZona(rs.getString("Zona"));
        } catch (SQLException ex) {
            Logger.getLogger(Mappers.class.getName()).log(Level.SEVERE, null, ex);
        }
        return obj;
    }
    
    public static em_sucursal getSucursalParaInactivosFromResultSet(ResultSet rs) {
        em_sucursal obj = new em_sucursal();
        try {
            obj.setNombre_comercial_su(rs.getString("Nombre_comercial_su"));

        } catch (SQLException ex) {
            Logger.getLogger(Mappers.class.getName()).log(Level.SEVERE, null, ex);
        }
        return obj;
    }
    public static JoinMatriculas getMatriculasFromResultSet(ResultSet rs) {
        JoinMatriculas obj = new JoinMatriculas();
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
            obj.setPartida_nacimiento(rs.getLong("Partida_nacimiento"));
            obj.setObservacion(rs.getString("Observacion"));
            obj.setUsuario(rs.getString("Usuario"));
            obj.setId_empresa(rs.getLong("Id_empresa"));
            obj.setNombre_comercial_em(rs.getString("Nombre_comercial_em"));
            obj.setRuc_em(rs.getString("ruc_em"));
            obj.setTelefono_em(rs.getString("telefono_em"));
            obj.setDireccion_em(rs.getString("direccion_em"));
            obj.setCorreo_em(rs.getString("correo_em"));
            obj.setEstado_em(rs.getString("estado_em"));
            obj.setId_sucursal(rs.getLong("id_sucursal"));
            obj.setNombre_comercial_su(rs.getString("nombre_comercial_su"));
            obj.setTelefono_su(rs.getString("telefono_su"));
            obj.setDireccion_su(rs.getString("direccion_su"));
            obj.setCorreo_su(rs.getString("correo_su"));
            obj.setEstado_su(rs.getString("estado_su"));
            obj.setId_matricula(rs.getLong("Id_matricula"));
            obj.setId_periodo(rs.getLong("Id_periodo"));
            obj.setId_paralelo(rs.getLong("Id_paralelo"));
            obj.setMatricula_obs(rs.getString("Matricula_obs"));
            obj.setEstado_matricula(rs.getString("Estado_matricula"));
            obj.setPromedio_matricula(rs.getDouble("Promedio_matricula"));
            obj.setParalelo(rs.getString("Paralelo"));
            obj.setPeriodo(rs.getString("Periodo"));
            obj.setCorreo_dos(rs.getString("Correo_dos"));
            obj.setGraduado(rs.getString("Graduado"));
            obj.setCedula_uno(rs.getString("Cedula_uno"));
            obj.setCedula_dos(rs.getString("Cedula_dos"));
            obj.setRepresentante(rs.getString("Representante"));
            obj.setRepresentante_dos(rs.getString("Representante_dos"));
            obj.setParentesco(rs.getString("Parentesco"));
            obj.setParentesco_dos(rs.getString("Parentesco_dos"));
            obj.setAnt_escuela(rs.getString("Ant_escuela"));
            obj.setValor_mat(rs.getDouble("valor_mat"));
            obj.setConducta_general(rs.getString("conducta_general"));
        } catch (SQLException ex) {
            Logger.getLogger(Mappers.class.getName()).log(Level.SEVERE, null, ex);
        }
        return obj;
    }
    public static ma_paralelo getParaleloFromResultSet(ResultSet rs) {
        ma_paralelo obj = new ma_paralelo();
        try {
            obj.setParalelo(rs.getString("Paralelo"));
        } catch (SQLException ex) {
            Logger.getLogger(Mappers.class.getName()).log(Level.SEVERE, null, ex);
        }
        return obj;
    }
    public static JoinMatriculas getParaleloActualizarFromResultSet(ResultSet rs) {
        JoinMatriculas obj = new JoinMatriculas();
        try {
            obj.setParalelo(rs.getString("Paralelo"));
        } catch (SQLException ex) {
            Logger.getLogger(Mappers.class.getName()).log(Level.SEVERE, null, ex);
        }
        return obj;
    }
    public static ca_conducta getMostrarConductaFromResultSet(ResultSet rs) {
        ca_conducta obj = new ca_conducta();
        try {
            obj.setId_conducta(rs.getLong("Id_conducta"));
            obj.setConducta(rs.getString("Conducta"));
            obj.setDescripcion(rs.getString("Descripcion"));
            obj.setReferencia(rs.getString("Referencia"));
        } catch (SQLException ex) {
            Logger.getLogger(Mappers.class.getName()).log(Level.SEVERE, null, ex);
        }
        return obj;
    }
    public static us_permiso_curso getCursoComboFromResultSet(ResultSet rs) {
        us_permiso_curso obj = new us_permiso_curso();
        try {
            obj.setCurso(rs.getString("Curso"));
        } catch (SQLException ex) {
            Logger.getLogger(Mappers.class.getName()).log(Level.SEVERE, null, ex);
        }
        return obj;
    }
    public static JoinMaterias getMateriaCalificacionFromResultSet(ResultSet rs) {
        JoinMaterias obj = new JoinMaterias();
        try {
            obj.setMateria(rs.getString("Materia"));

        } catch (SQLException ex) {
            Logger.getLogger(Mappers.class.getName()).log(Level.SEVERE, null, ex);
        }
        return obj;
    }
    public static ma_periodo getPeriodoFromResultSet(ResultSet rs) {
        ma_periodo obj = new ma_periodo();
        try {
            obj.setPeriodo(rs.getString("Periodo"));

        } catch (SQLException ex) {
            Logger.getLogger(Mappers.class.getName()).log(Level.SEVERE, null, ex);
        }
        return obj;
    }
    public static JoinCalificacion getCalificacionFromResultSet(ResultSet rs) {
        JoinCalificacion obj = new JoinCalificacion();
        try {
            obj.setId_calificacion(rs.getLong("Id_calificacion"));
            obj.setId_matricula(rs.getLong("Id_matricula"));
            obj.setId_periodo(rs.getLong("Id_periodo"));
            obj.setId_paralelo(rs.getLong("Id_paralelo"));
            obj.setId_conducta(rs.getLong("Id_conducta"));
            obj.setId_sucursal(rs.getLong("Id_sucursal"));
            obj.setId_materia(rs.getLong("Id_materia"));
            obj.setApellidos_nombres(rs.getString("Apellidos_nombres"));
            obj.setAporte(rs.getDouble("Aporte"));
            obj.setCalificacion_obs(rs.getString("Calificacion_obs"));
            obj.setConducta(rs.getString("Conducta"));
            obj.setEstado_ca(rs.getString("Estado_ca"));
            obj.setExamen(rs.getDouble("Examen"));
            obj.setExamen_de_gracia(rs.getDouble("Examen_de_gracia"));
            obj.setMateria(rs.getString("Materia"));
            obj.setNota_formativa(rs.getDouble("Nota_formativa"));
            obj.setNota_practica(rs.getDouble("Nota_practica"));
            obj.setOchenta_porcentaje(rs.getDouble("Ochenta_porcentaje"));
            obj.setParalelo(rs.getString("Paralelo"));
            obj.setParcial(rs.getLong("Parcial"));
            obj.setPeriodo(rs.getString("Periodo"));
            obj.setPromedio(rs.getDouble("Promedio"));
            obj.setRemedial(rs.getDouble("Remedial"));
            obj.setSupletorio(rs.getDouble("Supletorio"));
            obj.setVeinte_porcentaje(rs.getDouble("Veinte_porcentaje"));

        } catch (SQLException ex) {
            Logger.getLogger(Mappers.class.getName()).log(Level.SEVERE, null, ex);
        }
        return obj;
    }
    public static JoinGraduados getGraduadosFromResultSet(ResultSet rs) {
        JoinGraduados obj = new JoinGraduados();
        try {
            obj.setId_usuario(rs.getLong("Id_usuario"));
            obj.setId_registro(rs.getLong("Id_registro"));
            obj.setApellidos_nombres(rs.getString("Apellidos_nombres"));
            obj.setCedula(rs.getString("Cedula"));
            obj.setId_rol(rs.getLong("Id_rol"));
            obj.setId_sucursal(rs.getLong("id_sucursal"));
            obj.setId_matricula(rs.getLong("Id_matricula"));
            obj.setId_periodo(rs.getLong("Id_periodo"));
            obj.setMatricula_obs(rs.getString("Matricula_obs"));
            obj.setEstado_matricula(rs.getString("Estado_matricula"));
            obj.setPromedio_matricula(rs.getDouble("Promedio_matricula"));
            obj.setPeriodo(rs.getString("Periodo"));
            obj.setGraduado(rs.getString("Graduado"));
            obj.setDoc_escuela_ant(rs.getLong("Doc_escuela_ant"));
            obj.setPromedio_graduacion(rs.getDouble("Promedio_graduacion"));
            obj.setNombre_comercial_su(rs.getString("Nombre_comercial_su"));
            obj.setId_paralelo(rs.getLong("Id_paralelo"));
            obj.setParalelo(rs.getString("Paralelo"));
        } catch (SQLException ex) {
            Logger.getLogger(Mappers.class.getName()).log(Level.SEVERE, null, ex);
        }
        return obj;
    }
    
    public static precios getPreciosFromResultSet(ResultSet rs) {
        precios obj = new precios();
        try {
            obj.setId_precios(rs.getLong("id_precios"));
            obj.setCodigo(rs.getString("codigo"));
            obj.setValor(rs.getDouble("valor"));
            obj.setPromocion(rs.getString("promocion"));
            obj.setEstado_pre(rs.getString("estado_pre"));
            obj.setPago(rs.getString("pago"));

        } catch (SQLException ex) {
            Logger.getLogger(Mappers.class.getName()).log(Level.SEVERE, null, ex);
        }
        return obj;
    }
    
    public static precios getValorFromResultSet(ResultSet rs) {
        precios obj = new precios();
        try {
            obj.setValor(rs.getDouble("valor"));
        } catch (SQLException ex) {
            Logger.getLogger(Mappers.class.getName()).log(Level.SEVERE, null, ex);
        }
        return obj;
    }
    
    public static ma_mensualidad getMostrarmensualidadFromResultSet(ResultSet rs) {
        ma_mensualidad obj = new ma_mensualidad();
        try {
            obj.setMensualidad(rs.getLong("mensualidad"));
            obj.setIngreso(rs.getDouble("ingreso"));
            obj.setDeuda(rs.getDouble("deuda"));
            obj.setValor_ref(rs.getDouble("valor_ref"));
            obj.setTotal(rs.getDouble("total"));
            obj.setEstado(rs.getString("estado"));
            obj.setId_mensualidad(rs.getLong("id_mensualidad"));
            obj.setId_matricula(rs.getLong("id_matricula"));
        } catch (SQLException ex) {
            Logger.getLogger(Mappers.class.getName()).log(Level.SEVERE, null, ex);
        }
        return obj;
    }
    
    public static JoinMatriculas getMatriculasConductaFromResultSet(ResultSet rs) {
        JoinMatriculas obj = new JoinMatriculas();
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
            obj.setPartida_nacimiento(rs.getLong("Partida_nacimiento"));
            obj.setObservacion(rs.getString("Observacion"));
            obj.setUsuario(rs.getString("Usuario"));
            obj.setId_empresa(rs.getLong("Id_empresa"));
            obj.setNombre_comercial_em(rs.getString("Nombre_comercial_em"));
            obj.setRuc_em(rs.getString("ruc_em"));
            obj.setTelefono_em(rs.getString("telefono_em"));
            obj.setDireccion_em(rs.getString("direccion_em"));
            obj.setCorreo_em(rs.getString("correo_em"));
            obj.setEstado_em(rs.getString("estado_em"));
            obj.setId_sucursal(rs.getLong("id_sucursal"));
            obj.setNombre_comercial_su(rs.getString("nombre_comercial_su"));
            obj.setTelefono_su(rs.getString("telefono_su"));
            obj.setDireccion_su(rs.getString("direccion_su"));
            obj.setCorreo_su(rs.getString("correo_su"));
            obj.setEstado_su(rs.getString("estado_su"));
            obj.setId_matricula(rs.getLong("Id_matricula"));
            obj.setId_periodo(rs.getLong("Id_periodo"));
            obj.setId_paralelo(rs.getLong("Id_paralelo"));
            obj.setMatricula_obs(rs.getString("Matricula_obs"));
            obj.setEstado_matricula(rs.getString("Estado_matricula"));
            obj.setPromedio_matricula(rs.getDouble("Promedio_matricula"));
            obj.setParalelo(rs.getString("Paralelo"));
            obj.setPeriodo(rs.getString("Periodo"));
            obj.setCorreo_dos(rs.getString("Correo_dos"));
            obj.setGraduado(rs.getString("Graduado"));
            obj.setCedula_uno(rs.getString("Cedula_uno"));
            obj.setCedula_dos(rs.getString("Cedula_dos"));
            obj.setRepresentante(rs.getString("Representante"));
            obj.setRepresentante_dos(rs.getString("Representante_dos"));
            obj.setParentesco(rs.getString("Parentesco"));
            obj.setParentesco_dos(rs.getString("Parentesco_dos"));
            obj.setAnt_escuela(rs.getString("Ant_escuela"));
            obj.setValor_mat(rs.getDouble("valor_mat"));
            obj.setConducta_general(rs.getString("conducta_general"));
        } catch (SQLException ex) {
            Logger.getLogger(Mappers.class.getName()).log(Level.SEVERE, null, ex);
        }
        return obj;
    }
}
