/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SE.entidades.join;

import java.sql.Date;

/**
 *
 * @author carlos
 */
public class JoinEmpleados {
    private Long id_usuario;
    private String apellidos_nombres;
    private String cedula;
    private String direccion;
    private String convecional;
    private String fecha_nacimiento;
    private String telefono_dos;
    private String correo;
    private String contrasena;
    private String estado;
    private Long copia_cedula;
    private Long servicio_basico;
    private Long copia_titulo;
    private Long id_rol;
    private String rol;
    private String observacion;
    private Date fecha_nacimiento_date;

    public JoinEmpleados() {
    }

    public JoinEmpleados(Long id_usuario, String apellidos_nombres, String cedula, String direccion, String convecional, String fecha_nacimiento, String telefono_dos, String correo, String contrasena, String estado, Long copia_cedula, Long servicio_basico, Long copia_titulo, Long id_rol, String rol, String observacion, Date fecha_nacimiento_date) {
        this.id_usuario = id_usuario;
        this.apellidos_nombres = apellidos_nombres;
        this.cedula = cedula;
        this.direccion = direccion;
        this.convecional = convecional;
        this.fecha_nacimiento = fecha_nacimiento;
        this.telefono_dos = telefono_dos;
        this.correo = correo;
        this.contrasena = contrasena;
        this.estado = estado;
        this.copia_cedula = copia_cedula;
        this.servicio_basico = servicio_basico;
        this.copia_titulo = copia_titulo;
        this.id_rol = id_rol;
        this.rol = rol;
        this.observacion = observacion;
        this.fecha_nacimiento_date = fecha_nacimiento_date;
    }

    public Date getFecha_nacimiento_date() {
        return fecha_nacimiento_date;
    }

    public void setFecha_nacimiento_date(Date fecha_nacimiento_date) {
        this.fecha_nacimiento_date = fecha_nacimiento_date;
    }

    


    public Long getId_usuario() {
        return id_usuario;
    }

    public void setId_usuario(Long id_usuario) {
        this.id_usuario = id_usuario;
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

    public String getContrasena() {
        return contrasena;
    }

    public void setContrasena(String contrasena) {
        this.contrasena = contrasena;
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

    public Long getCopia_titulo() {
        return copia_titulo;
    }

    public void setCopia_titulo(Long copia_titulo) {
        this.copia_titulo = copia_titulo;
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

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getObservacion() {
        return observacion;
    }

    public void setObservacion(String observacion) {
        this.observacion = observacion;
    }

    public String getFecha_nacimiento() {
        return fecha_nacimiento;
    }

    public void setFecha_nacimiento(String fecha_nacimiento) {
        this.fecha_nacimiento = fecha_nacimiento;
    }
    
}
