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
public class JoinEmpresaSucursal {
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

    public JoinEmpresaSucursal() {
    }

    public JoinEmpresaSucursal(Long id_empresa, String nombre_comercial_em, String ruc_em, String telefono_em, String direccion_em, String correo_em, String estado_em, Long id_sucursal, String nombre_comercial_su, String telefono_su, String direccion_su, String correo_su, String estado_su) {
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
    
}
