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
public class us_permiso_empleado {
    private Long id_permiso;
    private Long id_usuario;
    private Long id_materia;
    private String estado_pe;

    public us_permiso_empleado() {
    }

    public us_permiso_empleado(Long id_permiso, Long id_usuario, Long id_materia, String estado_pe) {
        this.id_permiso = id_permiso;
        this.id_usuario = id_usuario;
        this.id_materia = id_materia;
        this.estado_pe = estado_pe;
    }

    public Long getId_permiso() {
        return id_permiso;
    }

    public void setId_permiso(Long id_permiso) {
        this.id_permiso = id_permiso;
    }

    public Long getId_usuario() {
        return id_usuario;
    }

    public void setId_usuario(Long id_usuario) {
        this.id_usuario = id_usuario;
    }

    public Long getId_materia() {
        return id_materia;
    }

    public void setId_materia(Long id_materia) {
        this.id_materia = id_materia;
    }

    public String getEstado_pe() {
        return estado_pe;
    }

    public void setEstado_pe(String estado_pe) {
        this.estado_pe = estado_pe;
    }
    
}
