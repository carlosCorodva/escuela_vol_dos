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
public class ca_parcial {
    private Long id_parcial;
    private String inicio;
    private String fin; 
    private Long quimestre;
    private Long id_creacion;
    private String f_creacion;
    private Long id_actualizacion;
    private String f_actualizacion;
    private String estado_parcial;

    public ca_parcial() {
    }

    public ca_parcial(Long id_parcial, String inicio, String fin, Long quimestre, Long id_creacion, String f_creacion, Long id_actualizacion, String f_actualizacion, String estado_parcial) {
        this.id_parcial = id_parcial;
        this.inicio = inicio;
        this.fin = fin;
        this.quimestre = quimestre;
        this.id_creacion = id_creacion;
        this.f_creacion = f_creacion;
        this.id_actualizacion = id_actualizacion;
        this.f_actualizacion = f_actualizacion;
        this.estado_parcial = estado_parcial;
    }

    public Long getId_parcial() {
        return id_parcial;
    }

    public void setId_parcial(Long id_parcial) {
        this.id_parcial = id_parcial;
    }

    public String getInicio() {
        return inicio;
    }

    public void setInicio(String inicio) {
        this.inicio = inicio;
    }

    public String getFin() {
        return fin;
    }

    public void setFin(String fin) {
        this.fin = fin;
    }

    public Long getQuimestre() {
        return quimestre;
    }

    public void setQuimestre(Long quimestre) {
        this.quimestre = quimestre;
    }

    public Long getId_creacion() {
        return id_creacion;
    }

    public void setId_creacion(Long id_creacion) {
        this.id_creacion = id_creacion;
    }

    public String getF_creacion() {
        return f_creacion;
    }

    public void setF_creacion(String f_creacion) {
        this.f_creacion = f_creacion;
    }

    public Long getId_actualizacion() {
        return id_actualizacion;
    }

    public void setId_actualizacion(Long id_actualizacion) {
        this.id_actualizacion = id_actualizacion;
    }

    public String getF_actualizacion() {
        return f_actualizacion;
    }

    public void setF_actualizacion(String f_actualizacion) {
        this.f_actualizacion = f_actualizacion;
    }

    public String getEstado_parcial() {
        return estado_parcial;
    }

    public void setEstado_parcial(String estado_parcial) {
        this.estado_parcial = estado_parcial;
    }
    
}
