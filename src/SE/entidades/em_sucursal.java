/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SE.entidades;

/**
 *
 * @author carlos
 */
public class em_sucursal {
    private Long id_sucursal;
    private Long id_empresa;
    private String nombre_comercial_su;
    private String telefono_su;
    private String direccion_su;
    private String correo_su;
    private Long usuario_creacion;
    private String fecha_creacion;
    private Long usuario_actualizacion;
    private String fecha_actualizacion;
    private String estado_su;
    private String provincia_suc;
    private String canton_suc;
    private String jornada;
    private String zona;
    private String distrito;
    private String circuito;

    public em_sucursal() {
    }

    public em_sucursal(Long id_sucursal, Long id_empresa, String nombre_comercial_su, String telefono_su, String direccion_su, String correo_su, Long usuario_creacion, String fecha_creacion, Long usuario_actualizacion, String fecha_actualizacion, String estado_su, String provincia_suc, String canton_suc, String jornada, String zona, String distrito, String circuito) {
        this.id_sucursal = id_sucursal;
        this.id_empresa = id_empresa;
        this.nombre_comercial_su = nombre_comercial_su;
        this.telefono_su = telefono_su;
        this.direccion_su = direccion_su;
        this.correo_su = correo_su;
        this.usuario_creacion = usuario_creacion;
        this.fecha_creacion = fecha_creacion;
        this.usuario_actualizacion = usuario_actualizacion;
        this.fecha_actualizacion = fecha_actualizacion;
        this.estado_su = estado_su;
        this.provincia_suc = provincia_suc;
        this.canton_suc = canton_suc;
        this.jornada = jornada;
        this.zona = zona;
        this.distrito = distrito;
        this.circuito = circuito;
    }

    public String getZona() {
        return zona;
    }

    public void setZona(String zona) {
        this.zona = zona;
    }

    public String getDistrito() {
        return distrito;
    }

    public void setDistrito(String distrito) {
        this.distrito = distrito;
    }

    public String getCircuito() {
        return circuito;
    }

    public void setCircuito(String circuito) {
        this.circuito = circuito;
    }

    public String getJornada() {
        return jornada;
    }

    public void setJornada(String jornada) {
        this.jornada = jornada;
    }

    public String getProvincia_suc() {
        return provincia_suc;
    }

    public void setProvincia_suc(String provincia_suc) {
        this.provincia_suc = provincia_suc;
    }

    public String getCanton_suc() {
        return canton_suc;
    }

    public void setCanton_suc(String canton_suc) {
        this.canton_suc = canton_suc;
    }

    public Long getId_sucursal() {
        return id_sucursal;
    }

    public void setId_sucursal(Long id_sucursal) {
        this.id_sucursal = id_sucursal;
    }

    public Long getId_empresa() {
        return id_empresa;
    }

    public void setId_empresa(Long id_empresa) {
        this.id_empresa = id_empresa;
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

    public Long getUsuario_creacion() {
        return usuario_creacion;
    }

    public void setUsuario_creacion(Long usuario_creacion) {
        this.usuario_creacion = usuario_creacion;
    }

    public String getFecha_creacion() {
        return fecha_creacion;
    }

    public void setFecha_creacion(String fecha_creacion) {
        this.fecha_creacion = fecha_creacion;
    }

    public Long getUsuario_actualizacion() {
        return usuario_actualizacion;
    }

    public void setUsuario_actualizacion(Long usuario_actualizacion) {
        this.usuario_actualizacion = usuario_actualizacion;
    }

    public String getFecha_actualizacion() {
        return fecha_actualizacion;
    }

    public void setFecha_actualizacion(String fecha_actualizacion) {
        this.fecha_actualizacion = fecha_actualizacion;
    }

    public String getEstado_su() {
        return estado_su;
    }

    public void setEstado_su(String estado_su) {
        this.estado_su = estado_su;
    }
    
}
