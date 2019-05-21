/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SE.entidades.join;

/**
 *
 * @author carlos
 */
public class JoinMatriculas {
    public Long id_matricula;
    public Long id_usuario;
    public Long id_periodo;
    public Long id_paralelo;
    public String matricula_obs;
    public String estado_matricula;
    public Double promedio_matricula;
    private String apellidos_nombres;
    private String cedula;
    private String direccion;
    private String convecional;
    private String fecha_nacimiento;
    private String telefono_dos;
    private String correo;
    private String graduado;
    private String correo_dos;
    private String observacion;
    private String contrasena;
    private String usuario;
    private String estado;
    private Long copia_cedula;
    private Long servicio_basico;
    private Long partida_nacimiento;
    private Long id_rol;
    private String rol;
    private Long id_empresa;
    private String nombre_comercial_em;
    private String ruc_em;
    private String telefono_em;
    private String direccion_em;
    private String correo_em;
    private String estado_em;
    private Long id_sucursal;
    private String nombre_comercial_su;
    private String telefono_su;
    private String direccion_su;
    private String correo_su;
    private String estado_su;
    private String paralelo;
    private String periodo;
    private String cedula_uno;
    private String representante;
    private String representante_dos;
    private String cedula_dos;
    private String parentesco;
    private String parentesco_dos;
    private String ant_escuela;
    private Long doc_escuela_ant;
    private Long id_empleado;

    public JoinMatriculas() {
    }

    public JoinMatriculas(Long id_matricula, Long id_usuario, Long id_periodo, Long id_paralelo, String matricula_obs, String estado_matricula, Double promedio_matricula, String apellidos_nombres, String cedula, String direccion, String convecional, String fecha_nacimiento, String telefono_dos, String correo, String graduado, String correo_dos, String observacion, String contrasena, String usuario, String estado, Long copia_cedula, Long servicio_basico, Long partida_nacimiento, Long id_rol, String rol, Long id_empresa, String nombre_comercial_em, String ruc_em, String telefono_em, String direccion_em, String correo_em, String estado_em, Long id_sucursal, String nombre_comercial_su, String telefono_su, String direccion_su, String correo_su, String estado_su, String paralelo, String periodo, String cedula_uno, String representante, String representante_dos, String cedula_dos, String parentesco, String parentesco_dos, String ant_escuela, Long doc_escuela_ant, Long id_empleado) {
        this.id_matricula = id_matricula;
        this.id_usuario = id_usuario;
        this.id_periodo = id_periodo;
        this.id_paralelo = id_paralelo;
        this.matricula_obs = matricula_obs;
        this.estado_matricula = estado_matricula;
        this.promedio_matricula = promedio_matricula;
        this.apellidos_nombres = apellidos_nombres;
        this.cedula = cedula;
        this.direccion = direccion;
        this.convecional = convecional;
        this.fecha_nacimiento = fecha_nacimiento;
        this.telefono_dos = telefono_dos;
        this.correo = correo;
        this.graduado = graduado;
        this.correo_dos = correo_dos;
        this.observacion = observacion;
        this.contrasena = contrasena;
        this.usuario = usuario;
        this.estado = estado;
        this.copia_cedula = copia_cedula;
        this.servicio_basico = servicio_basico;
        this.partida_nacimiento = partida_nacimiento;
        this.id_rol = id_rol;
        this.rol = rol;
        this.id_empresa = id_empresa;
        this.nombre_comercial_em = nombre_comercial_em;
        this.ruc_em = ruc_em;
        this.telefono_em = telefono_em;
        this.direccion_em = direccion_em;
        this.correo_em = correo_em;
        this.estado_em = estado_em;
        this.id_sucursal = id_sucursal;
        this.nombre_comercial_su = nombre_comercial_su;
        this.telefono_su = telefono_su;
        this.direccion_su = direccion_su;
        this.correo_su = correo_su;
        this.estado_su = estado_su;
        this.paralelo = paralelo;
        this.periodo = periodo;
        this.cedula_uno = cedula_uno;
        this.representante = representante;
        this.representante_dos = representante_dos;
        this.cedula_dos = cedula_dos;
        this.parentesco = parentesco;
        this.parentesco_dos = parentesco_dos;
        this.ant_escuela = ant_escuela;
        this.doc_escuela_ant = doc_escuela_ant;
        this.id_empleado = id_empleado;
    }

    public Long getId_empleado() {
        return id_empleado;
    }

    public void setId_empleado(Long id_empleado) {
        this.id_empleado = id_empleado;
    }

    public Long getDoc_escuela_ant() {
        return doc_escuela_ant;
    }

    public void setDoc_escuela_ant(Long doc_escuela_ant) {
        this.doc_escuela_ant = doc_escuela_ant;
    }

    public String getCedula_uno() {
        return cedula_uno;
    }

    public void setCedula_uno(String cedula_uno) {
        this.cedula_uno = cedula_uno;
    }

    public String getRepresentante() {
        return representante;
    }

    public void setRepresentante(String representante) {
        this.representante = representante;
    }

    public String getRepresentante_dos() {
        return representante_dos;
    }

    public void setRepresentante_dos(String representante_dos) {
        this.representante_dos = representante_dos;
    }

    public String getCedula_dos() {
        return cedula_dos;
    }

    public void setCedula_dos(String cedula_dos) {
        this.cedula_dos = cedula_dos;
    }

    public String getParentesco() {
        return parentesco;
    }

    public void setParentesco(String parentesco) {
        this.parentesco = parentesco;
    }

    public String getParentesco_dos() {
        return parentesco_dos;
    }

    public void setParentesco_dos(String parentesco_dos) {
        this.parentesco_dos = parentesco_dos;
    }

    public String getAnt_escuela() {
        return ant_escuela;
    }

    public void setAnt_escuela(String ant_escuela) {
        this.ant_escuela = ant_escuela;
    }

    public Long getId_matricula() {
        return id_matricula;
    }

    public void setId_matricula(Long id_matricula) {
        this.id_matricula = id_matricula;
    }

    public Long getId_usuario() {
        return id_usuario;
    }

    public void setId_usuario(Long id_usuario) {
        this.id_usuario = id_usuario;
    }

    public Long getId_periodo() {
        return id_periodo;
    }

    public void setId_periodo(Long id_periodo) {
        this.id_periodo = id_periodo;
    }

    public Long getId_paralelo() {
        return id_paralelo;
    }

    public void setId_paralelo(Long id_paralelo) {
        this.id_paralelo = id_paralelo;
    }

    public String getMatricula_obs() {
        return matricula_obs;
    }

    public void setMatricula_obs(String matricula_obs) {
        this.matricula_obs = matricula_obs;
    }

    public String getEstado_matricula() {
        return estado_matricula;
    }

    public void setEstado_matricula(String estado_matricula) {
        this.estado_matricula = estado_matricula;
    }

    public Double getPromedio_matricula() {
        return promedio_matricula;
    }

    public void setPromedio_matricula(Double promedio_matricula) {
        this.promedio_matricula = promedio_matricula;
    }

    public String getApellidos_nombres() {
        return apellidos_nombres;
    }

    public void setApellidos_nombres(String apellidos_nombres) {
        this.apellidos_nombres = apellidos_nombres;
    }

    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getConvecional() {
        return convecional;
    }

    public void setConvecional(String convecional) {
        this.convecional = convecional;
    }

    public String getFecha_nacimiento() {
        return fecha_nacimiento;
    }

    public void setFecha_nacimiento(String fecha_nacimiento) {
        this.fecha_nacimiento = fecha_nacimiento;
    }

    public String getTelefono_dos() {
        return telefono_dos;
    }

    public void setTelefono_dos(String telefono_dos) {
        this.telefono_dos = telefono_dos;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getGraduado() {
        return graduado;
    }

    public void setGraduado(String graduado) {
        this.graduado = graduado;
    }

    public String getCorreo_dos() {
        return correo_dos;
    }

    public void setCorreo_dos(String correo_dos) {
        this.correo_dos = correo_dos;
    }

    public String getObservacion() {
        return observacion;
    }

    public void setObservacion(String observacion) {
        this.observacion = observacion;
    }

    public String getContrasena() {
        return contrasena;
    }

    public void setContrasena(String contrasena) {
        this.contrasena = contrasena;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public Long getCopia_cedula() {
        return copia_cedula;
    }

    public void setCopia_cedula(Long copia_cedula) {
        this.copia_cedula = copia_cedula;
    }

    public Long getServicio_basico() {
        return servicio_basico;
    }

    public void setServicio_basico(Long servicio_basico) {
        this.servicio_basico = servicio_basico;
    }

    public Long getPartida_nacimiento() {
        return partida_nacimiento;
    }

    public void setPartida_nacimiento(Long partida_nacimiento) {
        this.partida_nacimiento = partida_nacimiento;
    }

    public Long getId_rol() {
        return id_rol;
    }

    public void setId_rol(Long id_rol) {
        this.id_rol = id_rol;
    }

    public String getRol() {
        return rol;
    }

    public void setRol(String rol) {
        this.rol = rol;
    }

    public Long getId_empresa() {
        return id_empresa;
    }

    public void setId_empresa(Long id_empresa) {
        this.id_empresa = id_empresa;
    }

    public String getNombre_comercial_em() {
        return nombre_comercial_em;
    }

    public void setNombre_comercial_em(String nombre_comercial_em) {
        this.nombre_comercial_em = nombre_comercial_em;
    }

    public String getRuc_em() {
        return ruc_em;
    }

    public void setRuc_em(String ruc_em) {
        this.ruc_em = ruc_em;
    }

    public String getTelefono_em() {
        return telefono_em;
    }

    public void setTelefono_em(String telefono_em) {
        this.telefono_em = telefono_em;
    }

    public String getDireccion_em() {
        return direccion_em;
    }

    public void setDireccion_em(String direccion_em) {
        this.direccion_em = direccion_em;
    }

    public String getCorreo_em() {
        return correo_em;
    }

    public void setCorreo_em(String correo_em) {
        this.correo_em = correo_em;
    }

    public String getEstado_em() {
        return estado_em;
    }

    public void setEstado_em(String estado_em) {
        this.estado_em = estado_em;
    }

    public Long getId_sucursal() {
        return id_sucursal;
    }

    public void setId_sucursal(Long id_sucursal) {
        this.id_sucursal = id_sucursal;
    }

    public String getNombre_comercial_su() {
        return nombre_comercial_su;
    }

    public void setNombre_comercial_su(String nombre_comercial_su) {
        this.nombre_comercial_su = nombre_comercial_su;
    }

    public String getTelefono_su() {
        return telefono_su;
    }

    public void setTelefono_su(String telefono_su) {
        this.telefono_su = telefono_su;
    }

    public String getDireccion_su() {
        return direccion_su;
    }

    public void setDireccion_su(String direccion_su) {
        this.direccion_su = direccion_su;
    }

    public String getCorreo_su() {
        return correo_su;
    }

    public void setCorreo_su(String correo_su) {
        this.correo_su = correo_su;
    }

    public String getEstado_su() {
        return estado_su;
    }

    public void setEstado_su(String estado_su) {
        this.estado_su = estado_su;
    }

    public String getParalelo() {
        return paralelo;
    }

    public void setParalelo(String paralelo) {
        this.paralelo = paralelo;
    }

    public String getPeriodo() {
        return periodo;
    }

    public void setPeriodo(String periodo) {
        this.periodo = periodo;
    }
    
}
