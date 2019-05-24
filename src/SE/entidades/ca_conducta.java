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
public class ca_conducta {
    private long id_conducta;
    private String conducta;
    private String referencia;
    private String descripcion;

    public ca_conducta() {
    }

    public ca_conducta(long id_conducta, String conducta, String referencia, String descripcion) {
        this.id_conducta = id_conducta;
        this.conducta = conducta;
        this.referencia = referencia;
        this.descripcion = descripcion;
    }

    public long getId_conducta() {
        return id_conducta;
    }

    public void setId_conducta(long id_conducta) {
        this.id_conducta = id_conducta;
    }

    public String getConducta() {
        return conducta;
    }

    public void setConducta(String conducta) {
        this.conducta = conducta;
    }

    public String getReferencia() {
        return referencia;
    }

    public void setReferencia(String referencia) {
        this.referencia = referencia;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
    
}
