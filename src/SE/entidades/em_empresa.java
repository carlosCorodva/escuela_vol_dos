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
public class em_empresa {

    private Long id_empresa;
    private String nombre_comercial_em;
    private String ruc_em;
    private String telefono_em;
    private String direccion_em;
    private String correo_em;
    private Long usuario_creacion;
    private String fecha_creacion;
    private Long usuario_actualizacion;
    private String fecha_actualizacion;
    private String estado_em;
    private String provincia;
    private String canton;

    public em_empresa() {
    }

    public em_empresa(Long id_empresa, String nombre_comercial_em, String ruc_em, String telefono_em, String direccion_em, String correo_em, Long usuario_creacion, String fecha_creacion, Long usuario_actualizacion, String fecha_actualizacion, String estado_em, String provincia, String canton) {
        this.id_empresa = id_empresa;
        this.nombre_comercial_em = nombre_comercial_em;
        this.ruc_em = ruc_em;
        this.telefono_em = telefono_em;
        this.direccion_em = direccion_em;
        this.correo_em = correo_em;
        this.usuario_creacion = usuario_creacion;
        this.fecha_creacion = fecha_creacion;
        this.usuario_actualizacion = usuario_actualizacion;
        this.fecha_actualizacion = fecha_actualizacion;
        this.estado_em = estado_em;
        this.provincia = provincia;
        this.canton = canton;
    }

    public String getProvincia() {
        return provincia;
    }

    public void setProvincia(String provincia) {
        this.provincia = provincia;
    }

    public String getCanton() {
        return canton;
    }

    public void setCanton(String canton) {
        this.canton = canton;
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

    public String getEstado_em() {
        return estado_em;
    }

    public void setEstado_em(String estado_em) {
        this.estado_em = estado_em;
    }

}
